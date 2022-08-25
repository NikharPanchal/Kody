package com.kody.practice.string;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
/**
 * @objective
 * @Developer Nikhar
 * @Date 22-Jun-2022
 */
class Student {
	private String name;
	private String id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
}

public class NullPointerError {

	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<String>();

		dq.add("For");
		dq.addFirst("Geeks");
		dq.addLast("Geeks");
		dq.add("is so good");
		
		System.out.println(dq);
		
		dq.peek();
		
		System.out.println(dq);
		
		ArrayList<Student> student=new ArrayList<Student>(); student.add(null);
		Student student1=new Student();
		student1.setId(null);
		System.out.println(student); 
	}
}