package com.in28minutes.oops.level2.inheritance;

public class StudentRunner {

	public static void main(String[] args) {

//		Student student = new Student();
//		student.setName("Bobby");
//		student.setEmail("BillyBob@gmail.com");
//		
//		student.setPhoneNumber("phone number");
//		student.setCollegeName("ECU");
//		student.setYear(2020);

//		Person person = new Person();
//
//		person.setName("Hendrix");
//		person.setEmail("Hendrix@gmail.com");
//		person.setPhoneNumber("123-456-789");
//		String value = person.toString();
//
//		System.out.println(student);
//		System.out.println(person);
//		System.out.println(value);

		Employee employee = new Employee("Bobby", "Manager");
//		employee.setName("Hendrix");
		employee.setEmail("Hendrix@gmail.com");
		employee.setPhoneNumber("123-456-789");
		employee.setEmployeeGrade('A');
		employee.setTitle("Programmer Analyst");

		System.out.println(employee);

	}

}
