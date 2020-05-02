package com.example.bscit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NotesSem1Activity extends AppCompatActivity {

    Button btn_ip, btn_de, btn_os, btn_dm, btn_cs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_sem1);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_ip = (Button)findViewById(R.id.buttonImperativeProgramming);
        btn_de = (Button)findViewById(R.id.buttonDigitalElectronics);
        btn_os = (Button)findViewById(R.id.buttonOperatingSystems);
        btn_dm = (Button)findViewById(R.id.buttonDiscreteMathematics);
        btn_cs = (Button)findViewById(R.id.buttonCommunicationSkills);

        btn_ip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1Rjl4ZaLxdgWon0exRsdty_9g9yyaki5U"));
                startActivity(viewIntent);
            }
        });

        btn_de.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=16vKfsvEqsroXG8R7UhUdoHJF9Fl4TnE6"));
                startActivity(viewIntent);
            }
        });

        btn_os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=17Xd1P4doQSDs6BlQAg4Xffk8tyMJDzQM"));
                startActivity(viewIntent);
            }
        });

        btn_dm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=179Ie0Y105_oIqz19pLte8WnYoIiigIff"));
                startActivity(viewIntent);
            }
        });

        btn_cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=16gzl7tyghNS361j6b64JSoLoBhMP9rZ2"));
                startActivity(viewIntent);
            }
        });

    }
}
