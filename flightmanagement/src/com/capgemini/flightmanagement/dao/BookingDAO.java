package com.capgemini.flightmanagement.dao;

import com.capgemini.flightmanagement.beans.Booking;

public interface BookingDAO {
	
	public int addBooking(int bookingId);
	public int viewBooking(int bookingId);
	public int deleteBooking(int bookingId);
	public int viewBookingByBookingId(int bookingId);
	

	
	
	

}
