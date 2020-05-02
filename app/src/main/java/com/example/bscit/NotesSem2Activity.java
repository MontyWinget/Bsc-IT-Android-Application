package com.example.bscit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NotesSem2Activity extends AppCompatActivity {

    Button btn_oop, btn_mpa, btn_wp, btn_nsm, btn_gc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_sem2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_oop = (Button)findViewById(R.id.buttonObjectOrientedProgramming);
        btn_mpa = (Button)findViewById(R.id.buttonMicroProcessorArchitecture);
        btn_wp = (Button)findViewById(R.id.buttonWebProgramming);
        btn_nsm = (Button)findViewById(R.id.buttonNumericalStatisticalMethods);
        btn_gc = (Button)findViewById(R.id.buttonGreenComputing);

        btn_oop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=18m_K9o0kLXqB9HdiuuJJdjycrM6d6GNp"));
                startActivity(viewIntent);
            }
        });

        btn_mpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=18VmI4CaxUbyc28CAjz1Lf1n6Plobll13"));
                startActivity(viewIntent);
            }
        });

        btn_wp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=18rAzezaIz8cPrNd25an7-VyhofHL5zRX"));
                startActivity(viewIntent);
            }
        });

        btn_nsm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=18bpqp1_lLLWamSCpccTPp2s_imM8tG8G"));
                startActivity(viewIntent);
            }
        });

        btn_gc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=18OQnIWV99R2vqInHPLo5AsugB6f5-R_v"));
                startActivity(viewIntent);
            }
        });
    }
}
