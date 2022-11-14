package com.in28minutes.api.a;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		names.add("Bobby");
		names.add("Billy");
		names.add("Hendrix");

		List<String> copyOfNames = List.copyOf(names);

//		List.of("Bobby", "Jenkins", "Patrick");

		doNotchanges(copyOfNames);
		System.out.println(copyOfNames);
	}

	private static void doNotchanges(List<String> names) {

		names.add("ShouldNotBeAllowed");
	}

}
