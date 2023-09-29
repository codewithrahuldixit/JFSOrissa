package com.rahul.jfs;

public class StringDemo {
 public static void main(String[] args) {
	String s1 = new String("Rahul");
	String s2 = "Dixit";
	String s3 = "Rahul";
	String s4 = "Dixit";
	System.out.println(s1==s3);
	System.out.println(s2==s4);
	System.out.println(s1==s2);
}
}
