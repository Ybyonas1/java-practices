package com.in28minutes.oops.level2;

public class CustomerRunner {

	public static void main(String[] args) {

		Address homeAddress = new Address("Line1", "Charlotte", "28205");
		Customer customer = new Customer("Bobby", homeAddress);
		System.out.println(customer);

		Address workAddress = new Address("Line1 for work", "Gastonia", "28208");
		customer.setWorkAddress(workAddress);

		System.out.println(customer);
	}

}
