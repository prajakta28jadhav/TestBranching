package com.java.constructor;

public class Student {
	private int rollno;
	private String name;
	private String address;

	public Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;

	}
	
	public Student(int rollno, String name,String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;

	}

	@Override
	public String toString() {
		return "Student rollno=" + rollno + ", name=" + name + ", address=" + address;
	}
	
	
}
