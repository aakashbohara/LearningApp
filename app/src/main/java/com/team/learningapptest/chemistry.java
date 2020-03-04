package com.team.learningapptest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class chemistry extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry);

        PDFView pdfView = (PDFView) findViewById(R.id.pdfView_chemistry);
        pdfView.fromAsset("chemo.pdf").load();


    }
}
