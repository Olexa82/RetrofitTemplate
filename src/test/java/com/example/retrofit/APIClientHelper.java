package com.example.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * @author Alex on 28.08.2021
 * retrofit
 */
public class APIClientHelper {

    public static final String BASE_URL = "https:/reqres.in/api/";

    private static Retrofit rerofit = null;

    static Retrofit getClient(){
        rerofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        return rerofit;
    }
}
