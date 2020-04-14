package com.empresa.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.proyecto.entity.Catalog;
import com.empresa.proyecto.entity.CatalogCategory;
import com.empresa.proyecto.entity.CategoriesList;
import com.empresa.proyecto.entity.ProductList;
import com.empresa.proyecto.service.CategoryService;
import com.empresa.proyecto.service.ProductService;

@RestController
@RequestMapping(value = "/catalog")
public class CatalogController {

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private ProductService productService;

	@GetMapping
	public Catalog getCatalog() {
		CategoriesList categoriesList = categoryService.getCategories();
		Catalog catalog = new Catalog();
		catalog.setCategoriesData(categoriesList.getCategories());

		categoriesList.getCategories().forEach(c -> {
			ProductList productList = productService.getProducts(c.getId());
			catalog.getCategories().put(c.getId(), new CatalogCategory(productList.getProducts()));
		});

		return catalog;
	}

}
