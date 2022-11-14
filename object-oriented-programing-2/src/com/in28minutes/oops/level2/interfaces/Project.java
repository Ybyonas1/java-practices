package com.in28minutes.oops.level2.interfaces;

public class Project {

	public static void main(String[] args) {

		interface Test {
			void nothing();

			default void nothing1() {

			}

		}
		class Class1 implements Test {

			@Override
			public void nothing() {
				// TODO Auto-generated method stub

			}

		}

		class Class2 implements Test {

			@Override
			public void nothing() {
				// TODO Auto-generated method stub

			}

		}

		ComplexAlgorithm algorithm = new RealAlgorithm();
		System.out.println(algorithm.complexAlgorithm(10, 20));

	}

}
