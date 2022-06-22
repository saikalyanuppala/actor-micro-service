package com.adp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adp.entiy.Actor;
import com.adp.repository.ActorRepository;

@Service
public class ActorService {

	@Autowired
	private ActorRepository actorRepository;
	
	public List<Actor> getAllActors() {
		return actorRepository.findAll();
	}

	public Optional<Actor> getActorById(Integer id) {
		return actorRepository.findById(id);
	}
}
