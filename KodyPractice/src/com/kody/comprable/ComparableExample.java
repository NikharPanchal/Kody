package com.kody.comprable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/**
 * @objective
 * @Developer Nikhar
 * @Date 29-Jun-2022
 */

class Student implements Comparable<Student> {
	public int rollno;
	public String name;
	public String clg;
	
	 public Student(int rollno, String name, String clg) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.clg = clg;
	}

	public void Show_data() {
		System.out.println("Student roll no:"+rollno);
		System.out.println("Student name :"+name);
		System.out.println("Student college :"+clg);
	}
	//Sort by Student name
	/*@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}*/
	
	//Sort by Student rollno
	public int compareTo(Student o) {
		if(this.rollno==o.rollno)
			return 0;
		else if(this.rollno>o.rollno)
			return 1;
		else
			return -1;
	}
	
}

public class ComparableExample {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		TreeSet<Student> treeSet=new TreeSet<Student>();
		studentList.add(new Student(103, "Nikhar", "KS"));
		studentList.add(new Student(105, "Panshul", "BK"));
		studentList.add(new Student(101, "Dhruv", "DAIITC"));
		studentList.add(new Student(107, "Ankur", "GLS"));
		
		treeSet.add(new Student(103, "Nikhar", "KS"));
		treeSet.add(new Student(105, "Panshul", "BK"));
		treeSet.add(new Student(101, "Dhruv", "DAIITC"));
		treeSet.add(new Student(107, "Ankur", "GLS"));

		//Collections.sort is used to sort all data structures such as linkedList, ArrayList, and queue. 
		Collections.sort(studentList);
		
		for (Student s : studentList) {
			System.out.println(s.name);
		}
		
		for (Student s : studentList) {
			System.out.println(s.rollno);
		}
		
		System.out.println("TreeSet Data:: ");
		
		for(Student s: treeSet) {
			System.out.println(s.rollno+" "+s.name+" "+s.clg);
		}
	}
}