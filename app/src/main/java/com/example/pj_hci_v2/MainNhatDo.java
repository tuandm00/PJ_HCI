package com.example.pj_hci_v2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainNhatDo extends AppCompatActivity {

    private ArrayList<Post> postList;

    private RecyclerView recyclerView;

    ImageView barMenu,bell;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_nhat_do);

        barMenu = findViewById(R.id.bar);
        bell = findViewById(R.id.bell);
        recyclerView = findViewById(R.id.rclview);

        postList = new ArrayList<>();
        postList.add(new Post(R.drawable.user, "Diệp Đặng A", "4 giờ", "Mình có nhặt được thẻ xe dưới bãi xe", R.drawable.thegiuxe, "30", "20 bình luân", "19 chia sẻ"));
        postList.add(new Post(R.drawable.user, "Diệp Đặng A", "4 giờ", "Mình có nhặt được thẻ xe dưới bãi xe", R.drawable.thegiuxe, "30", "20 bình luân", "19 chia sẻ"));
        postList.add(new Post(R.drawable.user, "Diệp Đặng A", "4 giờ", "Mình có nhặt được thẻ xe dưới bãi xe", R.drawable.thegiuxe, "30", "20 bình luân", "19 chia sẻ"));
        postList.add(new Post(R.drawable.user, "Diệp Đặng A", "4 giờ", "Mình có nhặt được thẻ xe dưới bãi xe", R.drawable.thegiuxe, "30", "20 bình luân", "19 chia sẻ"));
        postList.add(new Post(R.drawable.user, "Diệp Đặng A", "4 giờ", "Mình có nhặt được thẻ xe dưới bãi xe", R.drawable.thegiuxe, "30", "20 bình luân", "19 chia sẻ"));

        PostAdapter postAdapter = new PostAdapter(postList, new IClick(){


            void onClickItem() {
                popupMenu(R.id.baCham);
            }
        });
        recyclerView.setAdapter(postAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        barMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                changeMenu();


            }
        });
        bell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeBell();


            }
        });



    }

    public void changeMenu(){

        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);
        finish();

    }

    public void popupMenu(int a){
        ImageView btn;
        btn = findViewById(a);
        PopupMenu popupMenu = new PopupMenu(this,btn);
        popupMenu.getMenuInflater().inflate(R.menu.menu_main,popupMenu.getMenu());

        popupMenu.show();

    }
    public  void changeBell(){

        Intent intent = new Intent(this,Notification.class);
        startActivity(intent);
        finish();

    }

}