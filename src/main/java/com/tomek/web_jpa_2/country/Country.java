package com.tomek.web_jpa_2.country;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "countries")
@Entity
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String capital;


	public Country(Long id, String name, String capital) {
		super();
		this.id = id;
		this.name = name;
		this.capital = capital;
	}

	public Country(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}