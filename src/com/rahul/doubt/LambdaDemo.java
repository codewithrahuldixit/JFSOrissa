package com.rahul.doubt;
//Functional Interface is an Interface with One abstract Method
interface predicate{
	boolean check(int x , int y);
}
public class LambdaDemo {
public static void main(String[] args) {

	predicate p = (x,y) -> x==y;
	predicate p1 = (x,y) -> x!=y;
	System.out.println(p.check(10, 20));
	System.out.println(p.check(10, 10));
	System.out.println(p1.check(10, 20));
	System.out.println(p1.check(10, 10));
}
}
