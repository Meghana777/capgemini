package com.capgemini.flightmanagement.beans;

import java.math.BigInteger;

public class Passenger {
	
	private BigInteger pnrNumber;
	private String passengerName;
	private int passengerAge;
	private BigInteger passengerUIN;
	private double Luggage;
	
	//Getter and Setter methods//
	
	public BigInteger getPnrNumber() {
		return pnrNumber;
	}
	public void setPnrNumber(BigInteger pnrNumber) {
		this.pnrNumber = pnrNumber;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	public BigInteger getPassengerUIN() {
		return passengerUIN;
	}
	public void setPassengerUIN(BigInteger passengerUIN) {
		this.passengerUIN = passengerUIN;
	}
	public double getLuggage() {
		return Luggage;
	}
	public void setLuggage(double luggage) {
		Luggage = luggage;
	}
	
	//toString() method//
	
	@Override
	public String toString() {
		return "Passenger [passengerName=" + passengerName + ", passengerAge=" + passengerAge + ", Luggage=" + Luggage
				+ "]";
	}
	
	
	
	

}
