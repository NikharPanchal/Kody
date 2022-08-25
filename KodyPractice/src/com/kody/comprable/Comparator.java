package com.kody.comprable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * @objective
 * @Developer Nikhar
 * @Date 29-Jun-2022
 */

class Employee{
	public int id;
	public String name;
	public String desc;
	
	 public Employee(int id, String name, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
	}

	public void Show_data() {
		System.out.println("Employee roll no:"+id);
		System.out.println("Employee name :"+name);
		System.out.println("Employee Desc :"+desc);
	}
}

class RollNo implements java.util.Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
	
		if(o1.id==o2.id)
		{
			return 0;
		}
		else if(o1.id>o2.id)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}

class Name implements java.util.Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
	}
	
}

class Desc implements java.util.Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.desc.compareTo(o2.desc);
	}
	
}

public class Comparator{

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(103, "Nikhar", "Manager"));
		employeeList.add(new Employee(105, "Panshul", "CEO"));
		employeeList.add(new Employee(101, "Dhruv", "Employee"));
		employeeList.add(new Employee(107, "Ankur", "CMO"));

		Collections.sort(employeeList,new RollNo());
		
		for(Employee e: employeeList)
		{
			System.out.println(e.id);
		}
		System.out.println("-------------------");
		Collections.sort(employeeList,new Name());
		
		for(Employee e: employeeList)
		{
			System.out.println(e.name);
		}
		System.out.println("-------------------");
		Collections.sort(employeeList,new Desc());
		
		for(Employee e: employeeList)
		{
			System.out.println(e.desc);
		}
				
	}
}
