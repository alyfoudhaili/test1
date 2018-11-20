package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.IproduitRep;
import com.example.demo.entities.Produit;
import com.fasterxml.jackson.annotation.JacksonInject;

@RestController
public class ProduitService {
	@Autowired
	private IproduitRep pdao;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Produit> requestMethodGetProduit() {
		return pdao.findAll();
	}

}
