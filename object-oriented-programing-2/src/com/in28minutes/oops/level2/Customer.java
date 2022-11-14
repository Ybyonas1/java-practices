package com.in28minutes.oops.level2;

public class Customer {

//	State
	private String name;
	private Address homeAddress;
	private Address workAddress;

//	Creating
	public Customer(String name, Address homeAddress) {
		this.name = name;
		this.homeAddress = homeAddress;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

//	Operations

	public String toString() {
		return String.format("name - [%s] home address - [%s] work address - [%s]", name, homeAddress, workAddress);
	}

}
