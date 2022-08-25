package com.kody.practice;

import java.util.Scanner;
/**
 * @objective Write a program to make simple calculator
 * @developer Nikhar Panchal
 */
class operation {
	// Perform addition of two numbers
	public void add(int no1, int no2) {
		int ans = no1 + no2;
		System.out.println("\nAddition is :" + ans);

	}

	// Perform subtraction of two numbers
	public void sub(int no1, int no2) {
		int ans = no1 - no2;
		System.out.println("\nSubtraction is :" + ans);

	}

	// Perform division of two numbers
	public void div(int no1, int no2) {
		double ans = (double) no1 / no2;
		System.out.println("\nDivision is :" + ans);

	}

	// Perform Product of two numbers
	public void mul(int no1, int no2) {
		int ans = no1 * no2;
		System.out.println("\nMultiplication is :" + ans);

	}
}

public class SimpleCalculator {

	public static void main(String[] args) {

		String ch = new String();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Simple Calculator program");

			System.out.print("Enter First number :- ");
			int no1 = sc.nextInt();
			System.out.print("Enter Secound number :- ");
			int no2 = sc.nextInt();
			do {
				System.out.println("1.+");
				System.out.println("2.-");
				System.out.println("3./");
				System.out.println("4.*");
				System.out.println("Press 5 for Exit");
				System.out.print("Select any choise: - ");
				ch = sc.next();
				switch (ch) {
				case "+":
					System.out.println("+ is presses");
					operation addition = new operation();
					addition.add(no1, no2);
					break;

				case "-":
					System.out.println("- is presses");
					operation subtraction = new operation();
					subtraction.sub(no1, no2);
					break;

				case "/":
					if (no1 != 0 && no2 != 0) {
						System.out.println("/ is presses");
						operation division = new operation();
						division.div(no1, no2);
					} else {
						System.out.println("Number cannot be zero");
					}
					break;

				case "*":
					System.out.println("* is presses");
					operation multification = new operation();
					multification.mul(no1, no2);
					break;

				case "5":
					System.exit(0);

				default:
					System.out.println("Invalid Choise...");
					break;

				}
			} while (ch != "5");
		}
	}

}
