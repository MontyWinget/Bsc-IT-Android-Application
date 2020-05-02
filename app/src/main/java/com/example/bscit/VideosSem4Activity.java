package com.example.bscit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class VideosSem4Activity extends AppCompatActivity {

    Button cj, es, st, se, cga;

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos_sem4);

        cj = (Button)findViewById(R.id.buttonVidCoreJava);
        es = (Button)findViewById(R.id.buttonVidEmbeddedSystems);
        st = (Button)findViewById(R.id.buttonVidStatisticalTechniques);
        se = (Button)findViewById(R.id.buttonVidSoftwareEngineering);
        cga = (Button)findViewById(R.id.buttonVidComputerGraphics);

        cj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideosSem4Activity.this, Sem4CJActivity.class);
                startActivity(intent);
            }
        });

        es.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideosSem4Activity.this, Sem4ESActivity.class);
                startActivity(intent);
            }
        });

        st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideosSem4Activity.this, Sem4STActivity.class);
                startActivity(intent);
            }
        });

        se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideosSem4Activity.this, Sem4SEActivity.class);
                startActivity(intent);
            }
        });

        cga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideosSem4Activity.this, Sem4CGAActivity.class);
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
