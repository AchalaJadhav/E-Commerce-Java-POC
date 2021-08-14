package org.studyeasy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.studyeasy.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{

}
