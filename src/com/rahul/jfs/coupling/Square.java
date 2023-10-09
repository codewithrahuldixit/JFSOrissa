package com.rahul.jfs.coupling;

public class Square implements Shape {
	private int side;
	
	public Square(int side) {
		super();
		this.side = side;
	}

	public Square() {
		// TODO Auto-generated constructor stub
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}

}
