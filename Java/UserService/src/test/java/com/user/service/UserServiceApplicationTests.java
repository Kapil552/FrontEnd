package com.user.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.user.entities.Ratings;
import com.user.externals.services.RatingService;


@SpringBootTest
class UserServiceApplicationTests {

	@Test
	void contextLoads() {
	}
	

	@Autowired
	private RatingService ratingService;

//	@Test
//	void createRating() {
//		Ratings ratings=Ratings.builder().rating(10).userId("").hotelId("").feedback("This is created using feign client").build();
//		Ratings savedRatings=ratingService.createRating(ratings);
//		System.out.println("New rating created");
//	}
}
