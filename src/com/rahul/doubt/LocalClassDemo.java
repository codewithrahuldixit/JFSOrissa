package com.rahul.doubt;

public class LocalClassDemo {
public static void main(String[] args) {
	//Local Class 
	class Local{
		void showlocal() {
			System.out.println("Local Class");
		}
	}
	Local l1 = new Local();
	l1.showlocal();
}
}
