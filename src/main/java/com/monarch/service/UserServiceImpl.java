package com.monarch.service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.monarch.repository.UserRepository;
import com.monarch.model.User; 
 

@Service("userService2")
@Transactional
public class UserServiceImpl implements UserService {

	private static final AtomicLong counter = new AtomicLong();

	@Autowired
	UserRepository userRepository;

	public List<User> findAllUsers() {
		List<User> persons = userRepository.findAll();
		return persons;
	}

	@Override
	public User findById(Long id) {
		return userRepository.findOne(id);

	}

	@Override
	public User findByName(String name) {
		return userRepository.findByusername(name);
	}

	@Override
	public void saveUser(User person) {
		person.setUsername("vishal");
		person.setAddress("India");
		userRepository.save(person);
	}

	@Override
	public void updateUser(User user) {
		userRepository.save(user);

	}

	@Override
	public void deleteUserById(Long id) {
		userRepository.delete(id);

	}

	@Override
	public void deleteAllUsers() {
		userRepository.deleteAll();

	}

	@Override
	public boolean isUserExist(User person) {
		return userRepository.exists(person.getId());
	}

}
