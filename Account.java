package com.CFBSProj.sayali.model;

public class Account {
	// Encapsulation
	private int id;
	private String name;

	// getter setter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// ToString
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + "]";
	}

}
