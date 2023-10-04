package com.rahul.collectionframework;

import java.util.ArrayList;

import com.rahul.jfs.PCDemo.Stack;

public class CollectionDemo {
public static void main(String[] args) {
	ArrayList<Integer> a1 = new ArrayList<Integer>(12);
	a1.add(12);
	a1.add(18);
	a1.add(19);
	a1.add(21);
	a1.add(333);
	ArrayList<Integer> a2 = new ArrayList<Integer>();
	a2.add(99);
	a2.add(55);
	
	/*
	System.out.println(a1);
	//Please insert value @GIven position
	a1.add(2,16);
	System.out.println(a1);
	System.out.println(a1.size());
	System.out.println(a1.isEmpty());
	//Please find the element is present in the array
	System.out.println(a1.contains(21));
	//Find th element position
	System.out.println(a1.indexOf(333));
	a1.add(12);
	System.out.println(a1);
	//it returns the position of first value encountered
	System.out.println(a1.indexOf(12));
	System.out.println(a1.lastIndexOf(12));
	a1.add(4,12);
	*/
	System.out.println(a1);
	System.out.println(a2);
	a1.addAll(a2);
	System.out.println(a1);
	System.out.println(a2);
	
}
}
