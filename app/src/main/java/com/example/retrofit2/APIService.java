package com.example.retrofit2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {
//    http://app.iotstar.vn:8081/appfoods/categories.php

    @GET("categories.php")
    Call<List<Category>> getCategoryAll();
}
