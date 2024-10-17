package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Siegfried", "sieg@hotmail.com", "999999", "12345");
		u = new User(1L, "Nina", "nina@hotmail.com", "888888", "12345");
		u = new User(1L, "Michelle", "michelle@hotmail.com", "777777", "12345");
		u = new User(1L, "Ana", "ana@hotmail.com", "666666", "12345");
		u = new User(1L, "Ana", "ana@hotmail.com", "666666", "12345");
		u = new User(1L, "Ana", "ana@hotmail.com", "666666", "12345");
		return ResponseEntity.ok().body(u);
	}

}