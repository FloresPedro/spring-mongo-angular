package com.tutorial.crudmongoback.CRUD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.crudmongoback.CRUD.dto.ProductDto;
import com.tutorial.crudmongoback.CRUD.entity.Product;
import com.tutorial.crudmongoback.CRUD.repository.IProductRepository;

@Service
public class ProductService {

	@Autowired
	IProductRepository productRepository;
	
	public List<Product> getAll(){
		return productRepository.findAll();
	}
	
	public Product getOne(int id ){
		return productRepository.findById(id).get();
	}
	
	public Product save(ProductDto dto) {
		int id = 1;
		Product product = new Product(id, dto.getName(), dto.getPrive());
		return productRepository.save(product);
	}
}
