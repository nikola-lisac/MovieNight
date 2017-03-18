package com.movienight.app.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movienight.app.model.User;
import com.movienight.app.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;
	// private PasswordEncoder passwordEncoder;
	private final long USERNAME_AVAILABLE = 0;

	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User getUserById(long id) {
		return userRepository.findOne(id);
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public boolean isUsernameAvailable(String username) {
		long status = userRepository.checkIfUsernameExists(username);
		if (status == USERNAME_AVAILABLE) {
			return true;
		} else {
			return false;
		}
	}

}
