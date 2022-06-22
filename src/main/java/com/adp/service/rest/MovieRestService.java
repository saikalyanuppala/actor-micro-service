package com.adp.service.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.adp.entiy.Movie;

@Service
public class MovieRestService {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${movie.service.url}")
	private String url;

	public List<Movie> getAllMoviesByActorId(Integer id) {
		ResponseEntity<List<Movie>> response = restTemplate.exchange(url + id, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Movie>>() {
				});
		List<Movie> movies = response.getBody();
		return movies;
	}
}
