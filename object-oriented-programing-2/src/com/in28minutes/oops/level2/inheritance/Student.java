package com.in28minutes.oops.level2.inheritance;

public class Student extends Person {
//	Student is a sub-class - Person is a super-class

	private String collegeName;
	private int year;

	public Student(String name, String collegeName) {
		super(name);
		this.collegeName = collegeName;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
//
//	public String toString() {
//		return collegeName + " " + year;
//	}

}
