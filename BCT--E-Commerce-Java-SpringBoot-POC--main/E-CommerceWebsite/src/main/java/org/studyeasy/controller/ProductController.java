package org.studyeasy.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;
import org.studyeasy.services.ProductService;
import org.studyeasy.entity.Product;


@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@PreAuthorize("hasRole('USER')")
	@RequestMapping("/products")
	public List<Product> getProducts()
	{
		return service.getProducts();
	}
	
	@PreAuthorize("hasRole('USER')")
	@RequestMapping("/products/{id}")
	public Product getProduct(@PathVariable int id)
	{
		return service.getProduct(id); //Using get it will convert from optional to Customer type
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.POST, value = "/products")
	public void addProduct( @RequestBody Product listElement)
	{
		service.addProduct(listElement);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.PUT, value = "/products/{id}")
	public void updateProduct( @RequestBody Product listElement)
	{
		service.updateProduct(listElement);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.DELETE, value = "/products/{id}")
	public void deleteProduct(@PathVariable int id)
	{
		service.deleteProduct(id);
		
	}

	
}
