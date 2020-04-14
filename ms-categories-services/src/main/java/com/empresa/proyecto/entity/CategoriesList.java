package com.empresa.proyecto.entity;

import java.util.List;

public class CategoriesList {

	private List<Category> categories;

	public CategoriesList() {
	}

	public CategoriesList(List<Category> categories) {
		this.categories = categories;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

}
