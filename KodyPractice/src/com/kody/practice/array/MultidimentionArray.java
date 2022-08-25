package com.kody.practice.array;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @objective Multidimention array program
 * @Developer Nikhar
 * @Date 16-June-2022
 */
public class MultidimentionArray {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		try {
			System.out.print("Enter number of row : ");
			int row = sc.nextInt();

			System.out.print("Enter number of column : ");
			int col = sc.nextInt();

			int[][] arr = new int[row][col];
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.print("Enter [" + i + "] [" + j + "] Element : ");
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println("\nInput array\n");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}

		} catch (InputMismatchException e) {
			System.out.print("Invalid input...!!");
		}
	}
}
