package com.ivara.aravi.feedbackuser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    Firebase fb;

    final String url = "https://myloginpage-ccc11.firebaseio.com/";

    TextView t;

    Button ch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fb = new Firebase(url);

        ch = (Button)findViewById(R.id.pro);

        t = (TextView)findViewById(R.id.er);

        ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String enroll = t.getText().toString().trim();

                Firebase setter = fb.child("EnrollNo").child("/"+enroll);
                setter.setValue("1");
//                startActivity(new Intent(getApplicationContext(),MainGuard.class));
                Firebase tester = new Firebase(url+"TEST");


                tester.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {

                        String test = "1";



                        System.out.print("Aravi"+test);

                        if(test.equals(dataSnapshot.getValue()))
                        {
                            Toast.makeText(getApplicationContext(),"New FeedBack Form Available . . .",Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(),feedbackfilling.class));
                        }
                        else {
                            Toast.makeText(getApplicationContext(),"TEST FAILED",Toast.LENGTH_SHORT).show();
                        }

                    }

                    @Override
                    public void onCancelled(FirebaseError firebaseError) {

                    }
                });


            }
        });

    }
}
