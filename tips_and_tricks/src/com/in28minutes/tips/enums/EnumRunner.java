package com.in28minutes.tips.enums;

import java.util.Arrays;

//enum Season {
//	WINTER(1), SPRING(2), SUMMER(3), FALL(4);
//
//	private int value;
//
//	public int getValue() {
//		return value;
//	}
//
//	private Season(int value) {
//		this.value = value;
//	}
//}

public class EnumRunner {

	public static void main(String[] args) {

		Season season = Season.WINTER;

		Season season1 = Season.valueOf("WINTER");
		System.out.println(season1);
		System.out.println(season1.name());
		System.out.println(season1.ordinal());
		System.out.println(season1.SPRING.ordinal());
		System.out.println(season1.SPRING.getValue());
		
		System.out.println(Arrays.toString(Season.values()));
	}

}
