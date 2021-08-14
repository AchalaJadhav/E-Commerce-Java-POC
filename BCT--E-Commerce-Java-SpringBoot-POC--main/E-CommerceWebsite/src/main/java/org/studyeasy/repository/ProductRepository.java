package org.studyeasy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.studyeasy.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{

}
