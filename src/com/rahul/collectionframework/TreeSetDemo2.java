package com.rahul.collectionframework;

import java.util.TreeSet;

public class TreeSetDemo2{
	public static void main(String[] args) {
		//CompareTo Method is implemented when Class Created 
		//Comparable
		TreeSet<Circle> t1 = new TreeSet<Circle>();
		t1.add(new Circle(4));
		t1.add(new Circle(5));
		t1.add(new Circle(5));
		t1.add(new Circle(3));
		System.out.println(t1);
		//When we want Customized Sorting without touching the class
		//Comparator
		TreeSet<Circle> t2 = new TreeSet<Circle>(new MyComparator2());
		t2.add(new Circle(4));
		t2.add(new Circle(5));
		System.out.println(t2);
	}
}