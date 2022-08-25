package com.kody.collection;

import java.util.Scanner;

/**
 * @objective
 * @Developer Nikhar
 * @Date 20-Jun-2022
 */
public class SortArrayOfString {

	private static Scanner sc;

	public static void main(String[] args) throws NegativeInputNotAllowed {
		try {
			sc = new Scanner(System.in);
			
			System.out.print("Enter the size :- ");
			int n = Integer.parseInt(sc.nextLine());
			if(n<=0)
			{
				throw new NegativeInputNotAllowed("Zero or negative is not allowed..");
			}
			System.out.print("Enter the String : ");
			String str[] = new String[n];
			for (int i = 0; i < n; i++) {
				str[i] = sc.nextLine();
			}
			for (int i = 0; i < str.length; i++) {
				for (int j = i + 1; j < str.length; j++) {
					if (str[j].compareTo(str[i]) < 0) {
						String t = str[i];
						str[i] = str[j];
						str[j] = t;
					}
				}
				System.out.println(str[i]);
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalid input....");
		}catch (NegativeInputNotAllowed e) {
			System.out.println(e.getMessage());
		}
	}
}