package com.example.codingevaluationone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class sign_up_acticity extends AppCompatActivity {
    private EditText mteName;
    private EditText metPassword;
    private EditText metEmail;
    private TextView mtvSignIn;
    private String emailVerification = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_acticity);

        mteName = findViewById(R.id.teName);
        metEmail = findViewById(R.id.teEmail);
        metPassword = findViewById(R.id.tePassword);
        mtvSignIn = findViewById(R.id.SignIn);

        mtvSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                if(isValidName() && isValidPassword()){
                    intent.putExtra("name","Lloyd Dcosta");
                }

            }
        });
    }

    public  boolean isValidPassword() {
        if (metPassword.getText().toString().length() >= 6) {
            return true;
        } else{
            metPassword.setError("Invalid Password");
        return false;
      }
    }

    public boolean isValidName(){
        if (mteName.getText().toString().length()>=4)
            return true;
        else {mteName.setError("Invalid username");
            return  false;
        }
    }

}