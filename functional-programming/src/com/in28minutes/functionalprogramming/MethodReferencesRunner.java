package com.in28minutes.functionalprogramming;

import java.util.List;

public class MethodReferencesRunner {

	public static void print(Integer number) {
		System.out.println(number);
	}

	public static boolean isEven(Integer number) {
		return number % 2 == 0;
	}

	public static void main(String[] args) {

		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length())
				.forEach(s -> System.out.println(s));

		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length()).forEach(System.out::println);

		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(String::length)
				.forEach(MethodReferencesRunner::print);

		Integer max = List.of(23, 45, 67, 34).stream().filter(n -> n % 2 == 0).max((n1, n2) -> Integer.compare(n1, n2))
				.orElse(0);

		Integer max2 = List.of(23, 45, 67, 34).stream().filter(MethodReferencesRunner::isEven)
				.max(Integer::compare)
				.orElse(0);

		System.out.println(max);
		System.out.println(max2);

	}


}
