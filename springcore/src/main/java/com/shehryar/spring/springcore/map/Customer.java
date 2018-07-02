package com.shehryar.spring.springcore.map;

import java.util.Map;

public class Customer {
	private int id;
	private Map<Integer, String> products;

	public Map<Integer, String> getProducts() {
		return products;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", products=" + products + "]";
	}
	
	public void setProducts(Map<Integer, String> products) {
		this.products = products;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
