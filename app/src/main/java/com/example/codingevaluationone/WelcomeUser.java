package com.example.codingevaluationone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeUser extends AppCompatActivity {
    private TextView mtvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_user);
        mtvName =findViewById(R.id.teWelcomeUser);

        Intent intent = new Intent();
        intent.getExtras();

    }

}