package com.rahul.collectionframework;

import java.util.Comparator;

public class MyComparator2 implements Comparator<Circle> {

	@Override
	public int compare(Circle o1, Circle o2) {
		// TODO Auto-generated method stub
		return o2.radius()-o1.radius();
	}

}
