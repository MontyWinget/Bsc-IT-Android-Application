package com.example.bscit;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SyllabusActivity extends AppCompatActivity {

    Button btn_fys, btn_sys, btn_tys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_fys = (Button)findViewById(R.id.buttonFirstYearSyllabus);
        btn_sys = (Button)findViewById(R.id.buttonSecondYearSyllabus);
        btn_tys = (Button)findViewById(R.id.buttonThirdYearSyllabus);

        btn_fys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1fT1yjPj1IZjHDm_KE1_-K4GnI8-Qa9Zy"));
                startActivity(viewIntent);
            }
        });

        btn_sys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1bKwqPFWv9BfEfsr3_7ASY-CP4kokdRPw"));
                startActivity(viewIntent);
            }
        });

        btn_tys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1VXWbqQq0kWVHk7PWgAtNbgEIZa5bvkso"));
                startActivity(viewIntent);
            }
        });
    }
}
