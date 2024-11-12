package com.user.externals.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.user.entities.Ratings;

@FeignClient(name="RATING-SERVICE")
public interface RatingService {

	@PostMapping("/ratings/save")
	public Ratings createRating(Ratings ratings);
	
	@PutMapping("/ratings/{ratingId}")
	public Ratings updateRating(@PathVariable String ratingId, Ratings ratings);
	
	@DeleteMapping("/ratings/{ratingId}")
	public void deleteRating(@PathVariable String ratingId);
}
