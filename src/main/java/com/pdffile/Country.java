package com.pdffile;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {

	@Id
	private int id;
	private List country;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List getCountry() {
		return country;
	}
	public void setCountry(List country) {
		this.country = country;
	}
	
}
