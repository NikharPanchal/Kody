package com.kody.practice.array;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @objective Complete the getSmallestAndLargest function in the editor below.
 *            getSmallestAndLargest has the following parameters: string s: a
 *            string int k: the length of the substrings to find
 * 
 *            string: the string ' + "\n" + ' where and are the two substrings
 * 
 *            Input welcometojava 3
 * 
 *            Output ava wel
 * 
 *            String s="welcometojava" has the following
 *            lexicographically-ordered substrings of length k=3:
 * 
 *            ["ava","com","elc",...."wel"]
 * 
 *            we will print smallest and largest
 * 
 * @Developer Nikhar
 * @Date 15-Jun-2022
 */
public class LexicographicalMinMax {

	public void add() throws FileNotFoundException{
		
	}
	
	public static void main(String[] args) {
		int len = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String :- ");
		String str = sc.next();
		System.out.print("Enter the length :- ");

		try {
			len = sc.nextInt();

			String substr[] = new String[str.length() - (len - 1)];

			int c = len;
			System.out.print("\n\ninput String : " + str);
			System.out.println("\ninput Length : " + len);

			for (int i = 0; i < substr.length; i++) {
				substr[i] = str.substring(i, c);
				c++;
			}
			System.out.print("\n[");
			for (int i = 0; i < substr.length; i++) {

				System.out.print(substr[i]);

				if (i != substr.length - 1) {
					System.out.print(" , ");
				}
			}
			System.out.print("]");

			Arrays.sort(substr);

			System.out.println("\n\nSmallest substring : " + substr[0]);
			System.out.println("Longest substring : " + substr[substr.length - 1]);
		} catch (InputMismatchException e) {
			System.out.println("Invalid input");
		}
	}
}