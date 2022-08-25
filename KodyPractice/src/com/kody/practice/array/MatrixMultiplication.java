package com.kody.practice.array;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @objective Write a program to perform matrix multiplication
 * @Developer Nikhar
 * @Date 14-Jun-2022
 */
public class MatrixMultiplication {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		try {

			System.out.print("Enter the row for matrix 1 :- ");

			int matrix_1_row = sc.nextInt();
			System.out.print("Enter the column for matrix 1 :- ");
			int matrix_1_col = sc.nextInt();

			System.out.print("Enter the row for matrix 2 :- ");

			int matrix_2_row = sc.nextInt();
			System.out.print("Enter the column for matrix 2 :- ");
			int matrix_2_col = sc.nextInt();

			int[][] matrix1 = new int[matrix_1_row][matrix_1_col];
			int[][] matrix2 = new int[matrix_2_row][matrix_2_col];
			int[][] resultmatrix = new int[matrix_1_row][matrix_2_col];

			if (matrix_1_col != matrix_2_row) {
				System.out.println("Matrix multiplication is not possible");
			} else {
				// insert array for matrix 1
				System.out.println("\n------------- Elements for Matrix 1 --------------\n");
				for (int i = 0; i < matrix_1_row; i++) {
					for (int j = 0; j < matrix_1_col; j++) {
						System.out.print("Element at [" + i + "][" + j + "] : ");
						matrix1[i][j] = sc.nextInt();
					}
				}

				// insert array for matrix 2
				System.out.println("\n------------- Elements for Matrix 2 --------------\n");
				for (int i = 0; i < matrix_2_row; i++) {
					for (int j = 0; j < matrix_2_col; j++) {
						System.out.print("Element at [" + i + "][" + j + "] : ");
						matrix2[i][j] = sc.nextInt();
					}
				}

				// print first matrix
				System.out.println("------------- Matrix 1 --------------");
				for (int i = 0; i < matrix_1_row; i++) {
					for (int j = 0; j < matrix_1_col; j++) {
						System.out.print(matrix1[i][j] + " ");
					}
					System.out.println();
				}

				// print second matrix
				System.out.println("------------- Matrix 2 --------------");
				for (int i = 0; i < matrix_2_row; i++) {
					for (int j = 0; j < matrix_2_col; j++) {
						System.out.print(matrix2[i][j] + " ");
					}
					System.out.println();
				}

				System.out.println("\n---------- Result Matrix after multiplication -----------\n");
				for (int i = 0; i < matrix_1_row; i++) {
					for (int j = 0; j < matrix_2_col; j++) {
						for (int k = 0; k < matrix_1_col; k++) {

							resultmatrix[i][j] += matrix1[i][k] * matrix2[k][j];

						}
					}
				}
				// print result matrix after multiplication
				for (int i = 0; i < matrix_1_row; i++) {
					for (int j = 0; j < matrix_2_col; j++) {
						System.out.print(resultmatrix[i][j] + " ");
					}
					System.out.println();
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("invalid input...! only accept integer value");
		}
	}
}