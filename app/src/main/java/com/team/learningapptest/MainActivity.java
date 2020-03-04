package com.team.learningapptest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button but_notes= findViewById(R.id.button_notes);
        Button but_research=findViewById(R.id.button_research);

        Button but_practice=findViewById(R.id.button_practice);
        Button but_formula=findViewById(R.id.button_formula);
        Button but_aboutus=findViewById(R.id.button_aboutus);
        Button but_todo=findViewById(R.id.btn_to_do);









        but_notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(MainActivity.this,notes.class);
                startActivity(int1);
            }
        });

        but_research.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(MainActivity.this,research.class);
                startActivity(int2);
            }
        });



        but_practice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int4=new Intent(MainActivity.this,practice.class);
                startActivity(int4);
            }
        });

        but_formula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int5=new Intent(MainActivity.this,formula.class);
                startActivity(int5);
            }
        });

        but_aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int6=new Intent(MainActivity.this,about_us.class);
                startActivity(int6);
            }
        });

        but_todo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int7=new Intent(MainActivity.this,toDo.class);
                startActivity(int7);
            }
        });






    }


}
