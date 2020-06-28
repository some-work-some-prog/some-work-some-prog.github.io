package com.android.rateapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SendMessage extends AppCompatActivity {
    public void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = (TextView) findViewById(R.id.textview);
        textView.setTextSize(40);
        setContentView(textView);
    }
}