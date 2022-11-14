package com.in28minutes.api.e;

import java.util.List;

public class TypeInferencesRunner {

	public static void main(String[] args) {

		List<String> names1 = List.of("Nino", "Bobby");
		List<String> names2 = List.of("Johnny", "Hendrix");
//		var abc = null // Null allowed

//		List<List<String>> names = List.of(names1, names2);
//		or
		var names = List.of(names1, names2);

		names.stream().forEach(System.out::println);
		
		for (var i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		;
		
		for (var name:names1) {
			System.out.println(name);
		}
		;
		
		var filter = List.of("Ranga", "Ravi").stream().filter(s -> s.length() < 6);
		filter.forEach(System.out::println);
	}

}
