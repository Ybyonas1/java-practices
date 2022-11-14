package com.in28minutes.tips.nestedclass;

class DefaultClass {

}

public class NestedClassRunner {
	int i;

//	Inner class is a nested class that does not contain a static before it
//	aka
//	A non static nested class

	class InnerClass {

		public void method() {
			i = 5;
		}

	}

//	A static nested class is a class nested inside another class & has that static key word before it
//	aka
//	A static nested class
	static class StaticNestedClass {

	}

	public static void main(String[] args) {

//		InnerClass innerClass = new InnerClass();
		StaticNestedClass staticNestedClass = new StaticNestedClass();

//		to create an instance with an inner class, you need an instance of the class which is enclosing it
		NestedClassRunner nestedClassRunner = new NestedClassRunner();
		InnerClass innerClass = nestedClassRunner.new InnerClass();

	}

}
