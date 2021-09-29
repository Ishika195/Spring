package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
	@GetMapping("/")
	void getUsers() {
		System.out.println("Called.....");
	}
	@GetMapping("/{id}")
	void getUser(@PathVariable Integer id) {
		System.out.println("Called....."+id);
	}
	@PostMapping
	String postcall(@RequestBody User user) {
		System.out.println("Post request......");
		System.out.println("got user" + user.getName());
		return "Post called";
	}
	@PutMapping
	String handlePutMapping() {
		System.out.println("Put request......");
		return "Put method called.";
	}
}
