package com.example.bscit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ModelSem2Activity extends AppCompatActivity {

    Button btn_orp, btn_mpa, btn_wp, btn_nsm, btn_gc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_sem2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_orp = (Button)findViewById(R.id.buttonObjectOrientedProgrammingModel);
        btn_mpa = (Button)findViewById(R.id.buttonMicroProcessorArchitectureModel);
        btn_wp = (Button)findViewById(R.id.buttonWebProgrammingModel);
        btn_nsm = (Button)findViewById(R.id.buttonNumericalStatisticalMethodsModel);
        btn_gc = (Button)findViewById(R.id.buttonGreenComputingModel);

        btn_orp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://google.com"));
                startActivity(viewIntent);
            }
        });

        btn_mpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://google.com"));
                startActivity(viewIntent);
            }
        });

        btn_wp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://google.com"));
                startActivity(viewIntent);
            }
        });

        btn_nsm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://google.com"));
                startActivity(viewIntent);
            }
        });

        btn_gc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://google.com"));
                startActivity(viewIntent);
            }
        });
    }
}
