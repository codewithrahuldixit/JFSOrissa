package com.rahul.jfs;

class X{
	int a;

	public X(int a) {
		super();
		this.a = a;
	}
	
	public boolean equals(Object obj) {
		X x = (X)obj;
        return (this.a==x.a);
    }
	//Returns a string representation of the object.
	//To Return Meaning full String Output 

	@Override
	public String toString() {
		return "X [a=" + a + "]";
	}
	
	
}
public class LangDemo {
	
	public static void main(String[] args) {
		
		
		X x1 = new X(10);
		X x2 = new X(11);
		
		System.out.println(x1);
		System.out.println(x2);
		
		
		//System.out.println(x1.hashCode());
		//System.out.println(x1.getClass());
		
	//	System.out.println(x1.toString());
	//	System.out.println(x1.equals(x2));
	//	System.out.println(x1==x2);
	}
}
