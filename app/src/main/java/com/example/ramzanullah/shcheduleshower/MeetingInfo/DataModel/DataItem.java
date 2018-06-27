package com.example.ramzanullah.shcheduleshower.MeetingInfo.DataModel;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("summary")
	private String summary;

	@SerializedName("committee")
	private Committee committee;

	@SerializedName("address")
	private String address;

	@SerializedName("agendas")
	private List<AgendasItem> agendas;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("is_visited")
	private boolean isVisited;

	@SerializedName("title")
	private String title;

	@SerializedName("meeting_attendance_is_enable")
	private boolean meetingAttendanceIsEnable;

	@SerializedName("attendances")
	private List<AttendancesItem> attendances;

	@SerializedName("cover_latter")
	private String coverLatter;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("id")
	private int id;

	@SerializedName("event_time")
	private String eventTime;

	public void setSummary(String summary){
		this.summary = summary;
	}

	public String getSummary(){
		return summary;
	}

	public void setCommittee(Committee committee){
		this.committee = committee;
	}

	public Committee getCommittee(){
		return committee;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setAgendas(List<AgendasItem> agendas){
		this.agendas = agendas;
	}

	public List<AgendasItem> getAgendas(){
		return agendas;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setIsVisited(boolean isVisited){
		this.isVisited = isVisited;
	}

	public boolean isIsVisited(){
		return isVisited;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setMeetingAttendanceIsEnable(boolean meetingAttendanceIsEnable){
		this.meetingAttendanceIsEnable = meetingAttendanceIsEnable;
	}

	public boolean isMeetingAttendanceIsEnable(){
		return meetingAttendanceIsEnable;
	}

	public void setAttendances(List<AttendancesItem> attendances){
		this.attendances = attendances;
	}

	public List<AttendancesItem> getAttendances(){
		return attendances;
	}

	public void setCoverLatter(String coverLatter){
		this.coverLatter = coverLatter;
	}

	public String getCoverLatter(){
		return coverLatter;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setEventTime(String eventTime){
		this.eventTime = eventTime;
	}

	public String getEventTime(){
		return eventTime;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"summary = '" + summary + '\'' + 
			",committee = '" + committee + '\'' + 
			",address = '" + address + '\'' + 
			",agendas = '" + agendas + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",is_visited = '" + isVisited + '\'' + 
			",title = '" + title + '\'' + 
			",meeting_attendance_is_enable = '" + meetingAttendanceIsEnable + '\'' + 
			",attendances = '" + attendances + '\'' + 
			",cover_latter = '" + coverLatter + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			",id = '" + id + '\'' + 
			",event_time = '" + eventTime + '\'' + 
			"}";
		}
}