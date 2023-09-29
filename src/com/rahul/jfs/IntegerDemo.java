package com.rahul.jfs;

public class IntegerDemo {
 public static void main(String[] args) {
	
	Integer i = 127;
	Integer i1 = 127;
	System.out.println(i==i1);
	 

	Integer i2 = 128;
	Integer i3 = 128;
	System.out.println(i2==i3);
	System.out.println(i2.equals(i3));
	/* 
	 int x = Integer.parseInt("44");
	 System.out.println(x);
	 System.out.println(Integer.toBinaryString(24));
	 
	 
	 /*Integer i = 45;//Autoboxing
	 int x= i;//Autounboxing
	 
	 int y = i.intValue();
	 System.out.println(y);*/
	 
	/*
	 * value of Method
	 *  
	 *  System.out.println(Integer.valueOf("012120",3));
	 System.out.println(Integer.valueOf("123AB",37));
	 
	 */
	/*Integer i = Integer.valueOf("25");
	System.out.println(i);*/
	 
	 /*Integer i = new Integer("Rahul");
	System.out.println(i);*/
	 
	 
	//Integer i = new Integer(y);
	//System.out.println(i.bitCount(7));
	//System.out.println(i.max(20, 30));
}
}
