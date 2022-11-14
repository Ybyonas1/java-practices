package com.in28minutes.oops;

public class Book {
	// noOfCopies
	private int noOfCopies;

	Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		if (noOfCopies > 0)
		this.noOfCopies = noOfCopies;
	}

	public void incCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies + howMuch);
	}

	public void decCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies - howMuch);
	}

}