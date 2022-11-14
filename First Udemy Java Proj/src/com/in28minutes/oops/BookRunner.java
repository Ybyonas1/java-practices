package com.in28minutes.oops;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book artOfComputerProgramming = new Book(1000);
		Book effectiveJava = new Book(1000);
		Book cleanCode = new Book(1000);

		cleanCode.setNoOfCopies(2);
		effectiveJava.setNoOfCopies(3);
		artOfComputerProgramming.setNoOfCopies(4);

	}

}
