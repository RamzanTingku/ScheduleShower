package com.example.ramzanullah.shcheduleshower.Login.MVP;

import com.example.ramzanullah.shcheduleshower.Login.DataModel.LoginInfoResponse;

public interface LoginRequestListener {
    void onLoginIfoGetComplete(LoginInfoResponse response);
    void onLoginIfoGetError(String error);
}
