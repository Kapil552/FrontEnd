package com.service.hotelservice.hotelrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.service.hotelservice.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String>{

}
