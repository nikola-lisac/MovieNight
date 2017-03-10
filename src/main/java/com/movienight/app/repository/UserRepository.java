package com.movienight.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movienight.app.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
