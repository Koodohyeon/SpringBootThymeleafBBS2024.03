package com.example.abbs.entity;

public class Anniversary {
	private int aid;
	private String uid;
	private String aname;
	private String adate;
	private int isholiday;
	
	
	public Anniversary() { }
	public Anniversary(int aid, String uid, String aname, String adate, int isholiday) {
		super();
		this.aid = aid;
		this.uid = uid;
		this.aname = aname;
		this.adate = adate;
		this.isholiday = isholiday;
	}
	@Override
	public String toString() {
		return "Anniversary [aid=" + aid + ", uid=" + uid + ", aname=" + aname + ", adate=" + adate + ", isholiday="
				+ isholiday + "]";
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAdate() {
		return adate;
	}
	public void setAdate(String adate) {
		this.adate = adate;
	}
	public int getIsholiday() {
		return isholiday;
	}
	public void setIsholiday(int isholiday) {
		this.isholiday = isholiday;
	}
	
	

}
