package com.example.ramzanullah.shcheduleshower.MeetingInfo.DataModel;

import com.google.gson.annotations.SerializedName;

public class ActionsItem{

	@SerializedName("comments")
	private Object comments;

	@SerializedName("action_type")
	private int actionType;

	@SerializedName("members")
	private Members members;

	@SerializedName("created_at")
	private String createdAt;

	public void setComments(Object comments){
		this.comments = comments;
	}

	public Object getComments(){
		return comments;
	}

	public void setActionType(int actionType){
		this.actionType = actionType;
	}

	public int getActionType(){
		return actionType;
	}

	public void setMembers(Members members){
		this.members = members;
	}

	public Members getMembers(){
		return members;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	@Override
 	public String toString(){
		return 
			"ActionsItem{" + 
			"comments = '" + comments + '\'' + 
			",action_type = '" + actionType + '\'' + 
			",members = '" + members + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			"}";
		}
}