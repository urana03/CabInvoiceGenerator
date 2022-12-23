package com.bridgelabz.cabinvoice;

import java.util.Scanner;

public class CabInvoice {

	static final int fareKms = 10;
	static final int fareMinute = 1;
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
		multipleRides = multipleRides+totalFare;
		}
		System.out.println("Fare for rides "+n+" is "+multipleRides);
	}

}
