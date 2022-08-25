package com.kody.practice.string;

import java.util.Scanner;

/**
 * @objective Write a program to print the swapping of two string
 * @Developer Nikhar
 * @Date 08-Jun-2022
*/
public class SwapString {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Enter the first string :- ");
		String str1=sc.next();
		
		System.out.print("Enter the second string :- ");
		String str2=sc.next();
		
		//String mergeString=str1+str2;
		System.out.println("\n\t\tBefore Swapping ");
		
		System.out.print("String 1: "+str1);
		System.out.print("\tString 2: "+str2);
		
		int len=str1.length();
		str1=str1+str2;
		
		System.out.println("\nAdd"+str1);
		System.out.println("\n\t\tAfter Swapping\n ");
		
		str2=str1.substring(0,len);
		str1=str1.substring(len,str1.length());
		
		System.out.print("String 1 :"+str2);
		
		System.out.print("\tString 2 :"+str1);
		
	}
}
