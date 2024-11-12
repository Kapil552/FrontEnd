package com.user.controller;

import java.security.Principal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.support.FeignHttpClientProperties.OkHttp;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entities.User;
import com.user.userservice.UserService;
import com.user.userserviceimpl.UserServiceImpl;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;

	private Logger logger = LoggerFactory.getLogger(UserController.class);

	@PostMapping("/save")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User user1 = userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}

	int retryCount = 1;

	@GetMapping("/get/{userId}")
//	@CircuitBreaker(name="ratingHotelBreaker", fallbackMethod = "ratingHotelFallback")
//	@Retry(name="ratingHotelService", fallbackMethod = "ratingHotelFallback")
	@RateLimiter(name = "userRateLimiter", fallbackMethod = "ratingHotelFallback")
	public ResponseEntity<User> getSingleUser(@PathVariable String userId) {
		logger.info("Retry-Count: {} ", retryCount);
		retryCount++;
		User user = userService.getUser(userId);
		return ResponseEntity.ok(user);
	}

	// creating ratingHotelFallback method for Circuitbreaker
	public ResponseEntity<User> ratingHotelFallback(String userId, Exception exception) {
		logger.info("Fallback is executed  because service is down: " + exception.getMessage());
		User user = User.builder().email("abc@gmail.com").name("Demo").about("This is circuit-breaker").userId("10")
				.build();
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> allUsers = userService.getAllUser();
		return ResponseEntity.ok(allUsers);
	}
	
	@GetMapping("/currentUser")
	public String getLoggedUser(Principal principal) {
		return principal.getName();
	}
	
}
