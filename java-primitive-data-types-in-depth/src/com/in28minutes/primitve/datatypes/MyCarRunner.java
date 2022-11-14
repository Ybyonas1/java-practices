package com.in28minutes.primitve.datatypes;

public class MyCarRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('B');

		System.out.println(myChar.isVowel());
		// 'a', 'e', 'i', 'o', 'u', and Capitals
		System.out.println(myChar.isNumber());
		System.out.println(myChar.isAlphabet());

		System.out.println(myChar.isConsonant());

		MyChar.printLowerCaseAlphabet();
		MyChar.printUpperCaseAlphabets();
	}

}
