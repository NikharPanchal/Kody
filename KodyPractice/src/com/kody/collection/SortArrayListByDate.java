package com.kody.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @objective Java Program to Sort Objects in ArrayList by Date
 * @Developer Nikhar
 * @Date 20-Jun-2022
*/
class Dates implements Comparable<Dates>{

	public String Date;
	public Dates(String Date)
	{
		this.Date=Date;
	}
	@Override
	public int compareTo(Dates other) {
		return Date.compareTo(other.Date);
	}
}
public class SortArrayListByDate {

	public static void main(String[] args) {
		List<Dates> arrayList=new ArrayList<Dates>();
		arrayList.add(new Dates("2019-11-03"));
		arrayList.add(new Dates("2020-01-17"));
		arrayList.add(new Dates("2022-05-12"));
		arrayList.add(new Dates("2017-09-05"));
		arrayList.add(new Dates("2012-12-01"));
		
		Collections.sort(arrayList);
		
		for(Dates s:arrayList)
		{
			System.out.println(s.Date);
		}
	}
}
