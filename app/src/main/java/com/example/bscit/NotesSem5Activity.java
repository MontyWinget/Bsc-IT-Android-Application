package com.example.bscit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NotesSem5Activity extends AppCompatActivity {

    Button btn_spm, btn_iot, btn_awp, btn_ai, btn_lsa, btn_ej, btn_ngt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_sem5);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_spm = (Button)findViewById(R.id.buttonSoftwareProjectManagement);
        btn_iot = (Button)findViewById(R.id.buttonInternetOfThings);
        btn_awp = (Button)findViewById(R.id.buttonAdvancedWebProgramming);
        btn_ai = (Button)findViewById(R.id.buttonArtificialIntelligence);
        btn_lsa = (Button)findViewById(R.id.buttonLinuxSystemAdministration);
        btn_ej = (Button)findViewById(R.id.buttonEnterpriseJava);
        btn_ngt = (Button)findViewById(R.id.buttonNextGenerationTechnologies);

        btn_spm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1AupuW_WTMd6Y_JTHOdzhIcEWzoXg4Ntl"));
                        startActivity(viewIntent);
            }
        });
        btn_iot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1AdSvOZjsh7DpHpKWdymn_nqp3Ic5fH1k"));
                startActivity(viewIntent);
            }
        });

        btn_awp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1A_g_zKymHadusTEaIBc4rh1HXXW0mLJL"));
                startActivity(viewIntent);
            }
        });

        btn_ai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1AVSmZv3z3v_Ae8fTxjeaRHCOjBX_yqPx"));
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
                                Uri.parse("https://drive.google.com/open?id=1AohEqAmVBQw79k-s-T7gBUPY51xxHIes"));
                startActivity(viewIntent);
            }
        });

    }
}
