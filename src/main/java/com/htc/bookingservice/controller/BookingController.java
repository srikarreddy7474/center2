package com.htc.bookingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.bookingservice.entity.BookingDetails;

@RestController
@RequestMapping("/api")
public class BookingController {
	@Autowired
	private com.htc.bookingservice.persistance.BookingServiceInterface bookingServiceInterface;
	
	@GetMapping("/bookingService/{bookingId}") 
	public BookingDetails getBookingDetailsById(@PathVariable Long bookingId) {
		BookingDetails bookingdetails =null;
	
		bookingdetails=bookingServiceInterface.findById(bookingId).get();
		return bookingdetails;
	
	}
	@PostMapping("/addBookingDetails") 
	public BookingDetails createDetails(@RequestBody BookingDetails bookingDetails) {
		   
		 return bookingServiceInterface.save(bookingDetails);
		 
	}
}
