package com.example.ramzanullah.shcheduleshower.Login.DataModel;

import com.google.gson.annotations.SerializedName;

public class Data{

	@SerializedName("member")
	private Member member;

	@SerializedName("token")
	private String token;

	public void setMember(Member member){
		this.member = member;
	}

	public Member getMember(){
		return member;
	}

	public void setToken(String token){
		this.token = token;
	}

	public String getToken(){
		return token;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"member = '" + member + '\'' + 
			",token = '" + token + '\'' + 
			"}";
		}
}