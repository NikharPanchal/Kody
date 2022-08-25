package com.kody.oractice.statickeyword;
/**
 * @objective 
 * @Developer Nikhar
 * @Date 22-Aug-2022
*/
class ParentStaticOverride{
	
	public static void demo() {
		System.out.println("call from parent class");
	}	
}

class ChildStaticOverride extends ParentStaticOverride{
	
	public static void demo() {
		System.out.println("call from child class");
	}	
}

public class StaticMethod {
	
	public static void main(String[] args) {
		ParentStaticOverride obj=new ChildStaticOverride();
		obj.demo();
	}
}