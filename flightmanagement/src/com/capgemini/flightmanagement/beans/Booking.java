package com.capgemini.flightmanagement.beans;

import java.math.BigInteger;
import java.util.Date;
import java.util.Random;

public class Booking {
	
	private int bookingId;
	/*BigInteger userId;
	Date bookingDate;
	double ticketCost;
	String flight;*/
	private int noOfPassengers;
	private String passengername;
	private String gender;
	private int age;
	private BigInteger phoneno;
	private BigInteger idNumber;
	private int p;
	
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	/*public BigInteger getUserId() {
		return userId;
	}
	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public double getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(double ticketCost) {
		this.ticketCost = ticketCost;
	}
	public String getFlight() {
		return flight;
	}
	public void setFlight(String flight) {
		this.flight = flight;
	}*/
	public int getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	public String getPassengername() {
		return passengername;
	}
	public void setPassengername(String passengername) {
		this.passengername = passengername;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public BigInteger getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(BigInteger phoneno) {
		this.phoneno = phoneno;
	}
	public BigInteger getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(BigInteger idNumber) {
		this.idNumber = idNumber;
	}
	public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}
	
@Override
	public String toString() {
		return "Booking [noOfPassengers=" + noOfPassengers + ", passengername=" + passengername + ", gender=" + gender
				+ ", age=" + age + ", phoneno=" + phoneno + ", idNumber=" + idNumber + "]";
	}
public Booking( int noOfPassengers, String passengername, String gender, int age, BigInteger phoneno,
		BigInteger idNumber) {
	super();
	Random random = new Random();
	
	this.noOfPassengers = noOfPassengers;
	this.bookingId = random.nextInt(9999);
	this.passengername = passengername;
	this.gender = gender;
	this.age = age;
	this.phoneno = phoneno;
	this.idNumber = idNumber;
}
public Booking() {
	super();
}
}
	

	 