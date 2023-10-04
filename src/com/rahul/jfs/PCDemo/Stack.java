package com.rahul.jfs.PCDemo;

public class Stack <T>{
	
	T [] buffer;
	int top;
	public Stack(T[] buffer) {
		super();
		this.buffer = buffer;
		top=-1;
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==buffer.length-1;
	}
	//Cannot make a static reference to the non-static type T
	
	//From static reference we access only static data
	//we can create the static generic method in Generic class 
	//with different generisity
	public static  <T1> void show(T1 item) {
		System.out.println(item);
	}
	synchronized public int push(T item) {
		if(isFull())
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			++top;
			buffer[top]=item;
			notifyAll();
			return top;
		
	}
	synchronized public T pop(){
		T item=null;
		if(isEmpty())
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			item =buffer[top];
			top--;
		notifyAll();
		return item;
	}
	

}
