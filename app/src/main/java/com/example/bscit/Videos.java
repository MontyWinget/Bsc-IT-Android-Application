package com.example.bscit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Videos extends AppCompatActivity {

    Button btn_vid_sem_1, btn_vid_sem_2, btn_vid_sem_3, btn_vid_sem_4, btn_vid_sem_5, btn_vid_sem_6;

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);

        btn_vid_sem_1 = (Button) findViewById(R.id.buttonVideosSem1);
        btn_vid_sem_2 = (Button) findViewById(R.id.buttonVideosSem2);
        btn_vid_sem_3 = (Button) findViewById(R.id.buttonVideosSem3);
        btn_vid_sem_4 = (Button) findViewById(R.id.buttonVideosSem4);
        btn_vid_sem_5 = (Button) findViewById(R.id.buttonVideosSem5);
        btn_vid_sem_6 = (Button) findViewById(R.id.buttonVideosSem6);

        btn_vid_sem_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Videos.this, VideosSem1Activity.class);
                startActivity(intent);
            }
        });

        btn_vid_sem_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Videos.this, VideosSem2Activity.class);
                startActivity(intent);
            }
        });

        btn_vid_sem_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Videos.this, VideosSem3Activity.class);
                startActivity(intent);
            }
        });

        btn_vid_sem_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Videos.this, VideosSem4Activity.class);
                startActivity(intent);
            }
        });

        btn_vid_sem_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Videos.this, VideosSem5Activity.class);
                startActivity(intent);
            }
        });

        btn_vid_sem_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Videos.this, VideosSem6Activity.class);
                startActivity(intent);
            }
        });

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.video);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.dashboard:
                        startActivity(new Intent(getApplicationContext()
                                , MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.video:
                        return true;
                    case R.id.blog:
                        startActivity(new Intent(getApplicationContext()
                                , Blog.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.feedback:
                        startActivity(new Intent(getApplicationContext()
                                , Feedback.class));
                        overridePendingTransition(0, 0);
                        return true;
                }

                return false;
            }
        });
    }

    @Override
    public void onBackPressed() {
        // code here to show dialog
        startActivity(new Intent(getApplicationContext()
                ,MainActivity.class));
        overridePendingTransition(0, 0);
        finish();
    }
}
