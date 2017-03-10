package com.movienight.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movienight.app.model.Suggestion;

public interface SuggestionRepository extends JpaRepository<Suggestion, Long> {

}
