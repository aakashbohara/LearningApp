package com.team.learningapptest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class trignometry extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trignometry);

        PDFView pdfView = (PDFView) findViewById(R.id.pdfView_trig);
        pdfView.fromAsset("_Math_Resources_Trigonometric_Formulas.pdf").load();
    }
}
