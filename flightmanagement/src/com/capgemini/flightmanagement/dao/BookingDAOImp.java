package com.capgemini.flightmanagement.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.capgemini.flightmanagement.beans.Booking;

public class BookingDAOImp {

	static HashMap<Integer, Booking> map = new HashMap<Integer, Booking>();

	public int addBooking(Booking dto) {
		map.put(dto.getBookingId(), dto);
		int bookingId = dto.getBookingId();
		System.out.println(map.containsKey(bookingId));
		// System.out.println(hm.get(r));
		return bookingId;
	}

	public Booking viewBookingByBookingId(int bookingId) {
		Booking y = new Booking();
		if (map.containsKey(bookingId)) {
			y = map.get(bookingId);
			return y;
		} else {
			return y;
		}
	}

	public Booking deleteBooking(int bookingId) {
		Booking z = new Booking();
		if (map.containsKey(bookingId)) {
			z = map.remove(bookingId);
			return z;
		} else {
			return z;
		}
	}

	public Booking viewBooking() {

		Set<Entry<Integer, Booking>> setOfEntries = map.entrySet();

		Iterator<Entry<Integer, Booking>> itr = setOfEntries.iterator();

		for (Entry<Integer, Booking> entry : setOfEntries) {
			System.out.println("BookingId : " + entry.getKey() + " " + "Details : " + entry.getValue());
		}
		return null;
	}
}
