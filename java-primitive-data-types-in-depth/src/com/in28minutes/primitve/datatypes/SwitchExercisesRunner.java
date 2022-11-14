package com.in28minutes.primitve.datatypes;

public class SwitchExercisesRunner {

	public static void main(String[] args) {
		System.out.println(determineNameOfDay(5));
	}

	public static String determineNameOfDay(int dayNumber) {

		String result = "";
		switch (dayNumber) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			result = "Wednesday";
			break;
		case 4:
			result = "Thursday";
			break;
		case 5:
			result = "Friday";
			break;
		case 6:
			result = "Saturday";
			break;
		}
		return result;
	}
}
