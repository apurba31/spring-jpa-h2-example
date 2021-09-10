package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="Guitar")
public class GuitarModel {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	
	public Long id;
	public String company;
	public String model;
	
	public GuitarModel() {
		super();
	}
	public GuitarModel(long id, String company, String model) {
		super();
		id = id;
		this.company = company;
		this.model = model;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}
