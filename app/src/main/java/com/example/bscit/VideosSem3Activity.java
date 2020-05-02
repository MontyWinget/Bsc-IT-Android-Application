package com.example.bscit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class VideosSem3Activity extends AppCompatActivity {

    Button pp, ds, cn, dbms, am;

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos_sem3);

        pp = (Button)findViewById(R.id.buttonVidPythonProgramming);
        ds = (Button)findViewById(R.id.buttonVidDataStructures);
        cn = (Button)findViewById(R.id.buttonVidComputerNetworks);
        dbms = (Button)findViewById(R.id.buttonVidDatabaseManagementSystems);
        am = (Button)findViewById(R.id.buttonVidAppliedMathematics);

        pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideosSem3Activity.this, Sem3PPActivity.class);
                startActivity(intent);
            }
        });

        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideosSem3Activity.this, Sem3DSActivity.class);
                startActivity(intent);
            }
        });

        cn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideosSem3Activity.this, Sem3CNActivity.class);
                startActivity(intent);
            }
        });

        dbms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(VideosSem3Activity.this, Sem3DBMSActivity.class);
                startActivity(intent);
            }
        });

        am.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideosSem3Activity.this, Sem3AMActivity.class);
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
