package com.in28minutes.tips.enums;
 

public enum Season {
	WINTER(1), SPRING(2), SUMMER(3), FALL(4);

	private int value;

	public int getValue() {
		return value;
	}

	private Season(int value) {
		this.value = value;
	}
}