package com.in28minutes.tips.access.package1;

public class ExampleClass {
	public void publicMethod() {
		// This can be access from anywhere
	}

	protected void protectedMethod() {
		// Can only be accessed form the same package, or in subclasses
	}

	private void privateMethod() {
		// Only accessable inside that specific class
	}

	void defaultMethod() {

		// Only available inside that class & the same package
	}

	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
		exampleClass.privateMethod();
		exampleClass.protectedMethod();
		exampleClass.publicMethod();
		exampleClass.defaultMethod();

	}

}
