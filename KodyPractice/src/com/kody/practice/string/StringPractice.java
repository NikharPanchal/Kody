package com.kody.practice.string;
/**
 * @objective 
 * @Developer Nikhar
 * @Date 19-Aug-2022
*/
public class StringPractice {
	public static void main(String[] args) {
		String s1="python";
		String s2="Science";
		String s3="pyhton";
		
		System.out.println(s1.hashCode());

		System.out.println(s2.hashCode());

		System.out.println(s3.hashCode());

		String s4=new String("Java");
		String s5=new String("C++");
		String s6=new String("Science");
		
		System.out.println(s4.hashCode());	
		
		System.out.println(s5.hashCode());
		
		System.out.println(s6.hashCode());
	}
}