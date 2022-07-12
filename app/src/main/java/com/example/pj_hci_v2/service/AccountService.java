package com.example.pj_hci_v2.service;


import com.example.pj_hci_v2.ojbect.Account;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface AccountService {
    String ACCOUNTS="account";
    @GET(ACCOUNTS)
    Call<Account[]> getAllAccounts();

    @GET(ACCOUNTS +"/{id}")
    Call<Account[]> getAllAccounts(@Path("id") Object account);

    @POST(ACCOUNTS)
    Call<Account> createAccounts(@Body Account account);

    @PUT(ACCOUNTS +"/{id}")
    Call<Account> updateAccount(@Path("id") Object id,@Body Account account);

    @DELETE(ACCOUNTS +"/{id}")
    Call<Account> deleteAccount(@Path("id") Object id);

}
