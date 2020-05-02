package com.example.bscit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ModelSem1Activity extends AppCompatActivity {

    Button btn_ip, btn_de, btn_os, btn_dm, btn_cs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_sem1);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_ip = (Button)findViewById(R.id.buttonImperativeProgrammingModel);
        btn_de = (Button)findViewById(R.id.buttonDigitalElectronicsModel);
        btn_os = (Button)findViewById(R.id.buttonOperatingSystemsModel);
        btn_dm = (Button)findViewById(R.id.buttonDiscreteMathematicsModel);
        btn_cs = (Button)findViewById(R.id.buttonCommunicationSkillsModel);

        btn_ip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://google.com"));
                startActivity(viewIntent);
            }
        });

        btn_de.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://google.com"));
                startActivity(viewIntent);
            }
        });

        btn_os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://google.com"));
                startActivity(viewIntent);
            }
        });

        btn_dm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://google.com"));
                startActivity(viewIntent);
            }
        });

        btn_cs.setOnClickListener(new View.OnClickListener() {
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
