package com.movienight.app.util;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.movienight.app.model.Movie;

/**
 * Helper class for mapping JSON property when searching for movies.
 * API is returning an JSON object with 3 properties, one of them is Search which contains the
 * JSON array, and that array needs to be mapped to the List of Movie object.
 */
public class MoviesResponse {
	
	@JsonProperty("Search")
	private List<Movie> movies;

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	
	
}
