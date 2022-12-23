package com.bridgelabz.cabinvoice;

import java.util.Scanner;

public class CabInvoice {

	static final int fareKms = 10;
	static final int fareMinute = 1;
	static int fareOne;
	static int fareTwo;
	static int totalFare;
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
		System.out.print("Enter the kilometers: ");
		int kilometers = scan.nextInt();
		distance(kilometers);
		System.out.print("Enter the time in minutes: ");
		int minute = scan.nextInt();
		distanceTime(minute);
		calculate();
		if(totalFare<5) {
			System.out.print("Fare not upto the mark!");
		}
		else {
			System.out.print("Fare is: "+totalFare);
		}
		
	}
}
