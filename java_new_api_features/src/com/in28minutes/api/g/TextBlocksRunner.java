package com.in28minutes.api.g;

public class TextBlocksRunner {

	public static void main(String[] args) {

		String str = """
				Line1
				Line2
				Line3
				""";
		System.out.print(str);

		String textBlock = """
				Line 1: %s
				Line 2: %s
				Line 3:
				Line 4:
				""".formatted("Some Value", "Some Other Value");

		System.out.print(textBlock);
	}

}
