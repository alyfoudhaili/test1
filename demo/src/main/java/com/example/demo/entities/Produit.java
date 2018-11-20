package com.example.demo.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Produit {
	private Integer id;
	private String designation ; 
	private int prix;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	

}
