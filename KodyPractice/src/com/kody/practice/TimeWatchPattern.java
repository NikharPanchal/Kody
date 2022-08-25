package com.kody.practice;
/**
 * @objective Write a program to print following pattern
	1 2 3 4 5 6 7 
	 2 3 4 5 6 7 
	  3 4 5 6 7 
	   4 5 6 7 
	    5 6 7 
	     6 7 
	      7 
	     6 7 
	    5 6 7 
	   4 5 6 7 
	  3 4 5 6 7 
	 2 3 4 5 6 7 
	1 2 3 4 5 6 7 
 * @developer Nikhar Panchal
 */
public class TimeWatchPattern {

	public static void main(String[] args) {
		// first part of pattern
		for (int i = 1; i <= 7; i++) {
			// for print space
			for (int s = 1; s < i; s++) {
				System.out.print(" ");
			}
			// for print all digit
			for (int j = i; j <= 7; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		// second part of pattern
		for (int i = 6; i >= 1; i--) {
			// for print space
			for (int s = 1; s < i; s++) {
				System.out.print(" ");
			}
			// for print all digit
			for (int j = i; j <= 7; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
