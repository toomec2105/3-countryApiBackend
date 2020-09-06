package com.tomek.web_jpa_2.country;

import org.springframework.stereotype.Service;

@Service
public interface CountryDataFetcher {
	public String getCountryData(String url);
}
