package com.example.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Produit;

@Repository
public interface IproduitRep extends MongoRepository<Produit, Integer> {

}
