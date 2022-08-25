package com.kody.practice.array;

import java.util.Scanner;

/**
 * @objective The sum of an array is the total sum of its elements. An array's
 *            sum is negative if the total sum of its elements is negative. An
 *            array's sum is positive if the total sum of its elements is
 *            positive. Given an array of n integers, find and print its number
 *            of negative subarrays on a new line.
 * 
 *            Input Format
 * 
 *            The first line contains a single integer, , denoting the length of
 *            array A = [a0,a1,....,a(n-1)]. The second line contains n
 *            space-separated integers describing each respective element, a(i},
 *            in array A.
 * 
 *            Sample Input 5 1 -2 4 -5 1
 * 
 *            Sample Output 9
 * 
 *            explaination [1] : -2 [3] : -5 [0:1] : 1+ -2 = -1 [2:3] : 4 + -5 =
 *            -1 [3:4] : -5+1 = -4 [1:3]: -2 + 4 + -5 = -3 [0:3]: 1 -2 + 4 -5 =
 *            -2 [1:4]:-2 + 4 + -5 +1 = -2 [0:4] 1-2 + 4 + -5 +1 = -1
 * 
 *            Thus, we print 9 on a new line.
 * @Developer Nikhar
 * @Date 15-Jun-2022
 */
public class SubArraySubSection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Size :- ");
		int n = sc.nextInt();
		System.out.print("Enter the input :- ");
		int[] arr = new int[n];
		int[][] a=new int[5][5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum = sum + arr[j];
				if (sum < 0) {
					count++;
				}
			}

		}
		System.out.println("Answer : " + count);
	}
}
