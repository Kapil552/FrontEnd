package com.user.externals.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.user.entities.Hotel;

@FeignClient(name="HOTEL-SERVICE")
public interface HotelService {

		@GetMapping("/hotels/getById/{hotelId}")
		Hotel getHotel(@PathVariable String hotelId);
	
}
