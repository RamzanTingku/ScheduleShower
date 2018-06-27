package com.example.ramzanullah.shcheduleshower.Login.MVP;

import android.content.Context;

import com.example.ramzanullah.shcheduleshower.Login.DataModel.LoginInfoResponse;

public interface ViewLogin {

    public void onGetLoginInfoSuccess(LoginInfoResponse response);
    public void onGetLoginInfoError(String error);
    public void startLoading();
    public void stopLoading();
    public Context getAppContext();

}
