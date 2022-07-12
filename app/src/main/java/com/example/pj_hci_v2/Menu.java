package com.example.pj_hci_v2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {

    TextView matdo,nhatdo,thongtin;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        matdo = findViewById(R.id.matdo);
        nhatdo = findViewById(R.id.nhatdo);
        thongtin = findViewById(R.id.thongtintaikhoan);

        back = findViewById(R.id.turnback);


        matdo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menu.this,MainMatDo.class);
                startActivity(intent);
                finish();


            }
        });

        nhatdo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menu.this,MainNhatDo.class);
                startActivity(intent);

            }
        });

        thongtin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this,ProfileForm.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menu.this,Home_Page.class);
                startActivity(intent);



            }
        });



    }
}