package com.example.bscit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PreviousSem5Activity extends AppCompatActivity {

    Button btn_spm, btn_iot, btn_awp, btn_ai, btn_lsa, btn_ej, btn_ngt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_sem5);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_spm = (Button)findViewById(R.id.buttonSoftwareProjectManagementPrevious);
        btn_iot = (Button)findViewById(R.id.buttonInternetOfThingsPrevious);
        btn_awp = (Button)findViewById(R.id.buttonAdvancedWebProgrammingPrevious);
        btn_ai = (Button)findViewById(R.id.buttonArtificialIntelligencePrevious);
        btn_lsa = (Button)findViewById(R.id.buttonLinuxSystemAdministrationPrevious);
        btn_ej = (Button)findViewById(R.id.buttonEnterpriseJavaPrevious);
        btn_ngt = (Button)findViewById(R.id.buttonNextGenerationTechnologiesPrevious);

        btn_spm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=10j5ulUGgH6OYzZsH97ply40zLhLaTwo0"));
                startActivity(viewIntent);
            }
        });

        btn_iot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=10UqBPqG7DkGM9eEAmuH5ZvG3yhpYNtzz"));
                startActivity(viewIntent);
            }
        });

        btn_awp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=10GY0kKCd-nuRwzbFpG0gur7M3HIZh_Fx"));
                startActivity(viewIntent);
            }
        });

        btn_ai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1-zvaKxUmlfZs6bPSVYUrEkAduW_LKwuT"));
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
                                Uri.parse("https://drive.google.com/open?id=10Zr3hUBRgl9p0Dta_pRRHn8G2Hs8ISn-"));
                startActivity(viewIntent);
            }
        });
    }
}
