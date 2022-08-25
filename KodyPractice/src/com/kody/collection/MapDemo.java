package com.kody.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Example and method of map 
 * @objective 
 * @Developer Nikhar
 * @Date 24-Jun-2022
*/
public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>();
		//Add value in map with keypair value
		map.put(2,"Nikhar");
		map.put(1,"Panchal");
		map.put(1,"Panshul");
		map.put(3,"Divyesh");
		map.put(4,"Ankur");
		
		//print element in element
		System.out.println("Print the element of map");
		System.out.println(map);
		
		System.out.println("\nRemove the element");
		
		//Remove the element
		map.remove(2);
		System.out.println(map);
		
		System.out.println("\nGet Element perticular index");
		
		//Get Element by key value
		System.out.println(map.get(3));
		
		//Clear the map
		map.clear();
		
		System.out.println("\nClear map");
		
		System.out.println(map);
		
	}
}