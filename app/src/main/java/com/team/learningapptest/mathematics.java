package com.team.learningapptest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class mathematics extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathematics);

        PDFView pdfView = (PDFView) findViewById(R.id.pdfView_mathematics);
        pdfView.fromAsset("maths.pdf").load();


    }
}
