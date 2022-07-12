package com.example.pj_hci_v2.service;


import com.example.pj_hci_v2.ojbect.Item;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ItemService {
    String ITEMS="Item";
    @GET(ITEMS)
    Call<Item[]> getAllItems();

    @GET(ITEMS +"/{id}")
    Call<Item[]> getAllItems(@Path("id") Object item);

    @POST(ITEMS)
    Call<Item> createItems(@Body Item item);

    @PUT(ITEMS +"/{id}")
    Call<Item> updateItem(@Path("id") Object id,@Body Item item);

    @DELETE(ITEMS +"/{id}")
    Call<Item> deleteItem(@Path("id") Object id);

}
