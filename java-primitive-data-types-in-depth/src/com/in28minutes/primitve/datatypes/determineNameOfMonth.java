package com.in28minutes.primitve.datatypes;

import java.util.Scanner;

public class determineNameOfMonth {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Month of the Year");
		System.out.println("Choices available are: ");
		System.out.println("0 - January");
		System.out.println("1 - February");
		System.out.println("2 - March");
		System.out.println("3 - April");
		System.out.println("4 - May");
		System.out.println("5 - June");
		System.out.println("6 - July");
		System.out.println("7 - August");
		System.out.println("8 - September");
		System.out.println("9 - October");
		System.out.println("10 - November");
		System.out.println("11 - December");
//		System.out.println(determineNameOfMonth(1));

		int monthInTheYear = scanner.nextInt();
		System.out.println(determineNameOfMonth(monthInTheYear));

	}

	private static String determineNameOfMonth(int monthInTheYear) {

		String result = "";
		switch (monthInTheYear) {
		case 0: 
			result = "January";
			break;
		case 1: 
			result = "February";
			break;
		case 2: 
			result = "March";
			break;
		case 3: 
			result = "April";
			break;
		case 4:
			result = "May";
			break;
		case 5:
			result = "June";
			break;
		default:
//			System.out.println("Incorrect Entry");
			return result = "Incorrect Entry";
		}
		return result;

}
}
