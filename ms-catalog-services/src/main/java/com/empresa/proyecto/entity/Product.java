package com.empresa.proyecto.entity;

public class Product {

	private String code;
	private String name;
	private Float price;
	private Long categoriaId;

	public Product() {
	}

	public Product(String code, String name, Float price, Long categoriaId) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.categoriaId = categoriaId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Long getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(Long categoriaId) {
		this.categoriaId = categoriaId;
	}

}
