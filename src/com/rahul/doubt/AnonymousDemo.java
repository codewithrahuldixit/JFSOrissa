package com.rahul.doubt;
class Demo{
	void show () {
		System.out.println("Show of Demo");
	}
}
public class AnonymousDemo {

	public static void main(String[] args) {
		//Local Anonymous (name is not there) Inner Class 
		Demo d1 = new Demo() {
			void show() {
				System.out.println("Anonymous Child Class");
			}
			
		};
		d1.show();
	}

}
