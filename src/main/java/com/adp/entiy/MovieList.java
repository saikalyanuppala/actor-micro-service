package com.adp.entiy;

import java.util.List;

public class MovieList {
	private List<Movie> movies;

	public MovieList() {
		super();
	}

	public MovieList(List<Movie> movies) {
		super();
		this.movies = movies;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
}
