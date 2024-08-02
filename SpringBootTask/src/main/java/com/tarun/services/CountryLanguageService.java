package com.tarun.services;

import java.util.List;

import com.tarun.entities.CountryLanguage;


public interface CountryLanguageService {

	/*
	 * To get the list of country
	 */
	public List<CountryLanguage> getCountryLanguage();
		
	/*
	 * To get the country by CountryLanguage
	 */
	public List<String> getCountryByCountryLanguage(String language);
	
	/*
	 * To get the country by CountryCode
	 */
	public  List<String> getOfficialLangaugeByCountryCode(String countryCode);
	
	

}
