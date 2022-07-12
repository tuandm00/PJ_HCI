package com.example.pj_hci_v2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pj_hci_v2.api.Repository;
import com.example.pj_hci_v2.ojbect.Item;
import com.example.pj_hci_v2.ojbect.Account;
import com.example.pj_hci_v2.service.AccountService;
import com.example.pj_hci_v2.service.ItemService;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainNhatDo extends AppCompatActivity {
    private ArrayList<Post> postList;
    private RecyclerView recyclerView;
    ImageView barMenu,bell;
    Button btnNhatDo;
    ImageView imgBack;
    ArrayList<Item> itemList;
    ArrayList<Account> accountList;
    ItemService itemService;
//    PostAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_nhat_do);

        barMenu = findViewById(R.id.bar);
        bell = findViewById(R.id.bell);
        recyclerView = findViewById(R.id.rclview);
        btnNhatDo = findViewById(R.id.btnNhatDo);
        imgBack=findViewById(R.id.back);
        postList = new ArrayList<>();
        accountList=new ArrayList<Account>();
        itemService=Repository.getItemService();
        showListItem();

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainNhatDo.this,Home_Page.class);
                startActivity(intent);
            }
        });

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
        btnNhatDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainNhatDo.this,FoundedForm.class);
                startActivity(intent);
            }
        });

    }
    //closeoncreate

    public void showListItem(){
        itemList=new ArrayList<>();
       Call<Item[]> call = itemService.getAllItems();
       call.enqueue(new Callback<Item[]>() {
           @Override
           public void onResponse(Call<Item[]> call, Response<Item[]> response) {
               Item[] items=response.body();
               if(items==null){
                   Toast.makeText(MainNhatDo.this, "Null", Toast.LENGTH_SHORT).show();
                   return;
               }
               for(Item item : items){
                   itemList.add(item);
                   postList.add(new Post(R.drawable.back,"Tứng",item.getDate(),item.getImg()));
               }
                PostAdapter adapter = new PostAdapter(postList,null);
               recyclerView.setAdapter(adapter);
           }
           @Override
           public void onFailure(Call<Item[]> call, Throwable t) {

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
//        postList.add(new Post(R.drawable.user, "Diệp Đặng A", "4 giờ",R.drawable.thegiuxe));
////        postList.add(new Post(R.drawable.user, "Diệp Đặng A", "4 giờ", "Mình có nhặt được thẻ xe dưới bãi xe", R.drawable.dienthoai, "30", "20 bình luân", "19 chia sẻ"));
//        PostAdapter postAdapter = new PostAdapter(postList, new IClick(){
//
//
//            void onClickItem() {
//                popupMenu(R.id.baCham);
//            }
//        });
//        recyclerView.setAdapter(postAdapter);
//        postList.add(new Post(R.drawable.user, "Diệp Đặng A", "4 giờ", "Mình có nhặt được thẻ xe dưới bãi xe", R.drawable.thegiuxe, "30", "20 bình luân", "19 chia sẻ"));
//        postList.add(new Post(R.drawable.user, "Diệp Đặng A", "4 giờ", "Mình có nhặt được thẻ xe dưới bãi xe", R.drawable.thegiuxe, "30", "20 bình luân", "19 chia sẻ"));
//        postList.add(new Post(R.drawable.user, "Diệp Đặng A", "4 giờ", "Mình có nhặt được thẻ xe dưới bãi xe", R.drawable.thegiuxe, "30", "20 bình luân", "19 chia sẻ"));
//        postList.add(new Post(R.drawable.user, "Diệp Đặng A", "4 giờ", "Mình có nhặt được thẻ xe dưới bãi xe", R.drawable.thegiuxe, "30", "20 bình luân", "19 chia sẻ"));
//        postList.add(new Post(R.drawable.user, "Diệp Đặng A", "4 giờ", "Mình có nhặt được thẻ xe dưới bãi xe", R.drawable.thegiuxe, "30", "20 bình luân", "19 chia sẻ"));