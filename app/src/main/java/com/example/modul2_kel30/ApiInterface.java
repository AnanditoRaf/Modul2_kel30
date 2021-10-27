package com.example.modul2_kel30;

import com.example.modul2_kel30.ListUserResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("api/users?page=2")
    Call<ListUserResponse> getList();

}
