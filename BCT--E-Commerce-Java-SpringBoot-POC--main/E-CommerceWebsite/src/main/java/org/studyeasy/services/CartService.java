package org.studyeasy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.studyeasy.entity.Cart;
import org.studyeasy.repository.CartRepository;


@Service
public class CartService {
	
	@Autowired
	private CartRepository repo;

	public List<Cart> getCartItems() 
	{
		 List<Cart> list = new ArrayList<>();
			
		 for(Cart cart: repo.findAll())
		 {
			 list.add(cart);
		 }
		
		 	return list;
	}

	public Cart getCartItem(int id) {
		
		return repo.findById(id).get();
	}

	public void addCartItem(Cart listElement) {
		
		repo.save(listElement);
		
	}

	public void updateCartItem(Cart listElement) {
		
		repo.save(listElement);
	}

	public void deleteCartItem(int id) {
		repo.deleteById(id);
		
	}


	

}
