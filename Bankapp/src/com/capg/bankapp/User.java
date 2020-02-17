package com.capg.bankapp;
import java.util.Scanner;
public class User {
    public static void main(String[] args) {
        System.out.println("***WELCOME TO CAPGEMINI ATM***");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Exit");
        
          IBank b = Util.getObject();
        
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        	
        	switch(choice) {
        	case 1:
        	    b.deposit();
        	  break;
        		
        	case 2:
        		b.withdraw();
              break;
        		 
        	case 3:  
        		System.exit(0);
        		
        		break;
        	default:
        		
        		System.out.println("Invalid Choice");
        	}
	}

}
