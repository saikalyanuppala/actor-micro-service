package com.adp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adp.entiy.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
