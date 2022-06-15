package com.example.pj_hci_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Freelancer_P6 extends AppCompatActivity {
    Button btnQuaylai, btnTrangchu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freelancer_p6);

        btnQuaylai = (Button) findViewById(R.id.buttonQuaylai);
        btnTrangchu = (Button) findViewById(R.id.buttonTrangchu);

        btnQuaylai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Freelancer_P6.this, Freelancer_P5.class);
                startActivity(intent);
            }
        });
        btnTrangchu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Freelancer_P6.this, Freelancer_P1.class);
                startActivity(intent);
            }
        });
    }
}