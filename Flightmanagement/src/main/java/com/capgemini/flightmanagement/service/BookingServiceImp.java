package com.capgemini.flightmanagement.service;


import com.capgemini.flightmanagement.beans.Booking;
import com.capgemini.flightmanagement.dao.BookingDAOImp;

public class BookingServiceImp implements BookingService {
	
	
		BookingDAOImp dao = new BookingDAOImp();
		
		public BookingDAOImp getDao() {
			return dao;
		}
		
		public void setDao(BookingDAOImp dao) {
			this.dao = dao;
		}

		

		public int viewBooking(Booking bookingId) {
			// TODO Auto-generated method stub
			return dao.viewBooking(bookingId);
		}

		public int deleteBooking(Booking bookingId) {
			// TODO Auto-generated method stub
			return dao.deleteBooking(bookingId);
		}

		

	
}
