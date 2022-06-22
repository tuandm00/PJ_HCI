package com.example.pj_hci_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Freelancer_P3 extends AppCompatActivity {
    Button btnTrangke;
    ImageView imgBack;
    TextView txtSave;
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

        imgBack = (ImageView) findViewById(R.id.imageView3);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Freelancer_P3.this, FreelancerMainActivity.class);
                startActivity(intent);
            }
        });
        
        txtSave = (TextView) findViewById(R.id.textViewSave);
        txtSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Freelancer_P3.this, "Saved work Successfully!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}