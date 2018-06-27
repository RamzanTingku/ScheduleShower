package com.example.ramzanullah.shcheduleshower.Login.MVP;

import android.content.Context;
import android.util.Log;

import com.example.ramzanullah.shcheduleshower.Login.DataModel.LoginInfoResponse;
import com.example.ramzanullah.shcheduleshower.Login.DataModel.LoginModel;
import com.example.ramzanullah.shcheduleshower.Network.ApiInterface;
import com.example.ramzanullah.shcheduleshower.Network.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ApiLoginCall {

    private final String TAG = "ApiLoginInfo";

    LoginRequestListener listener;

    public ApiLoginCall(LoginModel loginModel, final LoginRequestListener listener){

        this.listener = listener;
        ApiInterface apiInterface = RetrofitClient.getApiInterface();

        Call<LoginInfoResponse> call = apiInterface.getLoginInfo(loginModel);
        call.enqueue(new Callback<LoginInfoResponse>() {
            @Override
            public void onResponse(Call<LoginInfoResponse> call, Response<LoginInfoResponse> response) {

                if(response.isSuccessful()){
                    Log.e(TAG, response.body().toString() );
                    if(response.body().isStatus()){
                        listener.onLoginIfoGetComplete(response.body());
                    }else{
                        listener.onLoginIfoGetError(response.body().getMessage());
                    }
                }else{
                    listener.onLoginIfoGetError("Something went wrong...");
                }
            }
            @Override
            public void onFailure(Call<LoginInfoResponse> call, Throwable t) {
                listener.onLoginIfoGetError(t+" ");
            }
        });

    }
}
