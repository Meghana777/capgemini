package com.capgemini.flightmanagement.service;

import com.capgemini.flightmanagement.beans.Booking;

public interface BookingService {
	public int addBooking(int bookingId);
	public Booking viewBooking();
	public int deleteBooking(int bookingId);
	public int viewBookingByBookingId(int bookingId);
	
	  

}
