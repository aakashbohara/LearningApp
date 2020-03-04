package com.team.learningapptest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class notes extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes2);



        Button but_physics=findViewById(R.id.button_physics);
        Button but_chemistry=findViewById(R.id.button_chemistry);
        Button but_gk=findViewById(R.id.button_gk);
        Button but_english=findViewById(R.id.button_english);
        Button but_biology=findViewById(R.id.button_biology);
        Button but_mathematics=findViewById(R.id.button_mathematics);



        but_physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int7=new Intent(notes.this,physics.class);
                startActivity(int7);
            }
        });


        but_chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int8=new Intent(notes.this,chemistry.class);
                startActivity(int8);
            }
        });

        but_gk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int9=new Intent(notes.this,gk.class);
                startActivity(int9);
            }
        });

        but_mathematics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int10=new Intent(notes.this,mathematics.class);
                startActivity(int10);
            }
        });

        but_english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int11=new Intent(notes.this,english.class);
                startActivity(int11);
            }
        });

        but_biology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int12=new Intent(notes.this,biology.class);
                startActivity(int12);
            }
        });






    }
}
