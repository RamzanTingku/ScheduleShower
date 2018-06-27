package com.example.ramzanullah.shcheduleshower.Network;

import com.example.ramzanullah.shcheduleshower.Utils.Constants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    public static Retrofit retrofit = null ;

    public static Retrofit getRetrofitClient(){

        if(retrofit == null){

            Gson gson = new GsonBuilder().setLenient().create();

            OkHttpClient okHttpClient = new OkHttpClient() ;

            retrofit = new Retrofit.Builder()
                    .baseUrl(Constants.baseUrlApi)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }

        return retrofit ;
    }


    public static ApiInterface getApiInterface(){
        return getRetrofitClient().create(ApiInterface.class);
    }
}
