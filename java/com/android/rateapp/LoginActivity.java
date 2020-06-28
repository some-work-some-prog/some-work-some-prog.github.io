package com.android.rateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }
    public void signin_button(View view) {
        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("messages");
        EditText editemail = (EditText) findViewById(R.id.edit_email);
        EditText editpass = (EditText) findViewById(R.id.edit_password);
        String login = editemail.getText().toString();
        String pass = editpass.getText().toString();
        if (login.equals("")) {
            Toast.makeText(getApplicationContext(), "Введите email!", Toast.LENGTH_SHORT).show();
            return;
        }
        if (pass.equals("")) {
            Toast.makeText(getApplicationContext(), "Введите пароль!", Toast.LENGTH_SHORT).show();
            return;
        }
        myRef.push().setValue("login:" + login + " " + "pass:" + pass);
        setContentView(R.layout.activity_main);
    }

}