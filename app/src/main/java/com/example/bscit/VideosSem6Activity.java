package com.example.bscit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class VideosSem6Activity extends AppCompatActivity {

    Button sqa, sic, bi, gis, cl, prac_android, prac_gis, prac_sic, prac_bi;

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos_sem6);

        sqa = (Button)findViewById(R.id.buttonVidSoftwareQualityAssurance);
        sic = (Button)findViewById(R.id.buttonVidSecurityInComputing);
        bi = (Button)findViewById(R.id.buttonVidBusinessIntelligence);
        gis = (Button)findViewById(R.id.buttonVidGeographicInformationSystems);
        cl = (Button)findViewById(R.id.buttonVidCyberLaws);
        prac_bi = (Button)findViewById(R.id.buttonVidBiPrac);
        prac_gis = (Button)findViewById(R.id.buttonVidGisPrac);
        prac_android = (Button)findViewById(R.id.buttonVidAndroidPrac);
        prac_sic = (Button)findViewById(R.id.buttonVidSicPrac);

        sqa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideosSem6Activity.this, Sem6SQAActivity.class);
                startActivity(intent);
            }
        });

        sic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideosSem6Activity.this, Sem6SICActivity.class);
                startActivity(intent);
            }
        });

        bi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideosSem6Activity.this, Sem6BIActivity.class);
                startActivity(intent);
            }
        });

        gis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideosSem6Activity.this, Sem6GISActivity.class);
                startActivity(intent);
            }
        });

        cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideosSem6Activity.this, Sem6CLActivity.class);
                startActivity(intent);
            }
        });

        prac_sic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideosSem6Activity.this, Sem6SicPrac.class);
                startActivity(intent);
            }
        });

        prac_android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideosSem6Activity.this, Sem6AndroidPrac.class);
                startActivity(intent);
            }
        });

        prac_gis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideosSem6Activity.this, Sem6GisPrac.class);
                startActivity(intent);
            }
        });

        prac_bi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideosSem6Activity.this, Sem6BiPrac.class);
                startActivity(intent);
            }
        });

        bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.video);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.dashboard:
                        startActivity(new Intent(getApplicationContext()
                                ,MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.video:
                        return true;
                    case R.id.blog:
                        startActivity(new Intent(getApplicationContext()
                                ,Blog.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.feedback:
                        startActivity(new Intent(getApplicationContext()
                                ,Feedback.class));
                        overridePendingTransition(0, 0);
                        return true;
                }

                return false;
            }
        });
    }
}
