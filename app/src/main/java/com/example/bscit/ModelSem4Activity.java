package com.example.bscit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ModelSem4Activity extends AppCompatActivity {

    Button btn_cj, btn_es, btn_st, btn_se, btn_cga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_sem4);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_cj = (Button)findViewById(R.id.buttonCoreJavaModel);
        btn_es = (Button)findViewById(R.id.buttonEmbeddedSystemsModel);
        btn_st = (Button)findViewById(R.id.buttonStatisticalTechniquesModel);
        btn_se = (Button)findViewById(R.id.buttonSoftwareEngineeringModel);
        btn_cga = (Button)findViewById(R.id.buttonComputerGraphicsModel);

        btn_cj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://google.com"));
                startActivity(viewIntent);
            }
        });

        btn_es.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://google.com"));
                startActivity(viewIntent);
            }
        });

        btn_st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://google.com"));
                startActivity(viewIntent);
            }
        });

        btn_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://google.com"));
                startActivity(viewIntent);
            }
        });

        btn_cga.setOnClickListener(new View.OnClickListener() {
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
