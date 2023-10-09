package com.rahul.jfs.coupling;

public class CouplingDemo {

	public static void main(String[] args) {
	
		//Circle shape = new Circle(10);
		Rectangle shape = new Rectangle();
		//Square shape = new Square();
		Drawing d1 = new Drawing(shape);
		d1.draw();
	}
}
