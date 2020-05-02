package com.example.bscit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PracticalsSem3Activity extends AppCompatActivity {

    Button btn_pp, btn_ds, btn_cn, btn_dbms, btn_am;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practicals_sem3);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_pp = (Button)findViewById(R.id.buttonPythonProgrammingPracticals);
        btn_ds = (Button)findViewById(R.id.buttonDataStructuresPracticals);
        btn_cn = (Button)findViewById(R.id.buttonComputerNetworksPracticals);
        btn_dbms = (Button)findViewById(R.id.buttonDatabaseManagementSystemsPracticals);
        btn_am = (Button)findViewById(R.id.buttonAppliedMathematicsPracticals);

        btn_pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent viewIntent =
//                        new Intent("android.intent.action.VIEW",
//                                Uri.parse("https://google.com"));
//                startActivity(viewIntent);
                Toast.makeText(PracticalsSem3Activity.this, "Not available", Toast.LENGTH_SHORT).show();
            }
        });

        btn_ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1aat2CPRDeczDpOrZoT0ORXlmpJN-qBPL"));
                startActivity(viewIntent);
            }
        });

        btn_cn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent viewIntent =
//                        new Intent("android.intent.action.VIEW",
//                                Uri.parse("https://google.com"));
//                startActivity(viewIntent);
                Toast.makeText(PracticalsSem3Activity.this, "Not available", Toast.LENGTH_SHORT).show();
            }
        });

        btn_dbms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent viewIntent =
//                        new Intent("android.intent.action.VIEW",
//                                Uri.parse("https://google.com"));
//                startActivity(viewIntent);
                Toast.makeText(PracticalsSem3Activity.this, "Not available", Toast.LENGTH_SHORT).show();
            }
        });

        btn_am.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent viewIntent =
//                        new Intent("android.intent.action.VIEW",
//                                Uri.parse("https://google.com"));
//                startActivity(viewIntent);
                Toast.makeText(PracticalsSem3Activity.this, "Not available", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
