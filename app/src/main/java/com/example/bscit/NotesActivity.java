package com.example.bscit;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NotesActivity extends AppCompatActivity {

    Button btn_notes_sem_1, btn_notes_sem_2, btn_notes_sem_3, btn_notes_sem_4, btn_notes_sem_5, btn_notes_sem_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_notes_sem_1 = (Button)findViewById(R.id.buttonNotesSem1);
        btn_notes_sem_2 = (Button)findViewById(R.id.buttonNotesSem2);
        btn_notes_sem_3 = (Button)findViewById(R.id.buttonNotesSem3);
        btn_notes_sem_4 = (Button)findViewById(R.id.buttonNotesSem4);
        btn_notes_sem_5 = (Button)findViewById(R.id.buttonNotesSem5);
        btn_notes_sem_6 = (Button)findViewById(R.id.buttonNotesSem6);

        btn_notes_sem_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NotesActivity.this, NotesSem1Activity.class);
                startActivity(intent);
                Toast.makeText(NotesActivity.this, "Semester 1", Toast.LENGTH_SHORT).show();
            }
        });

        btn_notes_sem_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NotesActivity.this, NotesSem2Activity.class);
                startActivity(intent);
                Toast.makeText(NotesActivity.this, "Semester 2", Toast.LENGTH_SHORT).show();
            }
        });

        btn_notes_sem_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NotesActivity.this, NotesSem3Activity.class);
                startActivity(intent);
                Toast.makeText(NotesActivity.this, "Semester 3", Toast.LENGTH_SHORT).show();
            }
        });

        btn_notes_sem_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NotesActivity.this, NotesSem4Activity.class);
                startActivity(intent);
                Toast.makeText(NotesActivity.this, "Semester 4", Toast.LENGTH_SHORT).show();
            }
        });

        btn_notes_sem_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NotesActivity.this, NotesSem5Activity.class);
                startActivity(intent);
                Toast.makeText(NotesActivity.this, "Semester 5", Toast.LENGTH_SHORT).show();
            }
        });

        btn_notes_sem_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( NotesActivity.this, NotesSem6Activity.class);
                startActivity(intent);
                Toast.makeText(NotesActivity.this, "Semester 6", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
