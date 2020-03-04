package com.team.learningapptest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class physics extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics);

        PDFView pdfView = (PDFView) findViewById(R.id.pdfView_physics);
        pdfView.fromAsset("physics.pdf").load();
    }
}
