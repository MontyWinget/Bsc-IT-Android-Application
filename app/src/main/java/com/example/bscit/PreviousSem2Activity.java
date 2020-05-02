package com.example.bscit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PreviousSem2Activity extends AppCompatActivity {

    Button btn_orp, btn_mpa, btn_wp, btn_nsm, btn_gc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_sem2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_orp = (Button)findViewById(R.id.buttonObjectOrientedProgrammingPrevious);
        btn_mpa = (Button)findViewById(R.id.buttonMicroProcessorArchitecturePrevious);
        btn_wp = (Button)findViewById(R.id.buttonWebProgrammingPrevious);
        btn_nsm = (Button)findViewById(R.id.buttonNumericalStatisticalMethodsPrevious);
        btn_gc = (Button)findViewById(R.id.buttonGreenComputingPrevious);

        btn_orp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=14CvITg6l-IkOgmi5T6qR5bVFtpQ-QeZu"));
                startActivity(viewIntent);
            }
        });

        btn_mpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=14-LiqjIgZ7W4xHsjcgnrTx4tFW4mwz9j"));
                startActivity(viewIntent);
            }
        });

        btn_wp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=14QK10LAm6VXPEJhSYB8r0Cup2XLFpgtu"));
                startActivity(viewIntent);
            }
        });

        btn_nsm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=148aZbW0yScI8yIiCajUrqNj3bH4Ro1oB"));
                startActivity(viewIntent);
            }
        });

        btn_gc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=13mwpUkM1t83xzmgC3kdL67yBVqIBUvMN"));
                startActivity(viewIntent);
            }
        });
    }
}
