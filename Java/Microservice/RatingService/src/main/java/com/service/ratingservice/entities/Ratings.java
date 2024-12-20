package com.service.ratingservice.entities;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("user_ratings")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ratings {
	
	@Id
	private String ratingId;
	
	private String userId;
	
	private String hotelId;
	
	private Integer rating;
	
	private String feedback;
	
}
