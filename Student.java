package com.CFBSProj.sayali.model;

public class Student {
	private int sId;
	private String sName;
	private Branch b;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	public Branch getB() {
		return b;
	}
	public void setB(Branch b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", b=" + b + "]";
	}
	
	
}
