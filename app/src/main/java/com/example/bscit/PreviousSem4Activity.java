package com.example.bscit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PreviousSem4Activity extends AppCompatActivity {

    Button btn_cj, btn_es, btn_st, btn_se, btn_cga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_sem4);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_cj = (Button)findViewById(R.id.buttonCoreJavaPrevious);
        btn_es = (Button)findViewById(R.id.buttonEmbeddedSystemsPrevious);
        btn_st = (Button)findViewById(R.id.buttonStatisticalTechniquesPrevious);
        btn_se = (Button)findViewById(R.id.buttonSoftwareEngineeringPrevious);
        btn_cga = (Button)findViewById(R.id.buttonComputerGraphicsPrevious);

        btn_cj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=10q6OHbUungYLL5I1uW7eBHk9T2QJK9Wl"));
                startActivity(viewIntent);
            }
        });

        btn_es.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=11mJnfp6m8lFbl-jsnreMiGLUUpNB8T4M"));
                startActivity(viewIntent);
            }
        });

        btn_st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=11Ag1J4gOGuBOoMYu_U0GKwXnNwAGSRb0"));
                startActivity(viewIntent);
            }
        });

        btn_se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=11F2PaZLfCIeAM2cPdhEkGcMipmNzWKj2"));
                startActivity(viewIntent);
            }
        });

        btn_cga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=10jxdrvLlBVCHA49T4jkN_yp88GZCOW7O"));
                startActivity(viewIntent);
            }
        });
    }
}
