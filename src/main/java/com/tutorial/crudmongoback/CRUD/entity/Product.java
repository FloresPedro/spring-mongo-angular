package com.tutorial.crudmongoback.CRUD.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Product {

	@Id
	private int id;
	private String name;
	private int prive;

	public Product() {
		super();
	}

	public Product(int id, String name, int prive) {
		super();
		this.id = id;
		this.name = name;
		this.prive = prive;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrive() {
		return prive;
	}

	public void setPrive(int prive) {
		this.prive = prive;
	}

}
