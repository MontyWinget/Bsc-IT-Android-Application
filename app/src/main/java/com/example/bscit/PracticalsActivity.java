package com.example.bscit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PracticalsActivity extends AppCompatActivity {

    Button  btn_practicals_sem1, btn_practicals_sem2, btn_practicals_sem3, btn_practicals_sem4, btn_practicals_sem5, btn_practicals_sem6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practicals);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_practicals_sem1 = (Button)findViewById(R.id.buttonPracticalsSem1);
        btn_practicals_sem2 = (Button)findViewById(R.id.buttonPracticalsSem2);
        btn_practicals_sem3 = (Button)findViewById(R.id.buttonPracticalsSem3);
        btn_practicals_sem4 = (Button)findViewById(R.id.buttonPracticalsSem4);
        btn_practicals_sem5 = (Button)findViewById(R.id.buttonPracticalsSem5);
        btn_practicals_sem6 = (Button)findViewById(R.id.buttonPracticalsSem6);

        btn_practicals_sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PracticalsActivity.this, PracticalsSem1Activity.class);
                startActivity(intent);
                Toast.makeText(PracticalsActivity.this, "Practicals of Semester 1", Toast.LENGTH_SHORT).show();
            }
        });

        btn_practicals_sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PracticalsActivity.this, PracticalsSem2Activity.class);
                startActivity(intent);
                Toast.makeText(PracticalsActivity.this, "Practicals of Semester 2", Toast.LENGTH_SHORT).show();
            }
        });

        btn_practicals_sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PracticalsActivity.this, PracticalsSem3Activity.class);
                startActivity(intent);
                Toast.makeText(PracticalsActivity.this, "Practicals of Semester 3", Toast.LENGTH_SHORT).show();
            }
        });

        btn_practicals_sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PracticalsActivity.this, PracticalsSem4Activity.class);
                startActivity(intent);
                Toast.makeText(PracticalsActivity.this, "Practicals of Semester 4", Toast.LENGTH_SHORT).show();
            }
        });

        btn_practicals_sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PracticalsActivity.this, PracticalsSem5Activity.class);
                startActivity(intent);
                Toast.makeText(PracticalsActivity.this, "Practicals of Semester 5", Toast.LENGTH_SHORT).show();
            }
        });

        btn_practicals_sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PracticalsActivity.this, PracticalsSem6Activity.class);
                startActivity(intent);
                Toast.makeText(PracticalsActivity.this, "Practicals of Semester 6", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
