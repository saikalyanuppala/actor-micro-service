package com.adp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adp.entiy.Actor;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Integer> {

}
