package com.rahul.jfs.coupling;

import java.util.Scanner;

public class CouplingDemo {

	public static void main(String[] args) {
	
		//Circle shape = new Circle(10);
		//System.out.println(shape);
		//HOw to Create Array In Java
		/*Scanner sc = new Scanner (System.in);
		int [] arr = new int [5];
		System.out.println("Enter the 5 Integer Value");
		for(int i = 0 ;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The Array Values");
		for(int i = 0 ;i<arr.length;i++) {
			System.out.println( arr[i]);
		}*/
		//Hold 5 Circle 
		Scanner sc = new Scanner (System.in);
		Circle [] arr = new Circle [5];
		System.out.println("Enter the 5 Integer Value");
		for(int i = 0 ;i<arr.length;i++) {
			System.out.println("Please Enter the Radius of Circle");
			arr[i]=new Circle(sc.nextInt());
		}
		System.out.println("The Array Values");
		for(int i = 0 ;i<arr.length;i++) {
			System.out.println( arr[i]);
		}
	}
}
