package com.example.pj_hci_v2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pj_hci_v2.api.AccountRepository;
import com.example.pj_hci_v2.api.Repository;
import com.example.pj_hci_v2.ojbect.Account;
import com.example.pj_hci_v2.service.AccountService;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProfileForm extends AppCompatActivity {
    ImageView img7;
    AccountService accountService;
    ArrayList<Account> accountList;
    TextView tvName,tvAddress,tvEmail,tvPhone,tvDes;
    ImageView imgUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_form);
        img7=findViewById(R.id.imageView7);
        tvName=findViewById(R.id.textViewNameProfile);
        tvAddress=findViewById(R.id.textViewAddressProfile);
        tvEmail=findViewById(R.id.textViewEmailProfile);
        tvDes=findViewById(R.id.textViewDesProfile);
        tvPhone=findViewById(R.id.textViewPhoneProfile);
        imgUser=findViewById(R.id.imageViewUserImage);
        accountService= AccountRepository.getAccountService();
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(ProfileForm.this,Menu.class);
                startActivity(intent);
            }
        });
        showListAccount();
    }
    public void showListAccount(){
        Call<Account[]> call =accountService.getAllAccounts();
        call.enqueue(new Callback<Account[]>() {
            @Override
            public void onResponse(Call<Account[]> call, Response<Account[]> response) {
                Account[] accounts=response.body();
                if(accounts==null){
                    Toast.makeText(ProfileForm.this,"Null",Toast.LENGTH_SHORT).show();
                    return;
                }else{
                    for(Account account : accounts){
//                        accountList.add(account);
                        imgUser.setImageResource(account.getImg());
                        tvName.setText(account.getName());
                        tvAddress.setText(account.getAddress());
                        tvEmail.setText(account.getEmail());
                        tvPhone.setText(account.getPhoneNumber()+"");
                        tvDes.setText(account.getDescription());
                    }
                }
            }
            @Override
            public void onFailure(Call<Account[]> call, Throwable t) {

            }

        });
    }
}