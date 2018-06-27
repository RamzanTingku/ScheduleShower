package com.example.ramzanullah.shcheduleshower.MeetingInfo.DataModel;

import com.google.gson.annotations.SerializedName;

public class Meta{

	@SerializedName("offset")
	private int offset;

	@SerializedName("count")
	private int count;

	@SerializedName("pagesize")
	private int pagesize;

	public void setOffset(int offset){
		this.offset = offset;
	}

	public int getOffset(){
		return offset;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setPagesize(int pagesize){
		this.pagesize = pagesize;
	}

	public int getPagesize(){
		return pagesize;
	}

	@Override
 	public String toString(){
		return 
			"Meta{" + 
			"offset = '" + offset + '\'' + 
			",count = '" + count + '\'' + 
			",pagesize = '" + pagesize + '\'' + 
			"}";
		}
}