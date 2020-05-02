package com.example.bscit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class VideosSem2Activity extends AppCompatActivity {

    Button oop, mpa, wp, nsm, gc;

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos_sem2);

        oop = (Button)findViewById(R.id.buttonVidObjectOrientedProgramming);
        mpa= (Button)findViewById(R.id.buttonVidMicroProcessorArchitecture);
        wp = (Button)findViewById(R.id.buttonVidWebProgramming);
        nsm = (Button)findViewById(R.id.buttonVidNumericalStatisticalMethods);
        gc = (Button)findViewById(R.id.buttonVidGreenComputing);

        oop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideosSem2Activity.this, Sem2OOPActivity.class);
                startActivity(intent);
            }
        });

        mpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideosSem2Activity.this, Sem2MPAActivity.class);
                startActivity(intent);
            }
        });

        wp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideosSem2Activity.this, Sem2WPActivity.class);
                startActivity(intent);
            }
        });

        nsm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideosSem2Activity.this, Sem2NSMActivity.class);
                startActivity(intent);
            }
        });

        gc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideosSem2Activity.this, Sem2GCActivity.class);
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
