package com.empresa.proyecto.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Catalog {

	List<Category> categoriesData;
	Map<Long, CatalogCategory> categories;

	public Catalog() {
		categories = new HashMap<>();
	}

	public Catalog(List<Category> categoriesData, Map<Long, CatalogCategory> categories) {
		this.categoriesData = categoriesData;
		this.categories = categories;
	}

	public List<Category> getCategoriesData() {
		return categoriesData;
	}

	public void setCategoriesData(List<Category> categoriesData) {
		this.categoriesData = categoriesData;
	}

	public Map<Long, CatalogCategory> getCategories() {
		return categories;
	}

	public void setCategories(Map<Long, CatalogCategory> categories) {
		this.categories = categories;
	}

}
