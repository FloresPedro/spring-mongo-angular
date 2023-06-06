package com.tutorial.crudmongoback.CRUD.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.crudmongoback.CRUD.entity.Product;

@Repository
public interface IProductRepository extends MongoRepository<Product, Integer> {
	
}
