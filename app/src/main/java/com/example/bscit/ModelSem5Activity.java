package com.example.bscit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ModelSem5Activity extends AppCompatActivity {

    Button btn_spm, btn_iot, btn_awp, btn_ai, btn_lsa, btn_ej, btn_ngt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_sem5);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_spm = (Button)findViewById(R.id.buttonSoftwareProjectManagementModel);
        btn_iot = (Button)findViewById(R.id.buttonInternetOfThingsModel);
        btn_awp = (Button)findViewById(R.id.buttonAdvancedWebProgrammingModel);
        btn_ai = (Button)findViewById(R.id.buttonArtificialIntelligenceModel);
        btn_lsa = (Button)findViewById(R.id.buttonLinuxSystemAdministrationModel);
        btn_ej = (Button)findViewById(R.id.buttonEnterpriseJavaModel);
        btn_ngt = (Button)findViewById(R.id.buttonNextGenerationTechnologiesModel);

        btn_spm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://google.com"));
                startActivity(viewIntent);
            }
        });

        btn_iot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://google.com"));
                startActivity(viewIntent);
            }
        });

        btn_awp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://google.com"));
                startActivity(viewIntent);
            }
        });

        btn_ai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://google.com"));
                startActivity(viewIntent);
            }
        });

        btn_lsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://google.com"));
                startActivity(viewIntent);
            }
        });

        btn_ej.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://google.com"));
                startActivity(viewIntent);
            }
        });

        btn_ngt.setOnClickListener(new View.OnClickListener() {
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
