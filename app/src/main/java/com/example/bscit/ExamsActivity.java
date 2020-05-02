package com.example.bscit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExamsActivity extends AppCompatActivity {

    Button btn_ett, btn_ptt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exams);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_ett = (Button)findViewById(R.id.buttonTimeTable);
        btn_ptt = (Button)findViewById(R.id.buttonPracticalsApril);

        btn_ett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1-2ltIqsSwf480SdpLzWSQhf3mQdSaGZ-"));
                startActivity(viewIntent);
            }
        });

        btn_ptt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1dk0aD5DmOC6sOhKHMDRO4vZMYBIWZOrO"));
                startActivity(viewIntent);
            }
        });
    }
}
