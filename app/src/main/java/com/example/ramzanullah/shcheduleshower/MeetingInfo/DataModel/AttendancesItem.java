package com.example.ramzanullah.shcheduleshower.MeetingInfo.DataModel;

import com.google.gson.annotations.SerializedName;

public class AttendancesItem{

	@SerializedName("small_avatar")
	private String smallAvatar;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	@SerializedName("avatar")
	private String avatar;

	@SerializedName("email")
	private String email;

	public void setSmallAvatar(String smallAvatar){
		this.smallAvatar = smallAvatar;
	}

	public String getSmallAvatar(){
		return smallAvatar;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setAvatar(String avatar){
		this.avatar = avatar;
	}

	public String getAvatar(){
		return avatar;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	@Override
 	public String toString(){
		return 
			"AttendancesItem{" + 
			"small_avatar = '" + smallAvatar + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",avatar = '" + avatar + '\'' + 
			",email = '" + email + '\'' + 
			"}";
		}
}