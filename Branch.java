package com.CFBSProj.sayali.model;

public class Branch {
	private int bId;
	private String bName;
	private Faculty f;
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	
	public Faculty getF() {
		return f;
	}
	public void setF(Faculty f) {
		this.f = f;
	}
	@Override
	public String toString() {
		return "Branch [bId=" + bId + ", bName=" + bName + ", f=" + f + "]";
	}
	
	
	
}
