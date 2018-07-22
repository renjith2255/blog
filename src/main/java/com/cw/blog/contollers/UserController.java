package com.cw.blog.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cw.blog.models.User;
import com.cw.blog.repositories.UserRepository;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping
	public List<User> list() {
		return userRepository.findAll();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody User user) {
		userRepository.save(user);
	}

	@GetMapping("/{id}")
	public User get(@PathVariable("id") long id) {
		return userRepository.getOne(id);
	}
}
