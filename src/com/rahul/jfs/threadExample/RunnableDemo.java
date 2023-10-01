package com.rahul.jfs.threadExample;

public class RunnableDemo {

	public static void main(String[] args) {
		
		MyThreadRunnable m1 = new MyThreadRunnable("Thread 1");
		Thread t1 = new Thread (m1);
		t1.start();

	}

}
