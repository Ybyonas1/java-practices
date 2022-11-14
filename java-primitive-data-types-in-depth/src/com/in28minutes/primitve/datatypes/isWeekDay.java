package com.in28minutes.primitve.datatypes;

import java.util.Scanner;

public class isWeekDay {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the day of the week");
		System.out.println("Choices available are: ");
		System.out.println("0 - Sunday");
		System.out.println("1 - Monday");
		System.out.println("2 - Tuesday");
		System.out.println("3 - Wednesday");
		System.out.println("4 - Thursday");
		System.out.println("5 - Friday");
		System.out.println("6 - Saturday");
		int dayOfWeek = scanner.nextInt();

		System.out.println("You've chosed " + dayOfWeek);

		System.out.println(isWeekDay(dayOfWeek));
	}

	public static boolean isWeekDay(int dayNumber) {
		switch(dayNumber) {
		case 0:
		case 6: return false;
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			return true;
		}
		return false;
	}

	private static void performDayOfWeek(int dayOfWeek) {

		switch (dayOfWeek) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("You've entered: " + dayOfWeek);
			System.out.println("Is a weekday");
			break;
		case 6:
		case 0:
			System.out.println("You've entered: " + dayOfWeek);
			System.out.println("Is the weekend");
			break;
		default:
			System.out.println("Invalid Entry");
		}
	}

}
