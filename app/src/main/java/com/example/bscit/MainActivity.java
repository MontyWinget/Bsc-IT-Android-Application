package com.example.bscit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout drawer;

    BottomNavigationView bottomNavigationView;

    Button btn_notes, btn_syllabus, btn_previous, btn_model, btn_exam, btn_practicals;

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.nav_dashboard:
                break;

            case R.id.nav_about:
                Intent aboutIntent = new Intent(this, About.class);
                startActivity(aboutIntent);
                break;

            case R.id.nav_share:
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "https://drive.google.com/open?id=1g1SlLYOnqzXTOfINZAtR1eI34p3z0dTg";
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share using"));
                break;

            case R.id.nav_feedback:
                    Intent mailIntent = new Intent (Intent.ACTION_VIEW , Uri.parse("mailto:" + "bscapp0@gmail.com"));
                    mailIntent.putExtra(Intent.EXTRA_SUBJECT, "Contact");
                    startActivity(mailIntent);
                    break;
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.dashboard);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.dashboard:
                        break;
                    case R.id.video:
                        startActivity(new Intent(getApplicationContext()
                                ,Videos.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;
                    case R.id.blog:
                        startActivity(new Intent(getApplicationContext()
                                ,Blog.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;
                    case R.id.feedback:
                        startActivity(new Intent(getApplicationContext()
                                ,Feedback.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;
                }

                return false;
            }
        });

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        btn_notes = (Button)findViewById(R.id.buttonNotes);
        btn_syllabus = (Button)findViewById(R.id.buttonSyllabus);
        btn_previous = (Button)findViewById(R.id.buttonQues);
        btn_model = (Button)findViewById(R.id.buttonModel);
        btn_exam = (Button)findViewById(R.id.buttonExam);
        btn_practicals = (Button)findViewById(R.id.buttonPracticals);

        btn_notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NotesActivity.class);
                startActivity(intent);
            }
        });

        btn_syllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SyllabusActivity.class);
                startActivity(intent);
            }
        });

        btn_previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PreviousActivity.class);
                startActivity(intent);
            }
        });

        btn_model.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModelActivity.class);
                startActivity(intent);
            }
        });

        btn_exam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, ExamsActivity.class);
//                startActivity(intent);
                Toast.makeText(MainActivity.this, "Time-Table will be updated when Declared by the University", Toast.LENGTH_SHORT).show();
            }
        });

        btn_practicals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PracticalsActivity.class);
                startActivity(intent);
            }
        });

    }
    @Override
    public void onBackPressed() {
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
        Intent a = new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);
    }
}
