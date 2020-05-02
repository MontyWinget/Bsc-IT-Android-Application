package com.example.bscit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ModelSem6Activitty extends AppCompatActivity {

    Button btn_sqa, btn_sic, btn_bi, btn_gis, btn_en, btn_itsm, btn_cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_sem6_activitty);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_sqa = (Button)findViewById(R.id.buttonSoftwareQualityAssuranceModel);
        btn_sic = (Button)findViewById(R.id.buttonSecurityInComputingModel);
        btn_bi = (Button)findViewById(R.id.buttonBusinessIntelligenceModel);
//        btn_gis = (Button)findViewById(R.id.buttonGeographicInformationSystemsModel);
//        btn_en = (Button)findViewById(R.id.buttonEnterpriseNetworkingModel);
//        btn_itsm = (Button)findViewById(R.id.buttonITServiceManagementModel);
//        btn_cl = (Button)findViewById(R.id.buttonCyberLawsModel);

        btn_sqa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1zdYeAKIZlG7nDXvwIeDHorUb85yR9iDC"));
                startActivity(viewIntent);
            }
        });

        btn_sic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1oPi5F9m-4T_d10GYfOE1AJPzcodIU9Vr"));
                startActivity(viewIntent);
            }
        });

        btn_bi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1rOFKsAgmThUsZcAWdDt2Vtd9ZYXZQlpu"));
                startActivity(viewIntent);
            }
        });

//        btn_gis.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                Intent viewIntent =
////                        new Intent("android.intent.action.VIEW",
////                                Uri.parse("https://google.com"));
////                startActivity(viewIntent);
//                Toast.makeText(ModelSem6Activitty.this, "Not Available", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        btn_en.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                Intent viewIntent =
////                        new Intent("android.intent.action.VIEW",
////                                Uri.parse("https://google.com"));
////                startActivity(viewIntent);
//                Toast.makeText(ModelSem6Activitty.this, "Not Available", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        btn_itsm.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                Intent viewIntent =
////                        new Intent("android.intent.action.VIEW",
////                                Uri.parse("https://google.com"));
////                startActivity(viewIntent);
//                Toast.makeText(ModelSem6Activitty.this, "Not Available", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        btn_cl.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                Intent viewIntent =
////                        new Intent("android.intent.action.VIEW",
////                                Uri.parse("https://google.com"));
////                startActivity(viewIntent);
//                Toast.makeText(ModelSem6Activitty.this, "Not Available", Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}
