package com.rahul.collectionframework;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		//Only Homogeneous data is added
		// Duplicates not allowed
		//The Objects should be comparable
		TreeSet <Integer>t1 = new TreeSet<Integer>();
		t1.add(22);
		t1.add(44);
		t1.add(88);
		t1.add(88);
		System.out.println(t1);

	}

}
