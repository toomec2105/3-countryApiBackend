package com.tomek.web_jpa_2.country;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class CountryDataFetcherFromApiIntegrationTest {

	@LocalServerPort
	private int port;

	@Autowired
	private CountryDataFetcherFromCountryApi countryDataFetcher;

	@Disabled
	@Test
	public void givenUrl_fetchesData() throws Exception {
		String countryJson = countryDataFetcher.getCountryData("https://restcountries.eu/rest/v2/all");

		Assertions.assertNotNull(countryJson);
	}
}