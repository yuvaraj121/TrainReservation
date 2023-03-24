package org.test;

import java.util.Date;
import java.util.Scanner;

public class Reservation {
	// create an array of 10 seats... 5 window seats 5 aisle seats
	
	public static int[]seats = new int[10];
	public static void main(String[] args) {
		System.out.println(" Welcome To IRCTC");
		System.out.println(" ");
		
	for(int i=0;i<10;i++) {
		seats[i]=0;
	}
	
	// Using Scanner to get input from User
	     Scanner s= new Scanner(System.in);
	     int choice = 1;
	     
	// Ask user for a window or aisle seat and book their choice
	     System.out.println(" please enter 1 for window seat , 2 for aisle seat or 0 to exit: ");
	     choice = s.nextInt();
	 // while their choice is not for exit, proceed for booking
	     
	     while(choice!=0) {
	    	 int seatnumber = 0;
	    	 
	  // if they choose a window seat, try to book it
	    	 
	    	 while(choice == 1) {
	    		 seatnumber = bookWindow();
	   // No window seat available,try booking an aisle seat 
	    		 
	    		 if(seatnumber == -1) {
	    			 seatnumber = bookAisle();
	    			 
	    			if(seatnumber != -1) {
	    				System.out.println(" Sorry we were not able to book a window seat, But we do have a Aisle Seat");
	    			PrintTravellerTicket(seatnumber);
	    			}
	    		 }
	    		 else {
	    			 // booking a window seat was successful
	    			 System.out.println(" You are in luck, we have a window seat available !");
	    			 PrintTravellerTicket(seatnumber);
	    		 }
	    	 
	    		  if(choice == 2) {
                      // if they choose booking an aisle, check to see if it is available
	    			 seatnumber = bookAisle();
	    	
	    	// if not available , see if we have window seats available
	    			 
	    			 if(seatnumber == -1) {
	    				 seatnumber = bookWindow();
	    			if(seatnumber!=-1) {
	    				System.out.println(" sorry we are not able to book an Aisle seat but we do have a windows seat");
	    			PrintTravellerTicket(seatnumber);
	    			
	    			}
	    			 }
	    			 else {
	    				 // booking an Aisle seat was successful
	    				 
	    				 System.out.println(" you are in luck, we have an Aisle seat");
	    				 PrintTravellerTicket(seatnumber);
	    				 }
	    		 }
	    		 else {
	    			 // print an error message if they did not choose 1,2 or 0
	    			 System.out.println(" Invalid choice made... please try again");
	    			 choice = 0;
	    		 }
	    		 // No window seats or Aisle seats were available
	    		 
	    		 if(seatnumber == -1) {
	    			 System.out.println(" We are sorry , there are no window or Aisle seats are available");
	    			 System.out.println();
	    		 }
	    		// re prompt for a choice
	    		 System.out.println(" Please enter 1 for window , 2 for aisle 0 for exit");
	    		 choice = s.nextInt();
	    	 }
	    	 }
	     }
	
	     // this checks for window seats and returns seat number or -1 if full
	     
	     private static int bookWindow() {
	    	 for(int i=0;i<5;i++) {
	    		 if(seats[i]==0) {
	    			 seats[i] = 1;
	    			 return i+1;
	    		 }
	    	 }
	    	 return -1;
	     }
	     // this checks to see if aisle seats were  available -1 if full
	     private static int bookAisle() {
	    	 for(int i=5;i<10;i++) {
	    		 if(seats[i] == 0) {
	    			 seats[i] = 1;
	    			 return i+1;
	    		 }
	    	 }
	    	 return -1;
	     }
	     // print
	     
	     public static void PrintTravellerTicket(int seatnumber) {
	    	 Date timenow= new Date();
	    	 System.out.println();
	    	 System.out.println("Date:"+ timenow.toString());
	    	 System.out.println(" TravellerTicket for seatnumber"+ seatnumber);
	    	 System.out.println(" this ticket is not refundable");
	     }
}
	    			 
	    			 
	    			 
	    			 
	    			 
	    			 
	    			 

	    		 
	    			
	    		 
	    		 
	


