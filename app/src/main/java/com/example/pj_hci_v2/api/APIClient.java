package com.example.pj_hci_v2.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {
    private static String baseURL="https://62c249ed2af60be89ed53ba7.mockapi.io";
    private static Retrofit retrofit;
    public static Retrofit getClient(){
        if(retrofit==null){
            retrofit= new Retrofit.Builder().baseUrl(baseURL).addConverterFactory(GsonConverterFactory.create()).build();

        }
        return retrofit;
    }
}

