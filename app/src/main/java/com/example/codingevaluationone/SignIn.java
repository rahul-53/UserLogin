package com.example.codingevaluationone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SignIn extends AppCompatActivity {
    TextView mtbSignIn;

    EditText mEtName;
    EditText mEtPassword;
    EditText mEtEmail;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        mEtEmail =findViewById(R.id.teEmail);
        mEtName = findViewById(R.id.tePassword);
        mEtPassword =findViewById(R.id.tePassword);
        mtbSignIn =findViewById(R.id.tvSignIng)   ;
    }
}