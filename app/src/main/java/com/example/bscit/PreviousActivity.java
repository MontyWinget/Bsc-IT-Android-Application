package com.example.bscit;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PreviousActivity extends AppCompatActivity {

    Button btn_previous_sem1, btn_previous_sem2, btn_previous_sem3, btn_previous_sem4, btn_previous_sem5, btn_previous_sem6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_previous_sem1 = (Button)findViewById(R.id.buttonPreviousSem1);
        btn_previous_sem2 = (Button)findViewById(R.id.buttonPreviousSem2);
        btn_previous_sem3 = (Button)findViewById(R.id.buttonPreviousSem3);
        btn_previous_sem4 = (Button)findViewById(R.id.buttonPreviousSem4);
        btn_previous_sem5 = (Button)findViewById(R.id.buttonPreviousSem5);
        btn_previous_sem6 = (Button)findViewById(R.id.buttonPreviousSem6);

        btn_previous_sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreviousActivity.this, PreviousSem1Activity.class);
                startActivity(intent);
                Toast.makeText(PreviousActivity.this, "Question Papers of Sem 1 ", Toast.LENGTH_SHORT).show();
            }
        });

        btn_previous_sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreviousActivity.this, PreviousSem1Activity.class);
                startActivity(intent);
                Toast.makeText(PreviousActivity.this, "Question Papers of Sem 1 ", Toast.LENGTH_SHORT).show();
            }
        });

        btn_previous_sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreviousActivity.this, PreviousSem2Activity.class);
                startActivity(intent);
                Toast.makeText(PreviousActivity.this, "Question Papers of Sem 2 ", Toast.LENGTH_SHORT).show();
            }
        });

        btn_previous_sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreviousActivity.this, PreviousSem3Activity.class);
                startActivity(intent);
                Toast.makeText(PreviousActivity.this, "Question Papers of Sem 3 ", Toast.LENGTH_SHORT).show();
            }
        });

        btn_previous_sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreviousActivity.this, PreviousSem4Activity.class);
                startActivity(intent);
                Toast.makeText(PreviousActivity.this, "Question Papers of Sem 4 ", Toast.LENGTH_SHORT).show();
            }
        });

        btn_previous_sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreviousActivity.this, PreviousSem5Activity.class);
                startActivity(intent);
                Toast.makeText(PreviousActivity.this, "Question Papers of Sem 5 ", Toast.LENGTH_SHORT).show();
            }
        });

        btn_previous_sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreviousActivity.this, PreviousSem6Activity.class);
                startActivity(intent);
                Toast.makeText(PreviousActivity.this, "Question Papers of Sem 6 ", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
