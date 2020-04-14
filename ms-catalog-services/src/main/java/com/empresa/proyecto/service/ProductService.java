package com.empresa.proyecto.service;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.empresa.proyecto.entity.ProductList;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ProductService {

	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "getFallbackProducts")
	
	public ProductList getProducts(Long idCategory) {
		return restTemplate.getForObject("http://products-service/products/by_category/" + idCategory,
				ProductList.class);
	}

	private ProductList getFallbackProducts(Long idCategory) {
        return new ProductList(Collections.emptyList());
    }
}
