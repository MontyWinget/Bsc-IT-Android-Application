package com.example.bscit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NotesSem3Activity extends AppCompatActivity {

    Button btn_pp, btn_ds, btn_cn, btn_dbms, btn_am;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_sem3);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_pp = (Button)findViewById(R.id.buttonPythonProgramming);
        btn_ds = (Button)findViewById(R.id.buttonDataStructures);
        btn_cn = (Button)findViewById(R.id.buttonComputerNetworks);
        btn_dbms = (Button)findViewById(R.id.buttonDatabaseManagementSystems);
        btn_am = (Button)findViewById(R.id.buttonAppliedMathematics);

        btn_pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=19RQPVhJ6wOHXhszdyhHkz8kwdpNwDVgZ"));
                startActivity(viewIntent);
            }
        });

        btn_ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=166xZrTHruu17h_B1X1hBQAnt1X7rV590"));
                startActivity(viewIntent);
            }
        });

        btn_cn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=195OqTr1umRRc5edwyI-e_Y7-1wUxHSd1"));
                startActivity(viewIntent);
            }
        });

        btn_dbms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=19EGBjml0WS8gCTA5fizwTEYoxKF3EWWZ"));
                startActivity(viewIntent);
            }
        });

        btn_am.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=19-eNh4OoqKtoR9QBMV1FJlg4mU0WIRuO"));
                startActivity(viewIntent);
            }
        });
    }
}
