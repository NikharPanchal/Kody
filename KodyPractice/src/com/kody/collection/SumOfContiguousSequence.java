package com.kody.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * @objective Given array of integers (positive and negative) find the largest
 *            sum of a contiguous sequence
 * @Developer Nikhar
 * @Date 20-Jun-2022
 */
public class SumOfContiguousSequence {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws NegativeInputNotAllowed {
		try {

			System.out.println("Enter the Size of Array : ");
			int no = sc.nextInt();
			if (no <= 0) {
				throw new NegativeInputNotAllowed("Zero or Negative enumber is not allowed..");
			}
			int[] array = new int[no];
			List<Integer> list = new ArrayList<Integer>();
			System.out.println("Enter " + no + " elements");
			for (int i = 0; i < no; i++) {
				array[i] = sc.nextInt();
			}
			for (int i = 0; i < array.length; i++) {
				int sum = 0;
				for (int j = i; j < array.length; j++) {
					sum = sum + array[j];
					list.add(sum);
				}
			}
			Collections.sort(list);
			System.out.println(list);
			System.out.println(list.get(list.size() - 1));

		} catch (InputMismatchException e) {
			System.out.println("Invalid input..");
		} catch (NegativeInputNotAllowed e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}

}
