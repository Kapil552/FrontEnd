package com.user.service.entities;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
