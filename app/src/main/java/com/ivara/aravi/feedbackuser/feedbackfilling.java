package com.ivara.aravi.feedbackuser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;

import com.firebase.client.Firebase;

public class feedbackfilling extends AppCompatActivity {

    Firebase fb;

    final String url = "https://myloginpage-ccc11.firebaseio.com/";

    TextView t1,t2,t3,t4,t5;

    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedbackfilling);
    }
}
