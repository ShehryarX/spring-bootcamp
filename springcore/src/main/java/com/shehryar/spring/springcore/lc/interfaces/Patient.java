package com.shehryar.spring.springcore.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {

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

	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterPropertiesSet()");
	}

	public void destroy() throws Exception {
		System.out.println("Inside destroy");
	}
}
