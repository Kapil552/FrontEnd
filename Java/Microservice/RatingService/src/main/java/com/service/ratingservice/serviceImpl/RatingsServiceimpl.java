package com.service.ratingservice.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.ratingservice.entities.Ratings;
import com.service.ratingservice.repository.RatingRepository;
import com.service.ratingservice.service.RatingsService;

@Service
public class RatingsServiceimpl implements RatingsService {

	@Autowired
	RatingRepository ratingRepository;
	
	@Override
	public Ratings create(Ratings ratings) {
		String responseId=UUID.randomUUID().toString();
		ratings.setRatingId(responseId);
		return ratingRepository.save(ratings);
	}

	@Override
	public List<Ratings> getAllRatings() {
		
		return ratingRepository.findAll();
	}

	@Override
	public List<Ratings> getRatingsByUserId(String userId) {
		return ratingRepository.findByUserId(userId);
	}

	@Override
	public List<Ratings> getRatingsByHotelId(String hotelId) {
		return ratingRepository.findByHotelId(hotelId);
	}

}
