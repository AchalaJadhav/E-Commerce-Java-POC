package com.example.bct.EcommerceByAchala.repository;

import com.example.bct.EcommerceByAchala.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    List<Product> findAllByCategoryName(String categoryName);

    List<Product> findAllByCategoryNameAndPriceBetween(String category, Long price1, Long price2);

    List<Product> findAllByPriceBetween(Long price1, Long price2);

    Product findByProductId(Long id);
}
