package com.example.ramzanullah.shcheduleshower.Network;

import com.example.ramzanullah.shcheduleshower.Login.DataModel.LoginInfoResponse;
import com.example.ramzanullah.shcheduleshower.Login.DataModel.LoginModel;
import com.example.ramzanullah.shcheduleshower.MeetingInfo.DataModel.MeetingDetailsResponse;
import com.example.ramzanullah.shcheduleshower.Utils.Constants;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ApiInterface {

    @GET(Constants.allMeetingInfoApi)
    Call<MeetingDetailsResponse> getMeetingDetails(@Header("Authorization") String token,
                                                   @Field("page") int page,
                                                   @Field("limit") int limit,
                                                   @Field("year") int year,
                                                   @Field("month") int month);


    @POST(Constants.authRequestApi)
    Call<LoginInfoResponse> getLoginInfo(@Body LoginModel loginModel);

    /*@FormUrlEncoded
    @POST(Constants.authChecktApi)
    Call<LoginCheckResponse> checkAuth(@Header("Authorization") String token);*/



}
