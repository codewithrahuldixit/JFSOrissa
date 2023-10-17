package com.rahul.doubt;
class Outer{
	
	//nested Class | Inner class |class with in the class
	static class inner{
		void showInner () {
			System.out.println("Show of Inner");
		}
	}
	void showOuter () {
		System.out.println("Show of Outer");
	}
}
public class DoubtDemo {
	public static void main(String[] args) {
	Outer outer = new Outer();
	//creating the object of inner class which is not static 
	//Outer.inner i1 = outer.new inner();
	
	//How to Create the Object of Static nested class
	Outer.inner i1 = new Outer.inner();
	i1.showInner();
	outer.showOuter();
	}
}
