package com.capgemini.flightmanagement.dao;

import com.capgemini.flightmanagement.beans.Booking;

public interface BookingDAO {
	
	public int viewBooking(Booking bookingId);
	public int deleteBooking(Booking bookingId);
	

	
	
	

}
