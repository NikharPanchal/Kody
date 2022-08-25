package com.kody.practice.exception;

/**
 * @objective Example of illegalException.. Only checked exceptions are required
 *            to be thrown using the throws keyword. Unchecked exceptions don’t
 *            need to be thrown or handled explicitly in code.
 * @Developer Nikhar
 * @Date 10-Jun-2022
 */
public class IllegalException {

	static void throwOne() {
		System.out.println("Inside throwOne.");

		throw new ArithmeticException("Arithmatic Exceptions");

	}

	public static void main(String args[]) {

		try {
			throwOne();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
