package com.tomek.web_jpa_2.country;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountryDataFetcherFromApiUnitTest {

	private CountryDataFetcher countryDataFetcher = new CountryDataFetcherFromCountryApi();

	@Test
	void givenUrl_fetchesData() {
		String countryJson = countryDataFetcher.getCountryData("https://restcountries.eu/rest/v2/all");

		Assertions.assertNotNull(countryJson);
		}
	@Test
	void givenUrl_whenFetchFromCountryApi_returnsJsonRandomCountryData() {
		String countryJson = countryDataFetcher.getCountryData("https://restcountries.eu/rest/v2/all");

		Assertions.assertNotNull(countryJson);
		
		Assertions.assertTrue(countryJson.contains("\"name\":\"Greece\""));
		Assertions.assertTrue(countryJson.contains("\"capital\":\"Athens\""));
		Assertions.assertTrue(countryJson.contains("\"region\":\"Europe\",\"subregion\":\"Southern Europe\""));
		Assertions.assertTrue(countryJson.contains("\"nativeName\":\"Österreich\""));
		Assertions.assertTrue(countryJson.contains("\"capital\":\"Vienna\""));		
		Assertions.assertTrue(countryJson.contains("\"name\":\"French\",\"nativeName\":\"français\""));
		Assertions.assertTrue(countryJson.contains("\"name\":\"Latvian\",\"nativeName\":\"latviešu valoda\""));

	}
	
	@Test
	void givenUrl_fetchesData_withSuitableLength() {
		String countryJson = countryDataFetcher.getCountryData("https://restcountries.eu/rest/v2/all");

		Assertions.assertNotNull(countryJson);
		org.assertj.core.api.Assertions.assertThat(countryJson.length()).isGreaterThan(200000);
		}
	
}
