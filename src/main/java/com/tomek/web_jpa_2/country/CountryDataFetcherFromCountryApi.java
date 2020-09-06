package com.tomek.web_jpa_2.country;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CountryDataFetcherFromCountryApi implements CountryDataFetcher {

	@Override
	public String getCountryData(String url) {
		
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(url, String.class);
		

	}

}
