package com.example.pj_hci_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Freelancer_P4 extends AppCompatActivity {
    Button btnLienhetructiep, btnQuaylai, btnTrangchu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freelancer_p4);

        btnLienhetructiep = (Button) findViewById(R.id.buttonLienhetructiep);
        btnQuaylai = (Button) findViewById(R.id.buttonQuaylai);
        btnTrangchu = (Button) findViewById(R.id.buttonTrangchu);

        btnLienhetructiep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Freelancer_P4.this, Freelancer_P5.class);
                startActivity(intent);
            }
        });
        btnQuaylai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Freelancer_P4.this, Freelancer_P3.class);
                startActivity(intent);
            }
        });
        btnTrangchu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Freelancer_P4.this, Freelancer_P1.class);
                startActivity(intent);
            }
        });


    }
}