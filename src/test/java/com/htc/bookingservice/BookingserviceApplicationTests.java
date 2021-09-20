package com.htc.bookingservice;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.htc.bookingservice.entity.BookingDetails;
import com.htc.bookingservice.persistance.BookingServiceInterface;



@SpringBootTest
class BookingServiceApplicationTests {
	@Autowired
	BookingServiceInterface repo;

	@Test
	void contextLoads() {
	}
	@Test
	public void bookingdeatils_persistedInDataBase_elseTestFailure() {
		BookingDetails bookingDetails = new BookingDetails();
		bookingDetails.setBookingId(1L);
	    bookingDetails.setCentreid(2L);
	    bookingDetails.setPincode("123456");
		
		repo.save(bookingDetails);
		assertNotNull(repo.findById(1L).get());
		
	}


}
