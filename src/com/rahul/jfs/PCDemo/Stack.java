package com.rahul.jfs.PCDemo;

public class Stack {
	
	int [] buffer;
	int top;
	public Stack(int[] buffer) {
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
	
	synchronized public int push(int item) {
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
	synchronized public int pop(){
		int item=Integer.MIN_VALUE;
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
