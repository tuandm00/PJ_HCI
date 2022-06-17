package com.example.pj_hci_v2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Home_Page extends AppCompatActivity {
    ImageView imgLogout, imgLostAndFound, imgFreelanceJob;
    Button lostAndFound, freelanceJob;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        imgLogout = (ImageView) findViewById(R.id.imgLogout);
        imgLostAndFound = (ImageView) findViewById(R.id.imgLostAndFound);
        imgFreelanceJob = (ImageView) findViewById(R.id.imgFreelanceJob);
        lostAndFound = (Button) findViewById(R.id.btnLostFound);
        freelanceJob = (Button) findViewById(R.id.btnFreelanceJob);

        imgLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goBack = new Intent(Home_Page.this, Login_Page.class);
                startActivity(goBack);
            }
        });

        imgLostAndFound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intentLostAndFound = new Intent(Home_Page.this, Freelancer_P1.class);
//                startActivity(intentLostAndFound);
            }
        });

        lostAndFound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        imgFreelanceJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFreeLanceJob = new Intent(Home_Page.this, Freelancer_P1.class);
                startActivity(intentFreeLanceJob);
            }
        });

        freelanceJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFreeLanceJob = new Intent(Home_Page.this, Freelancer_P1.class);
                startActivity(intentFreeLanceJob);
            }
        });
    }
}