package com.in28minutes.tips.blocks;

public class BlocksRunner {

	public static final int SECONDS_IN_MINUTE = 60;
	public static final int MINUTES_IN_HOUR = 60;
	public static final int HOUR_IN_DAY = 24;
//	OR
	public static final int SECONDS_IN_DAY = SECONDS_IN_MINUTE * MINUTES_IN_HOUR * HOUR_IN_DAY;

	public static void main(String[] args) {

		System.out.println(Integer.MIN_VALUE);
		System.out.println(60 * 60 * 24);
		System.out.println(SECONDS_IN_DAY);

		if (3 > 2) {
			System.out.println("3>2");
		}
	}
}
