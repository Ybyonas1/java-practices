package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);

		MotorBike suzuki = new MotorBike();

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(suzuki.getSpeed());


		ducati.start();

		honda.start();

		ducati.setSpeed(100);
		honda.setSpeed(200);


		// get speed
		// inc it by 100
		// set it ducati
		int ducatiSpeed = ducati.getSpeed(); // get ducati speed
		ducatiSpeed = ducatiSpeed + 100; // increase it by 100
		ducati.setSpeed(ducatiSpeed); // set it to ducati

		int hondaSpeed = honda.getSpeed(); // get honda speed
		hondaSpeed += 100; // increase speed by 100
		honda.setSpeed(hondaSpeed); // set it to honda

		// OR increase speed via method

//		ducati.increaseSpeed(100);

//		honda.increaseSpeed(100);

		// OR decrease speed via method

		honda.decreaseSpeed(50);
		ducati.decreaseSpeed(0);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

//		honda.setSpeed(80);
//		System.out.println(honda.getSpeed());

//		ducati.setSpeed(20);
//		
//		honda.setSpeed(0);

	}

}
