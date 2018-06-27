package com.example.ramzanullah.shcheduleshower.Login.DataModel;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Member{

	@SerializedName("member_businesses")
	private List<Object> memberBusinesses;

	@SerializedName("phone_no")
	private String phoneNo;

	@SerializedName("address")
	private String address;

	@SerializedName("date_of_birth")
	private String dateOfBirth;

	@SerializedName("TIN_no")
	private String tINNo;

	@SerializedName("NID_no")
	private String nIDNo;

	@SerializedName("member_shareholdings")
	private List<Object> memberShareholdings;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("avatar")
	private String avatar;

	@SerializedName("emergency_contact_email")
	private String emergencyContactEmail;

	@SerializedName("emergency_contact_name")
	private String emergencyContactName;

	@SerializedName("member_director_types")
	private List<Object> memberDirectorTypes;

	@SerializedName("place_of_birth")
	private String placeOfBirth;

	@SerializedName("emergency_contact_phone_no")
	private String emergencyContactPhoneNo;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("name")
	private String name;

	@SerializedName("designation")
	private String designation;

	@SerializedName("id")
	private int id;

	@SerializedName("user")
	private User user;

	@SerializedName("email")
	private String email;

	public void setMemberBusinesses(List<Object> memberBusinesses){
		this.memberBusinesses = memberBusinesses;
	}

	public List<Object> getMemberBusinesses(){
		return memberBusinesses;
	}

	public void setPhoneNo(String phoneNo){
		this.phoneNo = phoneNo;
	}

	public String getPhoneNo(){
		return phoneNo;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setDateOfBirth(String dateOfBirth){
		this.dateOfBirth = dateOfBirth;
	}

	public String getDateOfBirth(){
		return dateOfBirth;
	}

	public void setTINNo(String tINNo){
		this.tINNo = tINNo;
	}

	public String getTINNo(){
		return tINNo;
	}

	public void setNIDNo(String nIDNo){
		this.nIDNo = nIDNo;
	}

	public String getNIDNo(){
		return nIDNo;
	}

	public void setMemberShareholdings(List<Object> memberShareholdings){
		this.memberShareholdings = memberShareholdings;
	}

	public List<Object> getMemberShareholdings(){
		return memberShareholdings;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setAvatar(String avatar){
		this.avatar = avatar;
	}

	public String getAvatar(){
		return avatar;
	}

	public void setEmergencyContactEmail(String emergencyContactEmail){
		this.emergencyContactEmail = emergencyContactEmail;
	}

	public String getEmergencyContactEmail(){
		return emergencyContactEmail;
	}

	public void setEmergencyContactName(String emergencyContactName){
		this.emergencyContactName = emergencyContactName;
	}

	public String getEmergencyContactName(){
		return emergencyContactName;
	}

	public void setMemberDirectorTypes(List<Object> memberDirectorTypes){
		this.memberDirectorTypes = memberDirectorTypes;
	}

	public List<Object> getMemberDirectorTypes(){
		return memberDirectorTypes;
	}

	public void setPlaceOfBirth(String placeOfBirth){
		this.placeOfBirth = placeOfBirth;
	}

	public String getPlaceOfBirth(){
		return placeOfBirth;
	}

	public void setEmergencyContactPhoneNo(String emergencyContactPhoneNo){
		this.emergencyContactPhoneNo = emergencyContactPhoneNo;
	}

	public String getEmergencyContactPhoneNo(){
		return emergencyContactPhoneNo;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setDesignation(String designation){
		this.designation = designation;
	}

	public String getDesignation(){
		return designation;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setUser(User user){
		this.user = user;
	}

	public User getUser(){
		return user;
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
			"Member{" + 
			"member_businesses = '" + memberBusinesses + '\'' + 
			",phone_no = '" + phoneNo + '\'' + 
			",address = '" + address + '\'' + 
			",date_of_birth = '" + dateOfBirth + '\'' + 
			",tIN_no = '" + tINNo + '\'' + 
			",nID_no = '" + nIDNo + '\'' + 
			",member_shareholdings = '" + memberShareholdings + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",avatar = '" + avatar + '\'' + 
			",emergency_contact_email = '" + emergencyContactEmail + '\'' + 
			",emergency_contact_name = '" + emergencyContactName + '\'' + 
			",member_director_types = '" + memberDirectorTypes + '\'' + 
			",place_of_birth = '" + placeOfBirth + '\'' + 
			",emergency_contact_phone_no = '" + emergencyContactPhoneNo + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			",name = '" + name + '\'' + 
			",designation = '" + designation + '\'' + 
			",id = '" + id + '\'' + 
			",user = '" + user + '\'' + 
			",email = '" + email + '\'' + 
			"}";
		}
}