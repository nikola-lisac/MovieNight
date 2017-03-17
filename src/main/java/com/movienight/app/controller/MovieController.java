package com.movienight.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.movienight.app.model.Movie;
import com.movienight.app.repository.MovieRepository;
import com.movienight.app.service.omdb.OmdbService;

@RestController
public class MovieController {

	private MovieRepository movieRepo;
	private OmdbService omdb;

	@Autowired
	public MovieController(MovieRepository movieRepo, OmdbService omdb) {
		this.movieRepo = movieRepo;
		this.omdb = omdb;
	}

	@RequestMapping(value = "/movies/{title}", method = RequestMethod.GET)
	public ResponseEntity<List<Movie>> getMoviesFromOmdbAPI(@PathVariable String title) {
		List<Movie> listOfMovies = omdb.getMovies(title);

		if (listOfMovies == null) {
			return new ResponseEntity<List<Movie>>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<List<Movie>>(listOfMovies, HttpStatus.OK);
		}

	}

	/*
	 * @RequestMapping(value = "/movies/{title}", method = RequestMethod.GET)
	 * public ResponseEntity<Movie> getMovieFromOmdbAPI(@PathVariable String
	 * title) { Movie movie = omdb.getMovie(title);
	 * 
	 * if (movie.getResponse().equals("False")) { return new
	 * ResponseEntity<>(HttpStatus.NOT_FOUND); } else { return new
	 * ResponseEntity<Movie>(movie, HttpStatus.OK); }
	 * 
	 * }
	 */

}
