package com.empresa.proyecto.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.proyecto.entity.CategoriesList;
import com.empresa.proyecto.entity.Category;

@RestController
@RequestMapping(value = "/categories")
public class CategoriesController {

	@GetMapping
	public CategoriesList list() {
		return new CategoriesList(Arrays.asList(
				new Category(1L, "Tecnologia"),
				new Category(2L, "Hogar y Electrodomesticos"),
				new Category(3L, "Moda")
				));
	}
	
}
