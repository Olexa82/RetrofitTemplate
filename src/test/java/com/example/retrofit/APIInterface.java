package com.example.retrofit;

import com.example.retrofit.pojo.CreateUserRequest;
import com.example.retrofit.pojo.CreateUserResponse;
import com.example.retrofit.pojo.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * @author Alex on 28.08.2021
 * retrofit
 */
public interface APIInterface {
    @GET("users/2")
    Call<User> getUser();

    @POST("users")
    Call<CreateUserResponse>createUser(@Body CreateUserRequest body);

}
