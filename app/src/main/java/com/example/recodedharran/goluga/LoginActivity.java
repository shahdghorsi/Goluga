package com.example.recodedharran.goluga;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText emailEditText;
    private EditText passwordEditText;
    private Button loginButton;
    private TextView signUpTextView;
    private int falseLoginAttempts;
    private String sudoEmail;
    private String sudoPassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        emailEditText = findViewById(R.id.email_edit_text);
        passwordEditText = findViewById(R.id.password_edit_text);
        loginButton = findViewById(R.id.login_button);
        signUpTextView = findViewById(R.id.sign_up_text_view);

        // set correct credentials for testing purposes (Should be removed later)
//        emailEditText.setText(sudoEmail);
//        passwordEditText.setText(sudoPassword);

        sudoEmail = "test@test.com";
        sudoPassword = "test";

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if login success go to Main Activity
                if(login()) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                }else{
                    falseLoginAttempts++;
                }
            }
        });

        signUpTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });

    }

    public boolean login() {
        boolean isLoginSuccess;
        if (!emailEditText.getText().toString().trim().equals(sudoEmail)) {
            isLoginSuccess = false;
            Toast.makeText(this, "Wrong email entered!", Toast.LENGTH_SHORT).show();
        } else if (!passwordEditText.getText().toString().equals(sudoPassword)) {
            isLoginSuccess = false;
            Toast.makeText(this, "Wrong password entered!", Toast.LENGTH_SHORT).show();
        } else {
            isLoginSuccess = true;
            Toast.makeText(this, "LoginActivity success!", Toast.LENGTH_SHORT).show();

        }
        return isLoginSuccess;
    }


}

