package com.shehryar.spring.springcore.properties;

import java.util.Properties;

public class CountriesAndLanguages {

	private Properties countryAndLanguages;

	@Override
	public String toString() {
		return "CountriesAndLanguages [countryAndLanguages=" + countryAndLanguages + "]";
	}

	public Properties getCountryAndLanguages() {
		return countryAndLanguages;
	}

	public void setCountryAndLanguages(Properties countryAndLanguages) {
		this.countryAndLanguages = countryAndLanguages;
	}

}
