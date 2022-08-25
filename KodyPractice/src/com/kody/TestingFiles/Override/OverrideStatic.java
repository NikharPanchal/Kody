package com.kody.TestingFiles.Override;
class Base {
     
    public static void display() {
        System.out.println("Static or class method from Base");
    }
     
     public void print()  {
         System.out.println("Non-static or Instance method from Base");
    }
}
 
class Derived extends Base {
     
    public static void display() {
         System.out.println("Static or class method from Derived");
    }
     
    public void print() {
         System.out.println("Non-static or Instance method from Derived");
   }
}
 
public class OverrideStatic {
   
	public static void main(String args[ ])  {
	   Base obj1 = new Derived();
        
       obj1.display(); 
        
       obj1.print();    
    }
}