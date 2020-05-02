package com.example.bscit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NotesSem4Activity extends AppCompatActivity {

    Button btn_cj, btn_es, btn_st, btn_se, btn_cga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_sem4);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_cj = (Button)findViewById(R.id.buttonCoreJava);
        btn_es = (Button)findViewById(R.id.buttonEmbeddedSystems);
        btn_st = (Button)findViewById(R.id.buttonStatisticalTechniques);
        btn_se = (Button)findViewById(R.id.buttonSoftwareEngineering);
        btn_cga = (Button)findViewById(R.id.buttonComputerGraphics);

        btn_cj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1A1oNPeVmQSAHuRpxcX5sfs-V37vU5wyk"));
                startActivity(viewIntent);
            }
        });

        btn_es.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1A7MT7RU4g02w86_ezU-Vbp0oCcm02SEM"));
                startActivity(viewIntent);
            }
        });

        btn_st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=19wlS334woWEMQFCnhgzlqmYzu5NJUoQ4"));
                startActivity(viewIntent);
            }
        });

        btn_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1AHwFBqWoIViitypz2rOehIoUkdI5FB20"));
                startActivity(viewIntent);
            }
        });

        btn_cga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=19oluGkLR7-au9GbHIYeNtF0ezfEwTknR"));
                startActivity(viewIntent);
            }
        });
    }
}
