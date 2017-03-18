package com.movienight.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.movienight.app.model.User;
import com.movienight.app.service.user.UserService;

@RestController
public class UserController {

	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public ResponseEntity<User> addUser(@RequestBody User user) {
		User u = userService.saveUser(user);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	@RequestMapping(value = "/username", method = RequestMethod.GET)
	public ResponseEntity<Boolean> isUsernameAvailable(@RequestParam("username") String username) {
		Boolean status = userService.isUsernameAvailable(username);
		return new ResponseEntity<Boolean>(status, HttpStatus.OK);

	}
}
