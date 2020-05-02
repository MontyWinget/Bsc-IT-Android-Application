package com.example.bscit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PracticalsSem1Activity extends AppCompatActivity {

    Button btn_ip, btn_de, btn_os, btn_dm, btn_cs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practicals_sem1);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_ip = (Button)findViewById(R.id.buttonImperativeProgrammingPracticals);
        btn_de = (Button)findViewById(R.id.buttonDigitalElectronicsPracticals);
        btn_os = (Button)findViewById(R.id.buttonOperatingSystemsPracticals);
        btn_dm = (Button)findViewById(R.id.buttonDiscreteMathematicsPracticals);
        btn_cs = (Button)findViewById(R.id.buttonCommunicationSkillsPracticals);

        btn_ip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1g-4QTHKeFT_JnfE1XQvhgF10iuTJkPHb"));
                startActivity(viewIntent);
            }
        });

        btn_de.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1u7anWUvff9eKN9LEYRsFMzY5wTNy9PRv"));
                startActivity(viewIntent);
            }
        });

        btn_os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent viewIntent =
//                        new Intent("android.intent.action.VIEW",
//                                Uri.parse("https://google.com"));
//                startActivity(viewIntent);
                Toast.makeText(PracticalsSem1Activity.this, "Not available", Toast.LENGTH_SHORT).show();
            }
        });

        btn_dm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1PWLlMFz1A_7kAcJ6j19skGk8dnRbaHQN"));
                startActivity(viewIntent);
            }
        });

        btn_cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent viewIntent =
//                        new Intent("android.intent.action.VIEW",
//                                Uri.parse("https://google.com"));
//                startActivity(viewIntent);
                Toast.makeText(PracticalsSem1Activity.this, "Not available", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
