package com.service.ratingservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.service.ratingservice.entities.Ratings;

public interface RatingRepository extends MongoRepository<Ratings, String>{

	List<Ratings> findByUserId(String userId);
	
	List<Ratings> findByHotelId(String hotelId);
}
