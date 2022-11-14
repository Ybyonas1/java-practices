package com.in28minutes.tips.nonaccess.package1;

//	A final method cannot be overwritten

//	A final class cannot be extended

final class FinalCalss {

}

//class SomeClass extends FinalClass {
//}

class SomeClass {
	final public void doSomething() {
	}

	public void doSomethingElse(final int arg) {
//			arg = 6;'
		
	}

	class ExtendsingClass extends SomeClass {
		// Throws an error bc
//		public void doSomething() {
		}
	}

public class FinalNonAccessModifierRunner {

	public static void main(String[] args) {
		final int i;
		i = 7;
//		i = 6;
		// TODO Auto-generated method stub

	}

}
