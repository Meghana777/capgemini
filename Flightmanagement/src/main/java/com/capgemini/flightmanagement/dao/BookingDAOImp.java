package com.capgemini.flightmanagement.dao;



import java.util.HashMap;
import java.util.Map;

import com.capgemini.flightmanagement.beans.Booking;

public class BookingDAOImp implements BookingDAO {
	
	Map<Integer, Booking> map = new HashMap<Integer, Booking>();

	public Map<Integer, Booking> getMap() {
		return map;
	}

	public void setMap(Map<Integer, Booking> map) {
		this.map = map;
	}

	
	
	
	public int viewBooking(Booking bookingId) {
		Booking b = map.put(1001,new Booking());
		
		map.put(1002, new Booking());
		map.put(1003, new Booking());
		map.put(1004, new Booking());
		map.put(1005, new Booking());
		map.put(1006, new Booking());
		
		
		System.out.println(b);
		return 0;
	}

	public int deleteBooking(Booking bookingId) {
		
		return 0;
	}

     
 	


}
