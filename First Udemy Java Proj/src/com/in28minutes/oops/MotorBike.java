package com.in28minutes.oops;

public class MotorBike {
	// State
	private int speed; // member variable

//	Constructors
	MotorBike() {
//		this.speed = 5;
		// OR
		this(5);
	}

	MotorBike(int speed) {
		this.speed = speed;
	}

	// Behavior
	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		if (speed > 0)
//		System.out.println(speed);
//		System.out.println(this.speed);
		this.speed = speed;
	}

	public void increaseSpeed(int howMuch) {
		this.speed = this.speed + howMuch;
	}

	public void decreaseSpeed(int howMuch) {
//		if (this.speed - howMuch > 0)
		// OR
//		setSpeed(this.speed - howMuch);
		if (howMuch < speed)
		this.speed = this.speed - howMuch;
	}


	void start() {
		System.out.println("Bike Started");

	}

}
