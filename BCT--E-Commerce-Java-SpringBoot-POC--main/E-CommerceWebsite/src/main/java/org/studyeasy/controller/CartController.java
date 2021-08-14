package org.studyeasy.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.studyeasy.services.CartService;
import org.studyeasy.entity.Cart;


@RestController
public class CartController {
	
	@Autowired
	CartService service;
	
	@PreAuthorize("hasRole('USER')")
	@RequestMapping("/cart")
	public List<Cart> getCartItems()
	{
		return service.getCartItems();
	}
	
	@PreAuthorize("hasRole('USER')")
	@RequestMapping("/cart/{id}")
	public Cart getCartItem(@PathVariable int id)
	{
		return service.getCartItem(id); //Using get it will convert from optional to Customer type
	}
	
	@PreAuthorize("hasRole('USER')")
	@RequestMapping(method = RequestMethod.POST, value = "/cart")
	public void addCartItem( @RequestBody Cart listElement)
	{
		service.addCartItem(listElement);
	}
	
	@PreAuthorize("hasRole('USER')")
	@RequestMapping(method = RequestMethod.PUT, value = "/cart/{id}")
	public void updateCartItem( @RequestBody Cart listElement)
	{
		service.updateCartItem(listElement);
	}
	
	@PreAuthorize("hasRole('USER')")
	@RequestMapping(method = RequestMethod.DELETE, value = "/cart/{id}")
	public void updateCartItem(@PathVariable int id)
	{
		service.deleteCartItem(id);
		
	}

	
}
