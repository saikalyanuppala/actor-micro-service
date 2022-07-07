package com.adp.service.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.adp.entiy.Movie;

@Component
@ConfigurationProperties(ignoreUnknownFields = false, value = "movie.service")
public class MovieRestService {

	private static final String MOVIE_PATH = "movies/actor/";
	@Autowired
	private RestTemplate restTemplate;

	private String apihost;

	public List<Movie> getAllMoviesByActorId(Integer id) {
		String url = apihost + MOVIE_PATH + id;

		HttpHeaders headers = new HttpHeaders();
		headers.setBasicAuth("sai", "sai");
		HttpEntity<String> httpEntity = new HttpEntity<String>(headers);

		ResponseEntity<List<Movie>> response = restTemplate.exchange(url, HttpMethod.GET, httpEntity,
				new ParameterizedTypeReference<List<Movie>>() {
				});
		List<Movie> movies = response.getBody();
		return movies;
	}

	public String getApihost() {
		return apihost;
	}

	public void setApihost(String apihost) {
		this.apihost = apihost;
	}
}
