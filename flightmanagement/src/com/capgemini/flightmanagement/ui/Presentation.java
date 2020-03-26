package com.capgemini.flightmanagement.ui;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Scanner;

import com.capgemini.flightmanagement.beans.Booking;
import com.capgemini.flightmanagement.service.BookingServiceImp;

public class Presentation {
	public static void main(String[] args) {
		// BigInteger bookingId;
		int n = 1, choice;
		String passengername;
		int age;
		String gender;
		BigInteger phoneno;
		BigInteger idNumber;
		int noOfPassengers;

		Scanner scan = new Scanner(System.in);

		BookingServiceImp service = new BookingServiceImp();

		while (n != 6) {
			System.out.println("1.addBooking");
			System.out.println("2.modifyBooking");
			System.out.println("3.viewBooking");
			System.out.println("4.viewAllBooking");
			System.out.println("5.deleteBooking");
			System.out.println("6.exit");
			System.out.println("Enter Choice");
			choice = scan.nextInt();

			switch (choice) {
			case 1:

				System.out.println("Number of Passengers");
				noOfPassengers = scan.nextInt();

				int i;
				for (i = 1; i <= noOfPassengers; i++) {
					System.out.println("Enter Name");
					passengername = scan.next() + scan.nextLine();

					System.out.println("Enter Age");
					age = scan.nextInt();

					System.out.println("Gender");
					gender = scan.next() + scan.nextLine();

					System.out.println("Enter phone number");
					phoneno = scan.nextBigInteger();

					System.out.println("Enter Id number");
					idNumber = scan.nextBigInteger();

					Booking booking = new Booking(noOfPassengers, passengername, gender, age, phoneno, idNumber);
					System.out.println(noOfPassengers + "ticket has been succesfully booked.");

					try {
						int random = service.addBooking(booking);
						System.out.println(passengername + " your BookingId is " + random);
					} catch (Exception e) {

						e.printStackTrace();
					}
				}
				break;
			case 3:

				System.out.print("Enter Your BookingId : ");
				int uid = scan.nextInt();
				try {
					Booking y = service.viewBooking();

					if (y.getBookingId() == uid) {
						System.out.println("Booking Details :Passengername = " + y.getPassengername() + "Gender = "
								+ y.getGender() + "Age = " + y.getAge() + "Phoeneno = " + y.getPhoneno() + "IdNumber = "
								+ y.getIdNumber());
					} else {
						System.out.println("Sorry No details Found...");
					}
				} catch (Exception e) {
					System.out.println("ERROR 404: BookingId not found");
				}
				break;
			case 4: {
				service.viewBooking();

			}
			break;
			

			case 5:
				System.out.println("enter the bookingId to delete the ticket details");
				int vid = scan.nextInt();
				try {
					Booking z = service.deleteBooking1(vid);
					if (z.getBookingId() == vid) {
						System.out.println(vid + "booking details are deleted succesfully");
					}
					else
					{
						System.out.println("Sorry No details Found...");
					}
				} 
				catch (Exception e) {
					System.out.println("ERROR 404: BookingId not found");
				}
				break;
			
		
	}
		}
	}
}
	

