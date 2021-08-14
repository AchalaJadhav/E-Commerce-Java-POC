package org.studyeasy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.studyeasy.entity.Product;
import org.studyeasy.repository.ProductRepository;


@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repo;

	public List<Product> getProducts() 
	{
		 List<Product> list = new ArrayList<>();
			
		 for(Product product: repo.findAll())
		 {
			 list.add(product);
		 }
		
		 	return list;
	}

	public Product getProduct(int id) {
		
		return repo.findById(id).get();
	}

	public void addProduct(Product listElement) {
		
		repo.save(listElement);
		
	}

	public void updateProduct(Product listElement) {
		
		repo.save(listElement);
	}

	public void deleteProduct(int id) {
		repo.deleteById(id);
		
	}


	

}
