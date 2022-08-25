package com.kody.collection;

import java.util.ArrayList;
import java.util.Vector;

/**
 * @objective Copy Element of vector into arraylist
 * @Developer Nikhar
 * @Date 20-Jun-2022
*/
public class CopyVectorToList {

	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<Integer>();
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);
	
		ArrayList<Integer> arraylist=new ArrayList<Integer>();
		arraylist.addAll(vector);
		System.out.println("Elements of ArrayList");
		for(Integer i:arraylist) {
			System.out.println(i);
		}
		
		System.out.println("Elements of Vector");
		for(Integer i:vector) {
			System.out.println(i);
		}
	}
}
