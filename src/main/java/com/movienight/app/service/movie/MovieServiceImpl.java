package com.movienight.app.service.movie;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movienight.app.model.Movie;
import com.movienight.app.repository.MovieRepository;

@Service
@Transactional
public class MovieServiceImpl implements MovieService {

	private final MovieRepository movieRepository;
	
	@Autowired
	public MovieServiceImpl(MovieRepository movieRepository){
		this.movieRepository = movieRepository;
	}
	
	public void saveMovie(Movie movie){
		movieRepository.save(movie);
	}

	@Override
	public List<Movie> getAllMovies() {
		return movieRepository.findAll();
	}

	@Override
	public Movie getMovieById(long id) {
		return movieRepository.getOne(id);
	}
	
	
}
