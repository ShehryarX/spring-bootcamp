package com.shehryar.spring.springcore.reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/shehryar/spring/springcore/reftypes/reftypesconfig.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
	}

}
