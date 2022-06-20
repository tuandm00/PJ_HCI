package com.example.pj_hci_v2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Notification extends AppCompatActivity {

    ImageView back,menu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        back = findViewById(R.id.back);
        menu = findViewById(R.id.bar);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Notification.this,MainActivity.class);
                startActivity(intent);

            }
        });
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Notification.this,Menu.class);
                startActivity(intent);
            }
        });

    }
}