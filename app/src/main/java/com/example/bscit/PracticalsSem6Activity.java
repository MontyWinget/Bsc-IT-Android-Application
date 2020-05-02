package com.example.bscit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PracticalsSem6Activity extends AppCompatActivity {

    Button btn_sqa, btn_sic, btn_bi, btn_gis, btn_en, btn_itsm, btn_cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practicals_sem6);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        btn_sqa = (Button)findViewById(R.id.buttonSoftwareQualityAssurancePracticals);
        btn_sic = (Button)findViewById(R.id.buttonSecurityInComputingPracticals);
        btn_bi = (Button)findViewById(R.id.buttonBusinessIntelligencePracticals);
        btn_gis = (Button)findViewById(R.id.buttonGeographicInformationSystemsPracticals);
        btn_en = (Button)findViewById(R.id.buttonEnterpriseNetworkingPracticals);
//        btn_itsm = (Button)findViewById(R.id.buttonITServiceManagementPracticals);
        btn_cl = (Button)findViewById(R.id.buttonCyberLawsPracticals);

//        btn_sqa.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent viewIntent =
//                        new Intent("android.intent.action.VIEW",
//                                Uri.parse("https://google.com"));
//                startActivity(viewIntent);
//            }
//        });

        btn_sic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1piNBDzokZ_LvYKZ-A39_ob-MRemlx3BE"));
                startActivity(viewIntent);
            }
        });

        btn_bi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=14-BogTf9JLithR1xhiu1BjqALeG_H2o9"));
                startActivity(viewIntent);
            }
        });

        btn_gis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=19YM9qAoElC7V_asQqpkDbik0saCYUwwF"));
                startActivity(viewIntent);
            }
        });

        btn_en.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1MFmexruWfOkVGhEJpbVbVd84izvzvr0T"));
                startActivity(viewIntent);
            }
        });

//        btn_itsm.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent viewIntent =
//                        new Intent("android.intent.action.VIEW",
//                                Uri.parse("https://google.com"));
//                startActivity(viewIntent);
//            }
//        });
//
        btn_cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://drive.google.com/open?id=1Ry8iPfgPKypu_DpfWyRuZyEqWMV01hkW"));
                startActivity(viewIntent);
            }
        });
    }
}
