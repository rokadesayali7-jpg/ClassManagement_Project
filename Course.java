package com.CFBSProj.sayali.model;

public class Course {
	private int cId;
	private String cName;
	
	// getter setter

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	
	
	
	// ToString
	
	@Override
	public String toString() {
		return "Course [cId=" + cId + ", cName=" + cName + "]";
	}

	
}
