package com.tarun.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tarun.entities.CountryLanguage;
import com.tarun.services.CountryLanguageService;

//RestController :- Representational state transfer 	
@RestController
@RequestMapping("/api")
public class CountryLanguageController 
{
	@Autowired
	private CountryLanguageService countryLanguageService;
	
	@GetMapping("/home")
	public String myHome(){
		return "This is Normal home page";
	}
	
	@GetMapping("/all/country")
	public List<CountryLanguage> getCourses(){
		return countryLanguageService.getCountryLanguage();
	}
	
	//get single course by id 
	@GetMapping("/getbylanguage")
	public List<String> getCountryByCountryLanguage(@RequestParam("language") String language){
		return countryLanguageService.getCountryByCountryLanguage(language);
	}
	//get single course by id 
	@GetMapping("/getofficiallanguagebycountrycode")
	public  List<String> getOfficialLangaugeByCountryCode(@RequestParam("countrycode") String countryCode){
		return countryLanguageService.getOfficialLangaugeByCountryCode(countryCode);
	}
	
//	@GetMapping(path ="/add/countryLangauge")
//	public String addCourse(@RequestBody CountryLanguage course)
//	public List<CountryLanguage> addCourse()
//	{
//		List<CountryLanguage> readCsvAndReturnList = csvService.readCsvAndReturnList();
//		System.out.println(readCsvAndReturnList);
//		return readCsvAndReturnList;
//	}
}
