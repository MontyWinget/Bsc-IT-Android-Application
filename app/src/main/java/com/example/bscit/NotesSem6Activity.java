package com.example.bscit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NotesSem6Activity extends AppCompatActivity {

    Button btn_sqa, btn_sic, btn_bi, btn_gis, btn_en, btn_itsm, btn_cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_sem6);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_sqa = (Button)findViewById(R.id.buttonSoftwareQualityAssurance);
        btn_sic = (Button)findViewById(R.id.buttonSecurityInComputing);
        btn_bi = (Button)findViewById(R.id.buttonBusinessIntelligence);
        btn_gis = (Button)findViewById(R.id.buttonGeographicInformationSystems);
        btn_en = (Button)findViewById(R.id.buttonEnterpriseNetworking);
        btn_itsm = (Button)findViewById(R.id.buttonITServiceManagement);
        btn_cl = (Button)findViewById(R.id.buttonCyberLaws);

       btn_sqa.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent viewIntent =
                       new Intent("android.intent.action.VIEW",
                               Uri.parse("https://drive.google.com/open?id=1Chac0keaFdGzZNcR0ohkQ72nbn3tyzGq"));
                       startActivity(viewIntent);

           }
       });

       btn_sic.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent viewIntent =
                       new Intent("android.intent.action.VIEW",
                               Uri.parse("https://drive.google.com/open?id=1CalnYdBaazo-pb7t3gge5M79xIxFi6Tf"));
               startActivity(viewIntent);
           }
       });

        btn_bi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1B-bkmEqIgTbIIHqiAuCawEbAaIjbHiwl"));
                startActivity(viewIntent);
            }
        });

        btn_gis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1BiPMHre-7O_jl8Yzz36I4mBXNJcYMs5A"));
                startActivity(viewIntent);
            }
        });

        btn_en.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1BhTwjti-Ccf4vzYdW2R7zZSmHbMNrujI"));
                startActivity(viewIntent);
            }
        });

        btn_itsm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1CU5Fb6FSkOIr5peXGDj7UnDHh8MUuwcP"));
                startActivity(viewIntent);
            }
        });

        btn_cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1B47_4Ni6HNHA2sO_q9nC1f4pUD56IYZg"));
                startActivity(viewIntent);
            }
        });
    }
}
