package com.movienight.app.service.movie;

import java.util.List;

import com.movienight.app.model.Movie;

public interface MovieService {

	void saveMovie(Movie movie);
	
	List<Movie> getAllMovies();
	
	Movie getMovieById(long id);
}
