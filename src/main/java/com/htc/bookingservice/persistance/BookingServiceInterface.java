package com.htc.bookingservice.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.htc.bookingservice.entity.BookingDetails;



public interface  BookingServiceInterface extends JpaRepository<BookingDetails, Long> {
	

}
