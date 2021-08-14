package org.studyeasy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.studyeasy.entity.Cart;

@Repository
public interface CartRepository extends CrudRepository<Cart, Integer>{

}
