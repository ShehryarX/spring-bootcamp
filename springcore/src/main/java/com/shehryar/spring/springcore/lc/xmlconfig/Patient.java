package com.shehryar.spring.springcore.lc.xmlconfig;

public class Patient {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside the setter");
		this.id = id;
	}

	public void hi() {
		System.out.println("Inside hi()");
	}
	
	public void bye() {
		System.out.println("Inside bye()");
	}
	
	@Override
	public String toString() {
		return "id: " + id;
	}
}
