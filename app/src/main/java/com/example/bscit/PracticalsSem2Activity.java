package com.example.bscit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PracticalsSem2Activity extends AppCompatActivity {

    Button btn_orp, btn_mpa, btn_wp, btn_nsm, btn_gc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practicals_sem2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_orp = (Button)findViewById(R.id.buttonObjectOrientedProgrammingPracticals);
        btn_mpa = (Button)findViewById(R.id.buttonMicroProcessorArchitecturePracticals);
        btn_wp = (Button)findViewById(R.id.buttonWebProgrammingPracticals);
        btn_nsm = (Button)findViewById(R.id.buttonNumericalStatisticalMethodsPracticals);
        btn_gc = (Button)findViewById(R.id.buttonGreenComputingPracticals);

        btn_orp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1J20A99l5gEZTtEvHz2RoN2UffCQSD06x"));
                startActivity(viewIntent);
            }
        });

        btn_mpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent viewIntent =
//                        new Intent("android.intent.action.VIEW",
//                                Uri.parse("https://google.com"));
//                startActivity(viewIntent);
                Toast.makeText(PracticalsSem2Activity.this, "Not available", Toast.LENGTH_SHORT).show();
            }
        });

        btn_wp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent viewIntent =
//                        new Intent("android.intent.action.VIEW",
//                                Uri.parse("https://google.com"));
//                startActivity(viewIntent);
                Toast.makeText(PracticalsSem2Activity.this, "Not available", Toast.LENGTH_SHORT).show();
            }
        });

        btn_nsm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent viewIntent =
//                        new Intent("android.intent.action.VIEW",
//                                Uri.parse("https://google.com"));
//                startActivity(viewIntent);
                Toast.makeText(PracticalsSem2Activity.this, "Not available", Toast.LENGTH_SHORT).show();
            }
        });

        btn_gc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent viewIntent =
//                        new Intent("android.intent.action.VIEW",
//                                Uri.parse("https://google.com"));
//                startActivity(viewIntent);
                Toast.makeText(PracticalsSem2Activity.this, "Not available", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
