package com.empresa.proyecto.entity;

import java.util.List;

public class ProductList {
	List<Product> products;

	public ProductList() {
	}

	public ProductList(List<Product> products) {
		this.products = products;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
