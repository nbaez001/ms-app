package com.empresa.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.empresa.proyecto.entity.Catalog;
import com.empresa.proyecto.entity.CatalogCategory;
import com.empresa.proyecto.entity.CategoriesList;
import com.empresa.proyecto.entity.ProductList;

@RestController
@RequestMapping(value = "/catalog")
public class CatalogController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping
	public Catalog getCatalog() {
		CategoriesList categoriesList = restTemplate.getForObject("http://localhost:9002/categories", CategoriesList.class);
		Catalog catalog = new Catalog();
		catalog.setCategoriesData(categoriesList.getCategories());
		
		categoriesList.getCategories()
		.forEach(c -> {
			ProductList productList = restTemplate.getForObject("http://localhost:9001/products/by_category/"+c.getId(),ProductList.class);
			catalog.getCategories().put(c.getId(), new CatalogCategory(productList.getProducts()));
		});
		
		return catalog;
	}
	
}
