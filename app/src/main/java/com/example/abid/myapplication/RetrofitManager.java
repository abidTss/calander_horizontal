package com.example.abid.myapplication;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitManager {
    private static ApiInterFace apiInterFace;
    public static ApiInterFace getApiInterFace(){
        if(apiInterFace==null){
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://demo8716682.mockable.io/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            apiInterFace=retrofit.create(ApiInterFace.class);
        }
        return apiInterFace;
    }

}
