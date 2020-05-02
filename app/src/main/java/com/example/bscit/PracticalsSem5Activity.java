package com.example.bscit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PracticalsSem5Activity extends AppCompatActivity {

    Button btn_spm, btn_iot, btn_awp, btn_ai, btn_lsa, btn_ej, btn_ngt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practicals_sem5);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_spm = (Button)findViewById(R.id.buttonSoftwareProjectManagementPracticals);
        btn_iot = (Button)findViewById(R.id.buttonInternetOfThingsPracticals);
        btn_awp = (Button)findViewById(R.id.buttonAdvancedWebProgrammingPracticals);
        btn_ai = (Button)findViewById(R.id.buttonArtificialIntelligencePracticals);
        btn_lsa = (Button)findViewById(R.id.buttonLinuxSystemAdministrationPracticals);
        btn_ej = (Button)findViewById(R.id.buttonEnterpriseJavaPracticals);
        btn_ngt = (Button)findViewById(R.id.buttonNextGenerationTechnologiesPracticals);

        btn_spm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent viewIntent =
//                        new Intent("android.intent.action.VIEW",
//                                Uri.parse("https://google.com"));
//                startActivity(viewIntent);
                Toast.makeText(PracticalsSem5Activity.this, "Not available", Toast.LENGTH_SHORT).show();
            }
        });

        btn_iot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1ns5723-J61XjeS48MbRKHw15XMTvBoNP"));
                startActivity(viewIntent);
            }
        });

        btn_awp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1-A9wp7LUjKqw0w8a6Ot05Qyvr0KYIBVP"));
                startActivity(viewIntent);
            }
        });

        btn_ai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1yltZWnoz5EpuNNE6QHe1f_14JYMVoVj6"));
                startActivity(viewIntent);
            }
        });

        btn_lsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1vg4mTp9NXNpvOinMZHpEKRUMRpAiMHH6"));
                startActivity(viewIntent);
            }
        });

        btn_ej.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1u9VjX-lGk824_31Lg2ovOERfzGjTsWfD"));
                startActivity(viewIntent);
            }
        });

        btn_ngt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent viewIntent =
//                        new Intent("android.intent.action.VIEW",
//                                Uri.parse("https://google.com"));
//                startActivity(viewIntent);
                Toast.makeText(PracticalsSem5Activity.this, "Not available", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
