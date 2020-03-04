package com.team.learningapptest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class formula extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formula2);

        Button but_derivative=findViewById(R.id.derivative);
        Button but_integration=findViewById(R.id.intergration);
        Button but_trignometry=findViewById(R.id.trignometry);

        but_derivative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int_d=new Intent(formula.this,derivative.class);
                startActivity(int_d);
            }
        });

        but_integration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int_i=new Intent(formula.this,integration.class);
                startActivity(int_i);
            }
        });

        but_trignometry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int_t=new Intent(formula.this,trignometry.class);
                startActivity(int_t);
            }
        });

    }
}
