package com.example.ramzanullah.shcheduleshower.Login.MVP;

import com.example.ramzanullah.shcheduleshower.Login.DataModel.LoginInfoResponse;
import com.example.ramzanullah.shcheduleshower.Login.DataModel.LoginModel;

public class LoginPresenter {

    ViewLogin viewLogin;

    public LoginPresenter(ViewLogin viewLogin) {
        this.viewLogin = viewLogin;
    }

    public void getLoginInfo(LoginModel loginModel){
        viewLogin.startLoading();

        new ApiLoginCall(loginModel, new LoginRequestListener() {
            @Override
            public void onLoginIfoGetComplete(LoginInfoResponse response) {
                viewLogin.onGetLoginInfoSuccess(response);
                viewLogin.stopLoading();
            }

            @Override
            public void onLoginIfoGetError(String error) {
                viewLogin.stopLoading();
                viewLogin.onGetLoginInfoError(error);
            }
        });
    }

}
