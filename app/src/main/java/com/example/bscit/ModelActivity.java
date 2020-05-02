package com.example.bscit;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ModelActivity extends AppCompatActivity {

    Button btn_model_sem_1, btn_model_sem_2, btn_model_sem_3, btn_model_sem_4, btn_model_sem_5, btn_model_sem_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_model_sem_1 = (Button)findViewById(R.id.buttonModelSem1);
        btn_model_sem_2 = (Button)findViewById(R.id.buttonModelSem2);
        btn_model_sem_3 = (Button)findViewById(R.id.buttonModelSem3);
        btn_model_sem_4 = (Button)findViewById(R.id.buttonModelSem4);
        btn_model_sem_5 = (Button)findViewById(R.id.buttonModelSem5);
        btn_model_sem_6 = (Button)findViewById(R.id.buttonModelSem6);

        btn_model_sem_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(ModelActivity.this, ModelSem1Activity.class);
//                startActivity(intent);
                Toast.makeText(ModelActivity.this, "Not Available Soon will be updated", Toast.LENGTH_LONG).show();
            }
        });

        btn_model_sem_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(ModelActivity.this, ModelSem2Activity.class);
//                startActivity(intent);
                Toast.makeText(ModelActivity.this, "Not Available Soon will be updated", Toast.LENGTH_LONG).show();
            }
        });

        btn_model_sem_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(ModelActivity.this, ModelSem3Activity.class);
//                startActivity(intent);
                Toast.makeText(ModelActivity.this, "Not Available Soon will be updated", Toast.LENGTH_LONG).show();
            }
        });

        btn_model_sem_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(ModelActivity.this, ModelSem4Activity.class);
//                startActivity(intent);
                Toast.makeText(ModelActivity.this, "Not Available Soon will be updated", Toast.LENGTH_LONG).show();
            }
        });

        btn_model_sem_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(ModelActivity.this, ModelSem5Activity.class);
//                startActivity(intent);
                Toast.makeText(ModelActivity.this, "Not Available Soon will be updated", Toast.LENGTH_LONG).show();
            }
        });

        btn_model_sem_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModelActivity.this, ModelSem6Activitty.class);
                startActivity(intent);
//                Toast.makeText(ModelActivity.this, "Question Bank for Sem 6", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
