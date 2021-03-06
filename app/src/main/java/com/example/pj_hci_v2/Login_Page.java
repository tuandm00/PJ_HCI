package com.example.pj_hci_v2;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
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
    ImageView signInWithGoogle, lightMode, hiddenPassword;

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
        hiddenPassword = (ImageView) findViewById(R.id.imgHiddenPassword);


        //Login into the App using Phone Go Button
        password.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if ((event != null && (event.getKeyCode() == KeyEvent.KEYCODE_ENTER)) || (actionId == EditorInfo.IME_ACTION_DONE)) {
                    login.performClick();
                }
                return false;
            }
        });

        //Login into the App
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtPassword = password.getText().toString();
                String txtUsername = username.getText().toString();

                // Username or Password is empty
                if (txtPassword.equals("") || txtUsername.equals("")) {
                    errorMessage.setText("T??i kho???n kh??ng ???????c ????? tr???ng");
                } else {
                    // Using account Admin to Login
                    if (txtPassword.equals("admin") && txtUsername.equals("admin")) {
                        Intent loginChange = new Intent(Login_Page.this, com.example.pj_hci_v2.FreelancerMainActivity.class);
                        startActivity(loginChange);
                    } else {
                        errorMessage.setText("Sai t??i kho???n ho???c m???t kh???u");
                    }
                }
            }
        });

        // Show/Hide password
        hiddenPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check Password is hidden or not
                if (password.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
                    // change icon from hidden to show password
                    hiddenPassword.setImageResource(R.drawable.show_password);
                    // Set password as show
                    password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                } else {
                    hiddenPassword.setImageResource(R.drawable.black_eye);
                    password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }

            }
        });

        // Forgot Username or Password
        forgotUsernameOrPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Switch to Forgot Password Page
                Intent forgotUsername = new Intent(Login_Page.this, com.example.pj_hci_v2.Forgot_Password_Page.class);
                startActivity(forgotUsername);
            }
        });

        // Using Google to Sign in
        signInWithGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Switch to Google Sign In Page
                Intent googleIntent = new Intent(Login_Page.this, com.example.pj_hci_v2.Google_Sign_In.class);
                startActivity(googleIntent);
            }
        });
    }
}