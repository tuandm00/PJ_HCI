package com.example.pj_hci_v2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Login_Page extends AppCompatActivity {
    TextView username, password, errorMessage;
    RadioButton rememberMe;
    Button login;
    TextView forgotUsernameOrPassword;
    ImageView signInWithGoogle, lightMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        username = (TextView) findViewById(R.id.txtUsername);
        password = (TextView) findViewById(R.id.txtPassword);
        errorMessage = (TextView) findViewById(R.id.txtWrongUsernameOrPassword);
        forgotUsernameOrPassword = (TextView) findViewById(R.id.txtForgotUsernamePassword);
        rememberMe = (RadioButton) findViewById(R.id.btnRememberMe);
        login = (Button) findViewById(R.id.btnLogin);
        signInWithGoogle = (ImageView) findViewById(R.id.imgSignInWithGoogle);
        lightMode = (ImageView) findViewById(R.id.imgLightMode);

        forgotUsernameOrPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forgotUsername = new Intent(Login_Page.this, com.example.pj_hci_v2.Forgot_Password_Page.class);
                startActivity(forgotUsername);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtPassword = password.getText().toString();
                String txtUsername = username.getText().toString();

                if (txtPassword.equals("") || txtUsername.equals("")) {
                    errorMessage.setText("Username or Password cannot be empty");
                } else {
                    if (txtPassword.equals("admin") && txtUsername.equals("admin")) {
                        Intent loginChange = new Intent(Login_Page.this, com.example.pj_hci_v2.Home_Page.class);
                        startActivity(loginChange);
                    } else {
                        errorMessage.setText("Wrong Username or Password");
                    }
                }
            }
        });

        signInWithGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent googleIntent = new Intent(Login_Page.this, com.example.pj_hci_v2.Google_Sign_In.class);
                startActivity(googleIntent);
            }
        });
    }
}