package com.team.learningapptest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class research extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research2);
    }

    public void browser1(View view) {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com.kh"));
        startActivity(browserIntent);
    }
}
