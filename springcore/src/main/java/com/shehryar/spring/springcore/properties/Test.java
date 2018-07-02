package com.shehryar.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/shehryar/spring/springcore/properties/propertiesconfig.xml");
		CountriesAndLanguages countriesAndLanguages = (CountriesAndLanguages) context.getBean("countriesandlangauges");
		System.out.println(countriesAndLanguages);
	}

}
