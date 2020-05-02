package com.example.bscit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PreviousSem1Activity extends AppCompatActivity {

    Button btn_ip, btn_de, btn_os, btn_dm, btn_cs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_sem1);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_ip = (Button)findViewById(R.id.buttonImperativeProgrammingPrevious);
        btn_de = (Button)findViewById(R.id.buttonDigitalElectronicsPrevious);
        btn_os = (Button)findViewById(R.id.buttonOperatingSystemsPrevious);
        btn_dm = (Button)findViewById(R.id.buttonDiscreteMathematicsPrevious);
        btn_cs = (Button)findViewById(R.id.buttonCommunicationSkillsPrevious);

        btn_ip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=14jSdVENYwtrpn56MjdYoF9yuB2c2KtnQ"));
                startActivity(viewIntent);
            }
        });

        btn_de.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=163CCvfa96OC1qujxctK8YnXv-8eRAqY9"));
                startActivity(viewIntent);
            }
        });

        btn_os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=14TbFCopUQXs1i37fUVa3fCJ_izRFF7uP"));
                startActivity(viewIntent);
            }
        });

        btn_dm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=15X08wRVmgqaMYk5fp2M0z6qGcjlfWvn-"));
                startActivity(viewIntent);
            }
        });

        btn_cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=16SM-igkCX41tvHCjGkxuCZrAjp0f0x-o"));
                startActivity(viewIntent);
            }
        });

    }
}
