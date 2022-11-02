package com.demo;

public class Student {
//	ctrl + alt + down
	private String sid;
	private String sname;
	private String sclass;
	
	public Student(String sid, String sname, String sclass) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sclass = sclass;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sclass=" + sclass + "]";
	}
	
	

}
