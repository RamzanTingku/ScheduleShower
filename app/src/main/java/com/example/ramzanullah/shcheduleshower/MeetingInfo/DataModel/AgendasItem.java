package com.example.ramzanullah.shcheduleshower.MeetingInfo.DataModel;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class AgendasItem{

	@SerializedName("summary")
	private Object summary;

	@SerializedName("subject")
	private String subject;

	@SerializedName("initiator")
	private String initiator;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("is_file_updated")
	private boolean isFileUpdated;

	@SerializedName("branch")
	private String branch;

	@SerializedName("memo_no")
	private String memoNo;

	@SerializedName("agenda_no")
	private int agendaNo;

	@SerializedName("final_decision")
	private String finalDecision;

	@SerializedName("my_note")
	private MyNote myNote;

	@SerializedName("agenda_type")
	private String agendaType;

	@SerializedName("agenda_file")
	private String agendaFile;

	@SerializedName("id")
	private int id;

	@SerializedName("actions")
	private List<Object> actions;

	public void setSummary(Object summary){
		this.summary = summary;
	}

	public Object getSummary(){
		return summary;
	}

	public void setSubject(String subject){
		this.subject = subject;
	}

	public String getSubject(){
		return subject;
	}

	public void setInitiator(String initiator){
		this.initiator = initiator;
	}

	public String getInitiator(){
		return initiator;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setIsFileUpdated(boolean isFileUpdated){
		this.isFileUpdated = isFileUpdated;
	}

	public boolean isIsFileUpdated(){
		return isFileUpdated;
	}

	public void setBranch(String branch){
		this.branch = branch;
	}

	public String getBranch(){
		return branch;
	}

	public void setMemoNo(String memoNo){
		this.memoNo = memoNo;
	}

	public String getMemoNo(){
		return memoNo;
	}

	public void setAgendaNo(int agendaNo){
		this.agendaNo = agendaNo;
	}

	public int getAgendaNo(){
		return agendaNo;
	}

	public void setFinalDecision(String finalDecision){
		this.finalDecision = finalDecision;
	}

	public String getFinalDecision(){
		return finalDecision;
	}

	public void setMyNote(MyNote myNote){
		this.myNote = myNote;
	}

	public MyNote getMyNote(){
		return myNote;
	}

	public void setAgendaType(String agendaType){
		this.agendaType = agendaType;
	}

	public String getAgendaType(){
		return agendaType;
	}

	public void setAgendaFile(String agendaFile){
		this.agendaFile = agendaFile;
	}

	public String getAgendaFile(){
		return agendaFile;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setActions(List<Object> actions){
		this.actions = actions;
	}

	public List<Object> getActions(){
		return actions;
	}

	@Override
 	public String toString(){
		return 
			"AgendasItem{" + 
			"summary = '" + summary + '\'' + 
			",subject = '" + subject + '\'' + 
			",initiator = '" + initiator + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",is_file_updated = '" + isFileUpdated + '\'' + 
			",branch = '" + branch + '\'' + 
			",memo_no = '" + memoNo + '\'' + 
			",agenda_no = '" + agendaNo + '\'' + 
			",final_decision = '" + finalDecision + '\'' + 
			",my_note = '" + myNote + '\'' + 
			",agenda_type = '" + agendaType + '\'' + 
			",agenda_file = '" + agendaFile + '\'' + 
			",id = '" + id + '\'' + 
			",actions = '" + actions + '\'' + 
			"}";
		}
}