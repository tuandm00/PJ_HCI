package com.example.pj_hci_v2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pj_hci_v2.api.Repository;
import com.example.pj_hci_v2.ojbect.Item;
import com.example.pj_hci_v2.service.ItemService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FoundedForm extends AppCompatActivity {
    ImageView imgExit;
    EditText itemName,itemBrand,itemPosition,itemDescription,itemDate,itemDate2;
    Button btnSubmit;
    ItemService itemService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_founded_form);
        imgExit=findViewById(R.id.imageViewExit);
        imgExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(FoundedForm.this,MainNhatDo.class);
                startActivity(intent);
            }
        });
        itemName=findViewById(R.id.editTextDoVatGiFounded);
        itemBrand=findViewById(R.id.editTextHangDoVatFounded);
        itemPosition=findViewById(R.id.editTextViTriNhatFounded);
        itemDescription=findViewById(R.id.editTextMotaDoVatFounded);
        itemDate=findViewById(R.id.editTextThoiGianMat2Founded);
        itemDate2=findViewById(R.id.editTextThoiGianMat3Founded);
        btnSubmit=findViewById(R.id.buttonDangFounded);
        itemName.setText("");
        itemBrand.setText("");
        itemPosition.setText("");
        itemDescription.setText("");
        itemDate.setText("");
        itemDate2.setText("");
        itemService= Repository.getItemService();
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                save();
                Intent intent= new Intent(FoundedForm.this,MainNhatDo.class);
                startActivity(intent);
            }
        });
    }
    private void save(){
        String name=itemName.getText().toString();
        String brand=itemBrand.getText().toString();
        String positon=itemPosition.getText().toString();
        String des=itemDescription.getText().toString();
        String gio=itemDate.getText().toString();
        String ngay =itemDate2.getText().toString();
        int img=R.drawable.dienthoai;
        boolean state=false;
        Item item = new Item(name,brand,positon,des,ngay,state,img);
        try{
            Call<Item> call=itemService.createItems(item);
            call.enqueue(new Callback<Item>() {
                @Override
                public void onResponse(Call<Item> call, Response<Item> response) {
                    Toast.makeText(FoundedForm.this,"Save successfully",Toast.LENGTH_LONG).show();
                }

                @Override
                public void onFailure(Call<Item> call, Throwable t) {
                    Toast.makeText(FoundedForm.this,"Saving failed ",Toast.LENGTH_LONG).show();
                }
            });
        }catch (Exception e){
            Log.d("Loi",e.getMessage());
        }
    }
}