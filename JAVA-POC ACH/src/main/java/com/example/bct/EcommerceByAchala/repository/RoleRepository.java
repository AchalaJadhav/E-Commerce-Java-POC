package com.example.bct.EcommerceByAchala.repository;

import com.example.bct.EcommerceByAchala.entity.ERole;
import com.example.bct.EcommerceByAchala.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {

    Optional<Role> findByName(ERole name);
}
