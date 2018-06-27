package com.example.ramzanullah.shcheduleshower.Login.DataModel;

import com.google.gson.annotations.SerializedName;

public class User{

	@SerializedName("is_active")
	private boolean isActive;

	@SerializedName("is_superuser")
	private boolean isSuperuser;

	@SerializedName("is_staff")
	private boolean isStaff;

	@SerializedName("last_login")
	private String lastLogin;

	@SerializedName("last_name")
	private String lastName;

	@SerializedName("id")
	private int id;

	@SerializedName("date_joined")
	private String dateJoined;

	@SerializedName("first_name")
	private String firstName;

	@SerializedName("email")
	private String email;

	@SerializedName("username")
	private String username;

	@SerializedName("group")
	private String group;

	public void setIsActive(boolean isActive){
		this.isActive = isActive;
	}

	public boolean isIsActive(){
		return isActive;
	}

	public void setIsSuperuser(boolean isSuperuser){
		this.isSuperuser = isSuperuser;
	}

	public boolean isIsSuperuser(){
		return isSuperuser;
	}

	public void setIsStaff(boolean isStaff){
		this.isStaff = isStaff;
	}

	public boolean isIsStaff(){
		return isStaff;
	}

	public void setLastLogin(String lastLogin){
		this.lastLogin = lastLogin;
	}

	public String getLastLogin(){
		return lastLogin;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setDateJoined(String dateJoined){
		this.dateJoined = dateJoined;
	}

	public String getDateJoined(){
		return dateJoined;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	public void setGroup(String group){
		this.group = group;
	}

	public String getGroup(){
		return group;
	}

	@Override
 	public String toString(){
		return 
			"User{" + 
			"is_active = '" + isActive + '\'' + 
			",is_superuser = '" + isSuperuser + '\'' + 
			",is_staff = '" + isStaff + '\'' + 
			",last_login = '" + lastLogin + '\'' + 
			",last_name = '" + lastName + '\'' + 
			",id = '" + id + '\'' + 
			",date_joined = '" + dateJoined + '\'' + 
			",first_name = '" + firstName + '\'' + 
			",email = '" + email + '\'' + 
			",username = '" + username + '\'' + 
			",group = '" + group + '\'' + 
			"}";
		}
}