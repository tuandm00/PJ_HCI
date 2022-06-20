package com.example.pj_hci_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Freelancer_P1 extends AppCompatActivity {
    Button btnDanhsachcongviec, btnTimkiemtheoyeucau, btnDaluu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freelancer_p1);

        btnDanhsachcongviec = (Button) findViewById(R.id.buttonDanhsachcongviec);
        btnDanhsachcongviec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Freelancer_P1.this,FreelancerMainActivity.class);
                startActivity(intent);
            }
        });
        btnTimkiemtheoyeucau = (Button) findViewById(R.id.buttonTimkiemtheoyeucau);
        btnTimkiemtheoyeucau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Freelancer_P1.this,SearchActivity.class);
                startActivity(intent);
            }
        });
        btnDaluu = (Button) findViewById(R.id.buttonDaluu);
        btnDaluu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Freelancer_P1.this,Freelancer_P8.class);
                startActivity(intent);
            }
        });

    }
}