package com.tarun.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarun.dao.CountryLanguageDao;
import com.tarun.entities.CountryLanguage;

@Service
public class CountryLanguageServiceImpl implements CountryLanguageService {

	@Autowired
	private CountryLanguageDao countryLanguageDao;
	
	

	/*
	 * Find All CountryLanguages from the Database
	 */
	@Override
	public List<CountryLanguage> getCountryLanguage() {
		List<CountryLanguage> findAll = countryLanguageDao.findAll();
		return findAll;
	}

	/*
	 * Find All CountryLanguages by the language and percentage should be decreasing order from the Database
	 */
	@Override
	public List<String> getCountryByCountryLanguage(String language) {
		List<String> findByCountryLanguageOrderByPercentageDesc = countryLanguageDao.getByCountryLanguageOrderByPercentageDesc(language);
		return findByCountryLanguageOrderByPercentageDesc;
	}

	/*
	 * Find All CountryLanguages by the countryCode and percentage should be decreasing order from the Database
	 */
	@Override
	public  List<String> getOfficialLangaugeByCountryCode(String countryCode) {
		 List<String> findByCountryCodeOrderByPercentageDesc = countryLanguageDao.getByCountryCodeOrderByPercentageDesc(countryCode);
		return findByCountryCodeOrderByPercentageDesc;
	}
}
