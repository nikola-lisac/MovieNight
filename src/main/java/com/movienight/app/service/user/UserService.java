package com.movienight.app.service.user;

import com.movienight.app.model.User;

public interface UserService {

	User getUserById(long id);

	User saveUser(User user);

	boolean isUsernameAvailable(String username);
}
