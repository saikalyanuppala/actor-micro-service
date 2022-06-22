package com.adp.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adp.entiy.Actor;
import com.adp.service.ActorService;
import com.adp.service.rest.MovieRestService;

@RestController
@RequestMapping("/actors")
public class ActorRestController {

	@Autowired
	private ActorService actorService;

	@Autowired
	private MovieRestService movieRestService;

	@GetMapping
	public List<Actor> getAllActors() {
		List<Actor> actors = actorService.getAllActors();
		actors.stream().forEach(actor -> actor.setMovies(movieRestService.getAllMoviesByActorId(actor.getActorId())));
		return actors;
	}

	@GetMapping("/{id}")
	public Actor getActorById(@PathVariable("id") Integer id) {
		Actor actor = actorService.getActorById(id)
				.orElseThrow(() -> new RuntimeException("Actor not found with id " + id));
		actor.setMovies(movieRestService.getAllMoviesByActorId(id));
		return actor;
	}
}
