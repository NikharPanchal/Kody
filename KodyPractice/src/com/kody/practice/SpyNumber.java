package com.kody.practice;

import java.util.Scanner;
/**
 * @objective Write a program to check spy number
 * @developer Nikhar Panchal
 */
public class SpyNumber {

	private static Scanner sc;

	public static void main(String[] args) {
		int rem = 0, sum = 0, mul = 0;
		sc = new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int no = sc.nextInt();
		//Store original number into temporary variable
		int temp = no;
		while (no != 0) {
			rem = no % 10;
			sum = sum + rem;//addition of all digit
			mul = sum * rem;//product of all digit
			no = no / 10;
		}
		System.out.println("Sum is :- " + sum);
		System.out.println("Multification is :- " + mul);
		if (sum == mul) {
			System.out.println(temp + " is a Spy number");
		} else {
			System.out.println(temp + " is not a Spy number");
		}
		sc.close();
	}
}
