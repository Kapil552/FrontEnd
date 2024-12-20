package com.service.ratingservice.service;

import java.util.List;

import com.service.ratingservice.entities.Ratings;

public interface RatingsService {

	
	Ratings create(Ratings ratings);
	
	List<Ratings> getAllRatings();
	
	List<Ratings> getRatingsByUserId(String userId);
	
	List<Ratings> getRatingsByHotelId(String hotelId);
}
