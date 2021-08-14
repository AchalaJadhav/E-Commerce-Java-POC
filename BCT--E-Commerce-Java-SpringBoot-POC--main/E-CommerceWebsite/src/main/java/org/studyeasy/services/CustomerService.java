package org.studyeasy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.studyeasy.entity.Customer;
import org.studyeasy.repository.CustomerRepository;


@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository repo;

	public List<Customer> getCustomers() 
	{
		 List<Customer> list = new ArrayList<>();
			
		 for(Customer customer: repo.findAll())
		 {
			 list.add(customer);
		 }
		
		 	return list;
	}

	public Customer getCustomer(int id) {
		
		return repo.findById(id).get();
	}

	public void addCustomer(Customer listElement) {
		
		repo.save(listElement);
		
	}

	public void updateCustomer(Customer listElement) {
		
		repo.save(listElement);
	}

	public void deleteCustomer(int id) {
		repo.deleteById(id);
		
	}


	

}
