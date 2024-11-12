package com.service.hotelservice.hotelservices;

import java.util.List;

import com.service.hotelservice.entities.Hotel;

public interface HotelService {

	Hotel create(Hotel hotel);
	
	List<Hotel> getAll();
	
	Hotel getById(String hotelId);
}
