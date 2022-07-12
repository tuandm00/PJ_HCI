package com.example.pj_hci_v2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ConfirmForm extends AppCompatActivity {
    ImageButton imgBtnExit;
    Button btnConfirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_form);
        imgBtnExit=findViewById(R.id.imageButton2);
        btnConfirm=findViewById(R.id.btnConfirm);
        imgBtnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(ConfirmForm.this,FoundedForm.class);
                startActivity(intent);
            }
        });
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(ConfirmForm.this,DetailForm.class);
                startActivity(intent);
            }
        });
    }
}