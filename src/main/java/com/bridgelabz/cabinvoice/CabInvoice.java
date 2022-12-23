package com.bridgelabz.cabinvoice;

import java.util.Scanner;

public class CabInvoice {

	static int fareKms;
	static int fareMinute;
	static int fareOne;
	static int fareTwo;
	static int totalFare;
	static int multipleRides = 0;
	
	
	public static void  distance(int kilometer) {
		 fareOne = fareKms*kilometer;
	}
	public static void distanceTime(int time) {
		 fareTwo = fareMinute*time;
	}
	public static int calculate() {
		totalFare = fareOne*fareTwo; 
		return totalFare;
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter User ID:");
		int id = scan.nextInt();
		System.out.print("For normal ride type 1 for premium type 2:");
		int check = scan.nextInt();
		if(check == 1) {
			fareKms = 10;
			fareMinute = 1;
		}
		else {
			fareKms=20;
			fareMinute=2;
		}
		System.out.print("Enter the rides in number: ");
		int n = scan.nextInt();
		for(int i=1; i<=n;i++) {
		System.out.print("Enter the kilometers: ");
		int kilometers = scan.nextInt();
		distance(kilometers);
		System.out.print("Enter the time in minutes: ");
		int minute = scan.nextInt();
		distanceTime(minute);
		calculate();
		System.out.println("Ride of user with ID "+id+" of "+i+" and fare is: "+totalFare+"\n--------------------");
		multipleRides = multipleRides+totalFare;
		}
		System.out.println("Total fare of user with ID "+id+ " have rides "+n+"and fare is "+multipleRides);
	}
}

