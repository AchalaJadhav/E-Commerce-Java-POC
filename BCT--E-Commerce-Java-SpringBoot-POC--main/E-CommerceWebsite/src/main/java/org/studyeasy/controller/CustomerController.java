package org.studyeasy.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.studyeasy.services.CustomerService;
import org.studyeasy.entity.Customer;


@RestController
public class CustomerController {
	
	@Autowired
	CustomerService service;
	
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping("/customers")
	public List<Customer> getCustomers()
	{
		return service.getCustomers();
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping("/customers/{id}")
	public Customer getCutomer(@PathVariable int id)
	{
		return service.getCustomer(id); //Using get it will convert from optional to Customer type
	}
	
	//Preauthorize user checkout
	@PreAuthorize("hasRole('USER')")
	@RequestMapping(method = RequestMethod.POST, value = "/customers")
	public void addCustomer( @RequestBody Customer listElement)
	{
		service.addCustomer(listElement);
	}
	
	//Preauthorize user checkout
	@PreAuthorize("hasRole('USER')")
	@RequestMapping(method = RequestMethod.PUT, value = "/customers/{id}")
	public void updateCustomer( @RequestBody Customer listElement)
	{
		service.updateCustomer(listElement);
	}
	
	
	//Preauthorize user checkout
	@PreAuthorize("hasRole('USER')")
	@RequestMapping(method = RequestMethod.DELETE, value = "/customers/{id}")
	public void deleteCustomer(@PathVariable int id)
	{
		service.deleteCustomer(id);
		
	}

	
}
