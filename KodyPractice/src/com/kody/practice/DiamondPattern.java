package com.kody.practice;
/**
 * @objective Write a program to print following pattern
	     A 
	    B B 
	   C   C 
	  D     D 
	 E       E 
	F         F 
	 E       E 
	  D     D 
	   C   C 
	    B B 
	     A 
 * @developer Nikhar Panchal
 */
public class DiamondPattern {

	public static void main(String[] args) {

		char alpha = 65;
		int n = 5;
		// first half of pattern
		for (int i = 0; i <= n; i++) {
			//printing space
			for (int s = 0; s < (n - i); s++) {
				System.out.print(" ");
			}
			//printing characters
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					System.out.print(alpha + "");
				} else {
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			alpha++;

			System.out.println();
		}

		char alpha1 = 69;
		// second half of pattern
		for (int i = n - 1; i >= 0; i--) {

			for (int s = 0; s < (n - i); s++) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {

				if (j == 0 || j == i) {
					System.out.print(alpha1);
				}

				else {
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			alpha1--;

			System.out.println();
		}
	}

}
