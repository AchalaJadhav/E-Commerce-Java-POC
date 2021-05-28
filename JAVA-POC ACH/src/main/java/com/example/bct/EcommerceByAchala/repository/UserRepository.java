package com.example.bct.EcommerceByAchala.repository;

import com.example.bct.EcommerceByAchala.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User,Long> {

    @Query("select u from User u where u.email = :email")
    public User getUsersByEmail(@Param("email") String email);

    User findByUserId(Long id);
}
