package com.example.bct.EcommerceByAchala.repository;

import com.example.bct.EcommerceByAchala.entity.OrderHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderHistoryRepository extends JpaRepository<OrderHistory, Long > {
    List<OrderHistory> findAllByUserId(Long id);
}
