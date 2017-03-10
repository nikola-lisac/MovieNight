package com.movienight.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movienight.app.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
