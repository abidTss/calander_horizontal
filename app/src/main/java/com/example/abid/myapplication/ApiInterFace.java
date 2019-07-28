package com.example.abid.myapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterFace {
    @GET("/cardData")
    Call<List<UserModel>> getUser();
}
