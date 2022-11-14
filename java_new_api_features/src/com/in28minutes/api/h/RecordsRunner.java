package com.in28minutes.api.h;

public class RecordsRunner {

	record Person(String name, String email, String phoneNumber) {
		Person(String name, String email, String phoneNumber) {
			if (name == null) {
				throw new IllegalArgumentException("Name is null");
			}
			this.name = name;
			this.email = email;
			this.phoneNumber = phoneNumber;
		}
//		Test

	};

//	Compact Constructor Below
//		- Compact Constructors are only allowed in records

//	record Person(String name, String email, String phoneNumber) {
//		Person {
//			if (name == null) {
//				throw new IllegalArgumentException("Name is null");
//			}
//
////			If name method is not sufficient, or if you would like to add additional logic,
//		name() {
//				System.out.println("Do something");
//				return name;
//			}
//
//	};

	public static void main(String[] args) {

		Person person = new Person("Bobby", "bobby@in28minutes.com", "125-456-7899");
		Person person1 = new Person("Bobby", "bobby@in28minutes.com", "125-456-7899");
		Person person2 = new Person("Bobby1", "bobby@in28minutes.com", "125-456-7899");
		System.out.println(person.equals(person2));
		System.out.println(person.equals(person1));
		System.out.println(person.name());
		System.out.println(person2.name());

	}

}
