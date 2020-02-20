package com.capgemini.flightmanagement.ui;


import java.util.Map;
import java.util.Scanner;
import com.capgemini.flightmanagement.service.BookingServiceImp;

public class Presentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookingServiceImp service = new BookingServiceImp();

		service.viewBooking(null);
		
		Map map = service.getDao().getMap();
		
		System.out.println("Before Cancellation");
		System.out.println(map);
		
		Scanner scan = new Scanner(System.in);
		
       System.out.println("Enter your BookingId:");
       
       int BookingId = scan.nextInt();
        
       System.out.println(map.remove(1001));
       System.out.println(map);
      
       
	}

}

