package com.example.pj_hci_v2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailForm extends AppCompatActivity {
        ImageButton imgBtnExit;
        TextView tvInformation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_form);
        imgBtnExit=findViewById(R.id.imageButton2);
        tvInformation=findViewById(R.id.textView52);
        tvInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(DetailForm.this,ProfileForm.class);
                startActivity(intent);
            }
        });
        imgBtnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(DetailForm.this,FoundedForm.class);
                startActivity(intent);
            }
        });
    }
}