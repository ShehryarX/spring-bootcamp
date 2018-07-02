package com.shehryar.spring.springcore.setterassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/shehryar/spring/springcore/setterassignment/config.xml");
		ShoppingCart cart = (ShoppingCart) context.getBean("shoppingcart");
		System.out.println(cart);
	}

}
