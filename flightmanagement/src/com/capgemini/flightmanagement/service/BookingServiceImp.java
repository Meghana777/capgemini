package com.capgemini.flightmanagement.service;


import com.capgemini.flightmanagement.beans.Booking;
import com.capgemini.flightmanagement.dao.BookingDAO;
import com.capgemini.flightmanagement.dao.BookingDAOImp;

public class BookingServiceImp implements BookingService {


	int bookingId;
	
	public int addBooking(Booking dto) throws Exception
	{
		BookingDAOImp dao = new BookingDAOImp();
			try {
				bookingId=dao.addBooking(dto);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		return bookingId;
	}
	
	public Booking viewBookingByBookingId1(int uid) 
	{
		BookingDAOImp dao = new BookingDAOImp();
		  Booking y = dao.viewBookingByBookingId(uid);
			return y;
	}
	
	public Booking deleteBooking1(int vid) 
	{
		BookingDAOImp dao = new BookingDAOImp();
		Booking z = dao.deleteBooking(vid);
			return z;
	}
	
	public Booking viewBooking()
	{
		BookingDAOImp dao = new BookingDAOImp();
		Booking w = dao.viewBooking();
		return w;
	}

	@Override
	public int addBooking(int bookingId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBooking(int bookingId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int viewBookingByBookingId(int bookingId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
		

	

