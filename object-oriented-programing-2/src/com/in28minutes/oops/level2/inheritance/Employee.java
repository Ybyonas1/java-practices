package com.in28minutes.oops.level2.inheritance;

import java.math.BigDecimal;

public class Employee extends Person {
//	Employee is a sub-class - Person is a super-class

	private String title;
	private String employerName;
	private char employeeGrade;
	private BigDecimal salary;

	public Employee(String name, String title) {
//		Whenever you create an object of a subclass, the super class constructor is auto called, even not explicitly coded.
//		super(); is implicitly called
		super(name);
		this.title = title;
		System.out.println("Employee Constructor");
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public char getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public String toString() {
		// Does'nt include "Person" info/code
//		return title + "#" + employerName + "#" + employeeGrade;	
		// One way to include Person code
//		return title + "#" + employerName + "#" + employeeGrade + "#" + super.getEmail();
		// 2nd way to include Person code
		return super.toString() + "#" + title + "#" + employerName + "#" + employeeGrade;
	}


}
