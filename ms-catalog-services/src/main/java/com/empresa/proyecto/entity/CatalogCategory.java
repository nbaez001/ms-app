package com.empresa.proyecto.entity;

import java.util.List;

public class CatalogCategory {

	private List<Product> products;

	public CatalogCategory() {
	}

	public CatalogCategory(List<Product> products) {
		this.products = products;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
