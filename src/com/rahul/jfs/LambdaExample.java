package com.rahul.jfs;

class A{
	public static void m1() {
		System.out.println("Hello A");
	}
}
class B extends A{
	
	}
public class LambdaExample {
public static void main(String[] args) {
	A.m1();
	B.m1();
}
}
