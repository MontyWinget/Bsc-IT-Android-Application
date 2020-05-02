package com.example.bscit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PracticalsSem4Activity extends AppCompatActivity {

    Button btn_cj, btn_es, btn_st, btn_se, btn_cga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practicals_sem4);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_cj = (Button)findViewById(R.id.buttonCoreJavaPracticals);
        btn_es = (Button)findViewById(R.id.buttonEmbeddedSystemsPracticals);
        btn_st = (Button)findViewById(R.id.buttonStatisticalTechniquesPracticals);
        btn_se = (Button)findViewById(R.id.buttonSoftwareEngineeringPracticals);
        btn_cga = (Button)findViewById(R.id.buttonComputerGraphicsPracticals);

        btn_cj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent viewIntent =
//                        new Intent("android.intent.action.VIEW",
//                                Uri.parse("https://google.com"));
//                startActivity(viewIntent);
                Toast.makeText(PracticalsSem4Activity.this, "Not available", Toast.LENGTH_SHORT).show();
            }
        });

        btn_es.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1nR5KpaJzStpOdtdiQZ4CZ3PvRNUced2E"));
                startActivity(viewIntent);
            }
        });

        btn_st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent viewIntent =
//                        new Intent("android.intent.action.VIEW",
//                                Uri.parse("https://google.com"));
//                startActivity(viewIntent);
                Toast.makeText(PracticalsSem4Activity.this, "Not available", Toast.LENGTH_SHORT).show();
            }
        });

        btn_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent viewIntent =
//                        new Intent("android.intent.action.VIEW",
//                                Uri.parse("https://google.com"));
//                startActivity(viewIntent);
                Toast.makeText(PracticalsSem4Activity.this, "Not available", Toast.LENGTH_SHORT).show();
            }
        });

        btn_cga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent viewIntent =
//                        new Intent("android.intent.action.VIEW",
//                                Uri.parse("https://google.com"));
//                startActivity(viewIntent);
                Toast.makeText(PracticalsSem4Activity.this, "Not available", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
