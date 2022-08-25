package com.kody.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * @objective
 * @Developer Nikhar
 * @Date 23-Jun-2022
 */
public class Student {
	int rollno;
	String name;
	String clgname;

	public Student(int rollno, String name, String clgname) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.clgname = clgname;
	}

	public static void main(String[] args) {
		Set<Student> studentSet = new HashSet<Student>();

		Set<String> studentNames = new HashSet<>();

		Student panshul = new Student(1, "Panshul", "KS");
		Student ankur = new Student(2, "Ankur", "KS");
		Student nikhar = new Student(3, "Nikhar", "KS");
		Student dhruv = new Student(1, "Panshul", "KS");
		Student divyesh = new Student(5, "Divyesh", "KS");

		divyesh = panshul;

		System.out.println(divyesh.hashCode());
		System.out.println(panshul.hashCode());

		studentSet.add(panshul);
		studentSet.add(ankur);
		studentSet.add(nikhar);
		studentSet.add(dhruv);
		studentSet.add(divyesh);

		studentNames.add("Panshul");
		studentNames.add("Ankur");
		studentNames.add("Nikhar");
		studentNames.add(new String("Panshul"));

		System.out.println(studentSet.size());

		System.out.println(studentNames.size());
		
	}

	@Override
	public int hashCode() {
		return this.name.length();
	}

	@Override
	public boolean equals(Object obj) {
		return this.name.equals(((Student) obj).name);
	}	
}