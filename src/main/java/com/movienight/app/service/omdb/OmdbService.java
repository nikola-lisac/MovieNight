package com.movienight.app.service.omdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.movienight.app.model.Movie;

@Service
public class OmdbService {

	private RestTemplate restTemplate;
	private static final String OMDB_TITLE_URL = "http://www.omdbapi.com/?t=%s&type=movie&plot=short";
	
	@Autowired
	public OmdbService(RestTemplate restTemplate){
		this.restTemplate = restTemplate;
	}
	
	public Movie getMovie(String title){
		String url = String.format(OMDB_TITLE_URL, title);
		return restTemplate.getForObject(url, Movie.class);
	
		
	}
}
