package com.kody.practice.exception;
/**
 * @objective Custom Invalid age exception example
 * @Developer Nikhar
 * @Date 09-Jun-2022
 */
class InvalidAgeException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	// Custom Exception
	public InvalidAgeException(String s) {
		// Exception - Throwable - getMessage()
		super(s);
	}
}

public class CustomException {

	static void Age(int age) throws InvalidAgeException {
		if (age > 18) {
			System.out.println("You are eligible for vote");
		} else {
			throw new InvalidAgeException("Age");
		}
	}

	public static void main(String[] args) {
		try {
			Age(15);
		} catch (InvalidAgeException e) {
			System.out.println("Excetpion called.." + e);
		}
	}
}