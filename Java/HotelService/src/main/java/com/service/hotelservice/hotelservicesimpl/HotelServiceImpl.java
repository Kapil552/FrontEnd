package com.service.hotelservice.hotelservicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.hotelservice.entities.Hotel;
import com.service.hotelservice.exceptions.ResourceNotFoundException;
import com.service.hotelservice.hotelservices.HotelService;
import com.service.hotelservice.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService{

	@Autowired
	HotelRepository hotelRepository;
	
	@Override
	public Hotel create(Hotel hotel) {
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
		return hotelRepository.findAll();
	}

	@Override
	public Hotel getById(String hotelId) {
		
		return hotelRepository.findById(hotelId).orElseThrow(()->new ResourceNotFoundException("hotel with given id not found....."));
	}

}
