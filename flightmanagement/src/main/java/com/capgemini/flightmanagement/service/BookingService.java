package com.capgemini.flightmanagement.service;

import com.capgemini.flightmanagement.beans.Booking;

public interface BookingService {
	
	public int viewBooking(Booking bookingId);
	public int deleteBooking(Booking bookingId);
	
	  

}
