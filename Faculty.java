package com.CFBSProj.sayali.model;

public class Faculty {
	private int fId;
	private String fName;
	private Course c;
	//getter setter
	
	public int getfId() {
		return fId;
	}
	public void setfId(int fId) {
		this.fId = fId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public Course getC() {
		return c;
	}

	public void setC(Course c) {
		this.c = c;
	}
	//ToString
	@Override
	public String toString() {
		return "Faculty [fId=" + fId + ", fName=" + fName + ", c=" + c + "]";
	}
	
	
	
}
