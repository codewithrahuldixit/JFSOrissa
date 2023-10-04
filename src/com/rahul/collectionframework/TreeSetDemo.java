package com.rahul.collectionframework;

import java.util.TreeSet;
record Student (int id , String name) implements Comparable<Student>{

	@Override
	public int compareTo(Student o) {
		
			return this.id-o.id;
	}
	
}
public class TreeSetDemo {

	public static void main(String[] args) {
		
		
		
		//Only Homogeneous data is added
		// Duplicates not allowed
		//The Objects should be added in the treeset 
		//which is Comparable (that implements Comparable interface)  comparable
		
		TreeSet <Student> t1 = new TreeSet<Student>();
		t1.add(new Student(101,"Rahul"));
		t1.add(new Student(102,"Balram"));
		t1.add(new Student(002,"Smruti"));
		System.out.println(t1);
		/*TreeSet <Integer>t1 = new TreeSet<Integer>();
		t1.add(22);
		t1.add(44);
		t1.add(88);
		t1.add(88);
		System.out.println(t1);*/

	}

}
