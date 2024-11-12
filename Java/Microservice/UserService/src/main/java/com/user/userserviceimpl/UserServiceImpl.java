package com.user.userserviceimpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.entities.Hotel;
import com.user.entities.Ratings;
import com.user.entities.User;
import com.user.exceptions.ResourceNotFoundException;
import com.user.externals.services.HotelService;
import com.user.repository.UserRepository;
import com.user.userservice.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private HotelService hotelService;
	
	private Logger logger=LoggerFactory.getLogger(UserServiceImpl.class);

	@Override
	public User saveUser(User user) {
		// generate unique id
		String randonUserId = UUID.randomUUID().toString();
		user.setUserId(randonUserId);
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		List<User> users=userRepository.findAll();
		for(User user :users) {
			Ratings[] userRatings=restTemplate.getForObject("http://RATING-SERVICE/ratings/getByUserId/" +user.getUserId() , Ratings[].class);
			List<Ratings> ratings=Arrays.stream(userRatings).toList();
			
			List<Ratings> ratingsList=ratings.stream().map(rating->{
				ResponseEntity<Hotel> forEntity=restTemplate.getForEntity("http://HOTEL-SERVICE/hotels/getById/"+rating.getHotelId(), Hotel.class);
				Hotel hotel=forEntity.getBody();
				rating.setHotel(hotel);
				return rating;
			}).collect(Collectors.toList());
			
			user.setRatings(ratingsList); 
		}
		return  users;
	}

	@Override
	public User getUser(String userId) {
		User user = userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User with given id is not found on server" + userId));
		
		//fetching rating of the above user from rating service
		Ratings[] userRatings=restTemplate.getForObject("http://RATING-SERVICE/ratings/getByUserId/" +user.getUserId() , Ratings[].class);
		logger.info("{} ", userRatings);
		
		List<Ratings> ratings=Arrays.stream(userRatings).toList();
		
		List<Ratings> ratingsList=ratings.stream().map(rating->{
//			ResponseEntity<Hotel> forEntity=restTemplate.getForEntity("http://HOTEL-SERVICE/hotels/getById/"+rating.getHotelId(), Hotel.class);
			Hotel hotel=hotelService.getHotel(rating.getHotelId());
			rating.setHotel(hotel);
			return rating; 
		}).collect(Collectors.toList());
		
		user.setRatings(ratingsList);
		return user;
	}

}
