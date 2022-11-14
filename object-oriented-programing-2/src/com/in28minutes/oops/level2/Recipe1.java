package com.in28minutes.oops.level2;

public class Recipe1 extends AbstractRecipe {

	@Override
	void getReady() {

		System.out.println("Get raw materials");
		System.out.println("Get utensils");
	}

	@Override
	void doTheDish() {
		System.out.println("Do the dishes");

	}

	@Override
	void cleanup() {
		System.out.println("Cleanup the utensils");

	}

}
