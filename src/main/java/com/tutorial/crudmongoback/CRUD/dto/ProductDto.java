package com.tutorial.crudmongoback.CRUD.dto;

public class ProductDto {
	
	private String name;
	private int prive;
	
	public ProductDto() {

	}

	public ProductDto(String name, int prive) {
		this.name = name;
		this.prive = prive;
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
