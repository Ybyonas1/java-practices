package com.in28minutes.exceptionhandling;

import java.math.BigDecimal;

class Test implements Comparable<String> {

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

public class EclipseTipsAndTricks {

	public static void main(String[] args) throws InterruptedException {

//		DummyForTest dt = new DummyForTest();
//		dt.somthing();

		BigDecimal bd = new BigDecimal(25);

		Thread.sleep(returnSomething());
	}

	private static int returnSomething() {
		return 1000 * 45 * 456;
	}

}
