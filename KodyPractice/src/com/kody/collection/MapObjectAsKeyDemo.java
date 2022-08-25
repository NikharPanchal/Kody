package com.kody.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @objective Write a Program Using Map Student object as a key with HashCode and equals method.
 * @Developer Nikhar
 * @Date 29-Jun-2022
*/

class Stu {

	String name;
	int rollno;
	String college;

	Stu() {
	}

	public Stu(String name, int rollno, String college) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.college = college;
	}

	@Override
	public String toString() {
		return "Stu [name=" + name + ", rollno=" + rollno + ", college=" + college + "]";
	}

	@Override
	public int hashCode() {
		return this.name.length();
	}

	@Override
	public boolean equals(Object obj) {
		return this.name.equals(((Stu) obj).name) && this.college.equals(((Stu) obj).college)
				&& this.rollno == ((Stu) obj).rollno;
		//return this.name.equals(((Stu) obj).name);
	}
}

class Employee {

	String name;
	int employeeId;
	String company;

	public Employee() {
	}

	public Employee(String name, int employeeId, String company) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + ", company=" + company + "]";
	}

}

public class MapObjectAsKeyDemo {

	Map<Stu, Employee> map = new HashMap<>();

	void show() {
		for (Map.Entry<Stu, Employee> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "," + entry.getValue());
		}
	}

	public static void main(String[] args) {

		MapObjectAsKeyDemo map1 = new MapObjectAsKeyDemo();

		Stu nikhar = new Stu("Nikhar", 101, "KS");

		Stu nikhar3 = new Stu("Nikhar", 101, "KS");

		Employee employee1 = new Employee("Nikhar", 1, "KODY");

		Stu panshul = new Stu("Panshul", 101, "GLS");

		Stu panshul1 = new Stu("Panshul", 101, "GLS");

		Employee employee2 = new Employee("Panshul", 2, "KODY");

		Stu dhruv = new Stu("Dhruv", 102, "Ks");
		Employee dhruvEmp = new Employee("Dhruv", 3, "KODY");

		map1.map.put(nikhar, employee1);
		map1.map.put(panshul, employee2);
		map1.map.put(dhruv, dhruvEmp);
		
		System.out.println(map1.map.get(nikhar3));

		System.out.println(map1.map.get(panshul1));

		map1.show();
	}

	public Employee emp(Student stu) {
		Employee employee = new Employee();
		return employee;
	}
}