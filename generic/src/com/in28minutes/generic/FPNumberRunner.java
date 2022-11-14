package com.in28minutes.generic;

import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15, 2, 3, 4, 5, 6);
//		numbers.stream().forEach((element) -> System.out.println(element));
//		numbers.stream().filter(element -> element % 2 == 1).forEach(element -> System.out.println(element));
//		numbers.stream().filter(element -> element % 2 == 0).forEach(element -> System.out.println(element));
		
//		Intermediate operators
//		numbers.intStream.range(1, 10).map(e -> e * e).forEach(e -> Systems.out.println(e));

		int sum = numbers.stream().reduce(0, (number1, number2) -> number1 + number2);
		int sumOfOdd = fpSum(numbers);
		

//		int sum = normalSum(numbers);
		
		
		
		System.out.println(sum);
		System.out.println(sumOfOdd);
//		System.out.println(numbers); 
	}

//	In Functional Programing
//	Code only explains what to do - avoids mutations - focus on telling what to do, not how to do it.
	private static int fpSum(List<Integer> numbers) {
		return numbers.stream().reduce(0, (number1, number2) -> {
			System.out.println(number1 + " " + number2);
			return number1 + number2;
		});
	}

//	FUNCTINOAL PROGRAMING - DECLARATIVE STYLE OF PROGRAMING
//	Functional programming allows you to program at one level up ...?
	private static int fpSumodd(List<Integer> numbers) {
		int sumOfOdd = numbers.stream().filter(number -> number % 2 == 1).reduce(0,
				(number1, number2) -> number1 + number2);
		return sumOfOdd;
	}

//	Doesn't just explain WHAT to do, but HOW to do it.
// OOP = MUTATIONS - Program has mutations

//	OOP - IMPERATIVE STYLE OF PROGRAMMING
	private static int normalSum(List<Integer> numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;

		}
		return sum;
	}

}