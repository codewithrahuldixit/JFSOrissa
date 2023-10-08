package com.rahul.jfs.coupling;

public class CouplingDemo {

	public static void main(String[] args) {
		Circle circle = new Circle(10);
		Drawing d1= new Drawing(circle);
		d1.draw();
	}
}
