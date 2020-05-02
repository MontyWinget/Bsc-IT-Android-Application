package com.example.bscit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class VideosSem5Activity extends AppCompatActivity {

    Button spm, iot, awp, ai, ngt;

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos_sem5);

        spm = (Button)findViewById(R.id.buttonVidSoftwareProjectManagement);
        iot = (Button)findViewById(R.id.buttonVidInternetOfThings);
        awp = (Button)findViewById(R.id.buttonVidAdvancedWebProgramming);
        ai = (Button)findViewById(R.id.buttonVidArtificialIntelligence);
        ngt = (Button)findViewById(R.id.buttonVidNextGenerationTechnologies);

        spm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideosSem5Activity.this, Sem5SPMActivity.class);
                startActivity(intent);
            }
        });

        iot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideosSem5Activity.this, Sem5IOTActivity.class);
                startActivity(intent);
            }
        });

        awp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideosSem5Activity.this, Sem5AWPActivity.class);
                startActivity(intent);
            }
        });

        ai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideosSem5Activity.this, Sem5AIActivity.class);
                startActivity(intent);
            }
        });

        ngt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideosSem5Activity.this, Sem5NGTActivity.class);
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
