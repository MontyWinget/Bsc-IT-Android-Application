package com.example.bscit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class VideosSem1Activity extends AppCompatActivity {

    Button imp, de, cs, os, dm;

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos_sem1);

        imp = (Button)findViewById(R.id.buttonVidImperativeProgramming);
        de = (Button)findViewById(R.id.buttonVidDigitalElectronics);
        os = (Button)findViewById(R.id.buttonVidOperatingSystems);
        dm = (Button)findViewById(R.id.buttonVidDiscreteMathematics);
        cs = (Button)findViewById(R.id.buttonVidCommunicationSkills);

        imp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideosSem1Activity.this, IMPActivity.class);
                startActivity(intent);
            }
        });

        de.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideosSem1Activity.this, DEActivity.class);
                startActivity(intent);
            }
        });

        os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideosSem1Activity.this, OSActivity.class);
                startActivity(intent);
            }
        });

        dm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideosSem1Activity.this, DMMain2Activity.class);
                startActivity(intent);
            }
        });

        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideosSem1Activity.this, CSActivity.class);
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
