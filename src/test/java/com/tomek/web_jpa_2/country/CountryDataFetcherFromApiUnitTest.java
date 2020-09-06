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
}
