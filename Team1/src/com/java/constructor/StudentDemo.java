package com.java.constructor;

public class StudentDemo {

	public static void main(String[] args) {
		// Student student = new Student();

		Student st = new Student(1, "Prajakta");
		System.out.println(st);

		Student st1 = new Student(1, "Prajakta", "Pune");
		System.out.println(st1);

	}

}
