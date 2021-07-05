package com.example.codingevaluationone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mtvSIgnIn;
    private  TextView mtvCreateAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtvSIgnIn =findViewById(R.id.tvSignIng);
        mtvCreateAccount =findViewById(R.id.tvCreateAccount);

        mtvSIgnIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            };
        });

    }
}