package com.example.bscit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PreviousSem6Activity extends AppCompatActivity {

    Button btn_sqa, btn_sic, btn_bi, btn_gis, btn_en, btn_itsm, btn_cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_sem6);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_sqa = (Button)findViewById(R.id.buttonSoftwareQualityAssurancePrevious);
        btn_sic = (Button)findViewById(R.id.buttonSecurityInComputingPrevious);
        btn_bi = (Button)findViewById(R.id.buttonBusinessIntelligencePrevious);
        btn_gis = (Button)findViewById(R.id.buttonGeographicInformationSystemsPrevious);
        btn_en = (Button)findViewById(R.id.buttonEnterpriseNetworkingPrevious);
        btn_itsm = (Button)findViewById(R.id.buttonITServiceManagementPrevious);
        btn_cl = (Button)findViewById(R.id.buttonCyberLawsPrevious);

        btn_sqa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1-cYAjCNyLDTlEFUCFWUeORJMlHLAamMf"));
                startActivity(viewIntent);
            }
        });

        btn_sic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1-TyvsVQOdvCA6R9V0TVDaFljpUC2Zza6"));
                startActivity(viewIntent);
            }
        });

        btn_bi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1-7VivR_14p5cUJ6XK_If3LHAMx4-YLDt"));
                startActivity(viewIntent);
            }
        });

        btn_gis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1-M_19-yx0kVwWAHcmzTMqjdlFA50vTDD"));
                startActivity(viewIntent);
            }
        });

        btn_en.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=11ucz847iieZMDTJZDFgY-XE9tEJDPprQ"));
                startActivity(viewIntent);
            }
        });

        btn_itsm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=123Hd72gUeoPYd96b6nrtxzud1Gg6JHdu"));
                startActivity(viewIntent);
            }
        });

        btn_cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1-MJ9_3GcIXx8_iR38Q8OUSWKRRhfPF9Q"));
                startActivity(viewIntent);
            }
        });
    }
}
