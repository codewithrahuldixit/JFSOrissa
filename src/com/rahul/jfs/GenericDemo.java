package com.rahul.jfs;

import com.rahul.jfs.PCDemo.Stack;
record Student(int id,String name,String Address) {}
public class GenericDemo {
public static void main(String[] args) {
	Stack <Integer> s1 = new Stack<Integer>(new Integer[5]);
	/*The method push(Integer) in the type Stack<Integer> 
	is not applicable 
	for the arguments (double)
	*/
	s1.push(12);
	//System.out.println(s1.pop());
	Stack <String>s2 = new Stack<String> (new String[5]);
	s2.push("Rahul");
	//System.out.println(s2.pop());
	
	Stack <Student> s3 = new Stack<Student>(new Student[10]);
	s3.push(new Student(101,"Rahul","Delhi"));
	s3.push(new Student(102,"Smruti","Orissa"));
	//System.out.println(s3.pop());
	//System.out.println(s3.pop());
	s1.show(4);
	s2.show("Balram");
	s3.show(new Student(103,"Saptrujit","Orissa"));
}
}
