package com.shehryar.spring.springcore.lc.xmlconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/shehryar/spring/springcore/lc/interfaces/config.xml");
		Patient p = (Patient) context.getBean("patient");
		System.out.println(p);
		context.registerShutdownHook();
	}
}
