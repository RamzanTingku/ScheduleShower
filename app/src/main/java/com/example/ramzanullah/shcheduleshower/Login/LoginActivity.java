package com.example.ramzanullah.shcheduleshower.Login;

import android.app.ProgressDialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ramzanullah.shcheduleshower.Login.DataModel.LoginInfoResponse;
import com.example.ramzanullah.shcheduleshower.Login.DataModel.LoginModel;
import com.example.ramzanullah.shcheduleshower.Login.MVP.LoginPresenter;
import com.example.ramzanullah.shcheduleshower.Login.MVP.ViewLogin;
import com.example.ramzanullah.shcheduleshower.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity implements ViewLogin{

    LoginPresenter presenter;
    LoginModel loginModel;
    ProgressDialog progressDialog;

    private String email, password;

    @BindView(R.id.et_email)
    EditText emailET;
    @BindView(R.id.et_password)
    EditText passET;
    @BindView(R.id.tv_signin)
    TextView signInTV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        presenter = new LoginPresenter(this);
        loginModel = new LoginModel();
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Please wait...");

        signInTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(emailET.getText() != null && passET.getText() != null){

                    getAuthInfo();

                }else{
                    Toast.makeText(LoginActivity.this, "Please fill all the fields", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void getAuthInfo() {

        email = emailET.getText().toString();
        password = passET.getText().toString();

        loginModel.setEmail(email);
        loginModel.setPassword(password);

        presenter.getLoginInfo(loginModel);

    }

    @Override
    public void onGetLoginInfoSuccess(LoginInfoResponse response) {

        Log.d("RMZ", "token:  "+response.getData().getToken());

        Toast.makeText(this, "Log in success of "+response.getData().getMember().getName(), Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onGetLoginInfoError(String error) {

        Log.d("RMZ", "error:  "+error);

        Toast.makeText(this, "Log in failed", Toast.LENGTH_SHORT).show();


    }

    @Override
    public void startLoading() {

        progressDialog.show();

    }

    @Override
    public void stopLoading() {

        progressDialog.dismiss();

    }

    @Override
    public Context getAppContext() {
        return null;
    }
}
