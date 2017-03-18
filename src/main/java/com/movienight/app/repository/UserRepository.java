package com.movienight.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.movienight.app.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@Query("SELECT COUNT(u.id) FROM User u WHERE u.username=?1")
	Long checkIfUsernameExists(String username);
}
