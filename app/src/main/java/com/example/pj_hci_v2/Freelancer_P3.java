package com.example.pj_hci_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Freelancer_P3 extends AppCompatActivity {
    Button btnTrangke;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freelancer_p3);

        //Nút trang kế
        btnTrangke = (Button) findViewById(R.id.buttonTrangke);
        btnTrangke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Freelancer_P3.this, Freelancer_P4.class);
                startActivity(intent);
            }
        });
    }
}