package com.example.bscit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PreviousSem3Activity extends AppCompatActivity {

    Button btn_pp, btn_ds, btn_cn, btn_dbms, btn_am;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_sem3);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_pp = (Button)findViewById(R.id.buttonPythonProgrammingPrevious);
        btn_ds = (Button)findViewById(R.id.buttonDataStructuresPrevious);
        btn_cn = (Button)findViewById(R.id.buttonComputerNetworksPrevious);
        btn_dbms = (Button)findViewById(R.id.buttonDatabaseManagementSystemsPrevious);
        btn_am = (Button)findViewById(R.id.buttonAppliedMathematicsPrevious);

        btn_pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=12Z5kob7FCQLkCHyuEQLE57fmHda6p2s_"));
                startActivity(viewIntent);
            }
        });

        btn_ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=12BN9KIH9ClK3X2_5mXvYaWWntX-RUrBW"));
                startActivity(viewIntent);
            }
        });

        btn_cn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=13API7DjzkY31cRoJWN4feAJCkMqUz5E-"));
                startActivity(viewIntent);
            }
        });

        btn_dbms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=13L9yv-N94NpSnyfvokmCnlY0hC3ffrHa"));
                startActivity(viewIntent);
            }
        });

        btn_am.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=13XA7isPf21rN1FEUxHa0sk8JC7FE6sM8"));
                startActivity(viewIntent);
            }
        });
    }
}
