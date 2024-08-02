package com.tarun.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tarun.entities.CountryLanguage;

public interface CountryLanguageDao extends JpaRepository<CountryLanguage, Integer> {

	@Query("SELECT cl.language FROM CountryLanguage cl WHERE cl.countryCode =:countryCode AND cl.isOfficial='T' ORDER BY cl.percentage DESC")
    List<String> getByCountryCodeOrderByPercentageDesc(@Param("countryCode") String countryCode);
	
	@Query("SELECT cl.countryCode FROM CountryLanguage cl WHERE cl.language =:langauge ORDER BY cl.percentage DESC")
	List<String> getByCountryLanguageOrderByPercentageDesc(@Param("langauge") String langauge);
}
