package com.kody.practice;

import java.util.Scanner;
/**
 * @objective Given an integer, n, perform the following conditional actions:
 * and check weird number
	
	 If n  is odd, print Weird
	 If n  is even and in the inclusive range of  2 to 5 , print Not Weird
	 If n  is even and in the inclusive range of  6 to 20 , print Weird
	 If n  is even and greater than 20, print Not Weird
	
	Input Format
	A single line containing a positive integer, n.
	
	output Format
	Print Weird if the number is weird; otherwise, print Not Weird.

 * @developer Nikhar Panchal
 */
public class Weird {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Enter the number :- ");

		int user_input = sc.nextInt();
		// check number is odd

		if (user_input % 2 != 0) {
			System.out.println("Weird");
		} else {// number is even
			if (user_input >= 2 && user_input <= 5) {
				System.out.println("Not Weird");
			} else if (user_input >= 6 && user_input <= 20) {
				System.out.println("Weird");
			} else if (user_input > 20) {
				System.out.println("Not Weird");
			} else {
				System.out.println("Negative number not allowed");
			}
		}
	}
}
