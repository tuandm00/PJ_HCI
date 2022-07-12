package com.example.pj_hci_v2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pj_hci_v2.api.Repository;
import com.example.pj_hci_v2.ojbect.Item;
import com.example.pj_hci_v2.service.ItemService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LostForm extends AppCompatActivity {
    ImageButton imgButton;
    EditText edtDes,date1,date2;
    Button btnSubmit;
    ItemService itemService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lost_form);
        imgButton=findViewById(R.id.imageButton2);
        edtDes=findViewById(R.id.editTextMotaDoVatLost);
        date1=findViewById(R.id.editTextThoiGianMat2);
        btnSubmit=findViewById(R.id.buttonSubmitLost);
        itemService= Repository.getItemService();
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LostForm.this,MainMatDo.class);
                startActivity(intent);
            }
        });
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                save();
                Intent intent= new Intent(LostForm.this,MainMatDo.class);
                startActivity(intent);
            }
        });
    }
    private void save(){
        String des=edtDes.getText().toString();
        String ngay=date1.getText().toString();
//        String ngay =date2.getText().toString();
        int img=R.drawable.thegiuxe;
        boolean state=true;
        Item item = new Item("name","","",des,ngay,state,img);
        try{
            Call<Item> call=itemService.createItems(item);
            call.enqueue(new Callback<Item>() {
                @Override
                public void onResponse(Call<Item> call, Response<Item> response) {
                    Toast.makeText(LostForm.this, "Save successfully", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onFailure(Call<Item> call, Throwable t) {
                    Toast.makeText(LostForm.this, "Saving failed", Toast.LENGTH_SHORT).show();
                }
            });
        }catch (Exception e){
            Log.d("Loi",e.getMessage());
        }
    }
}