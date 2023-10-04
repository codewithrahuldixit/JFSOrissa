package com.rahul.collectionframework;

import java.util.Comparator;
import java.util.TreeSet;
//Comparator are used to perform customized sorting 
class MyComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
				return o1.name().compareTo(o2.name());
	}
	
}
public class NewApplication {
public static void main(String[] args) {
	TreeSet<Student> t1 = new TreeSet<Student>(new MyComparator());
	t1.add(new Student(101,"Rahul"));
	t1.add(new Student(102,"Balram"));
	t1.add(new Student(002,"Smruti"));
	System.out.println(t1);
	
}
}
