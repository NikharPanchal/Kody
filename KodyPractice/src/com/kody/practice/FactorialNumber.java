package com.kody.practice;

import java.util.Scanner;
/**
 * @objective Write a program to check factorial pattern
 * @developer Nikhar Panchal
 */
public class FactorialNumber {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		int factorial = 1;

		System.out.println("Enter the number :- ");

		int no = sc.nextInt();// 5

		for (int i = 2; i <= no; i++) {
			factorial = factorial * i;// 5*4*3*2 = 120
		}
		System.out.println("Factorial of " + no + " is :- " + factorial);
		sc.close();
	}
}
