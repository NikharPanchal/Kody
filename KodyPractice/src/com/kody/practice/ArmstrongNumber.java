
package com.kody.practice;

import java.util.Scanner;

/**
 * @objective Write a program to check Armstrong number
 * @author Nikhar
 */
public class ArmstrongNumber {
	

	private static Scanner sc;
 
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int reminder = 0;
		int answer = 0;
		
		System.out.println("Enter the number :- ");
		
		int input_no = sc.nextInt();
		int temp = input_no;
	
		while (input_no > 0) {
			// Store the last digit
			reminder = input_no % 10; 
			// sum of that digit
			answer = answer + (reminder * reminder * reminder);
			// Remove last digit
			input_no = input_no / 10;
		}
		
		if (temp == answer) {
			System.out.println(temp + " is Armstrong number");
		} else {
			System.out.println(temp + " is not Armstrong number");
		}
		
		sc.close();
	}

}