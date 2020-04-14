package com.empresa.proyecto.controller;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.proyecto.entity.Product;
import com.empresa.proyecto.entity.ProductList;

@RestController
@RequestMapping(value = "/products")
public class ProductsController {

	@GetMapping
	public ProductList list() {
		return mockedList();
	}
	
	@GetMapping(value = "/{code}")
	public Product getProduct(@PathVariable("code") String code) {
		return mockedList()
				.getProducts()
				.stream()
				.filter(p->p.getCode().equals(code))
				.findFirst()
				.get();
	}
	
	@GetMapping(value = "/by_category/{categoryId}")
	public ProductList productsInCategory(@PathVariable("categoryId") Long categoryId) {
		ProductList byCat = mockedList();
		byCat.setProducts(byCat.getProducts()
				.stream()
				.filter(product -> product.getCategoriaId().equals(categoryId))
				.collect(Collectors.toList())
		);
		
		return byCat;
	}

	private ProductList mockedList() {
		return new ProductList(Arrays.asList(
				new Product("1", "Samsung Galaxy S10", 60000f, 1L),
				new Product("2", "Pineaple Phone X5", 200000f, 1L),
				new Product("3", "Aire Acondicionado Inverter", 20000f, 2L),
				new Product("4", "Cortina de baño", 200f, 2L), 
				new Product("5", "Remera", 400f, 3L),
				new Product("6", "Pantalon Jeans Lovis", 4000f, 3L)));
	}
}
