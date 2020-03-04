package com.team.learningapptest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class integration extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_integration);

        PDFView pdfView = (PDFView) findViewById(R.id.pdfView_integration);
        pdfView.fromAsset("integration_formulas.pdf").load();
    }
}
