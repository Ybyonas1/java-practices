package com.in28minutes.oops.level2;

public class Fan {

//	State
	private String make;
	private double radius;
	private String color;

	private boolean isOn;
	private byte speed; // 0 to 5


//	Creation
	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

//	isOn
	public void isOn(boolean isOn) {
		this.isOn = isOn;
	}

	public void switchOn() {
		this.isOn = true;
		setSpeed((byte) 5);

	}

	public void switchOff() {
		this.isOn = false;
		setSpeed((byte) 0);
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}

//	Print the state
	public String toString() {
//		"make - , radius - , color - , isOn - , speed - "
		return String.format("Make - %s, Radius - %f, Color - %s, IsOn - %b, Speed - %d", make, radius, color, isOn,
				speed);
	}

}
