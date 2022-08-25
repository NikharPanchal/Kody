package com.kody.practice.java8concept;

/**
 * @objective
 * @Developer Nikhar
 * @Date 12-Jul-2022
 */
public class LambdaExpresion {

	@FunctionalInterface
	public interface AddValue{
		
		public void addNumber();
		
	}
	
	public static void main(String[] args) {
//		LambdaExpresion lambdaExpresion = new LambdaExpresion();
//		int result = lambdaExpresion.add(10, 20);
//		System.out.println(result);
	

//	public int add(int a, int b) {
//		return a + b;
//	}
	
		AddValue add=()-> System.out.println("Hello");
	}
}
