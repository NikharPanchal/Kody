/**/
package com.kody.practice;
/**
 * @objective Write a program to print Fibonacci series
 * @developer Nikhar Panchal
 */
public class FibonacciSeries {

	public static void main(String[] args) {

		int n1 = 0, n2 = 1, n3 = 0;
		
		//print first 2 digit
		System.out.print(n1 + " " + n2 + " ");
		
		for (int i = 2; i < 100; i++) {
			n3 = n1 + n2;

			if (n3 > 100) {
				break;
			} else {
				//change the position of numbers
				n1 = n2;
				n2 = n3;
				System.out.print(n3 + " ");
			}
		}

	}

}
