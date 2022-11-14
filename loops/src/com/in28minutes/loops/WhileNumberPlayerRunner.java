package com.in28minutes.loops;

public class WhileNumberPlayerRunner {
	public static void main(String[] args) {

		WhileNumberPlayer player = new WhileNumberPlayer(30);

		player.printSquaresUptoLimit();
		// For limit = 30, output would be 1 4 9 16 25

		player.printCubesUptoLimit();
		// For limit = 30, output would be 1 8 27

	}

}
