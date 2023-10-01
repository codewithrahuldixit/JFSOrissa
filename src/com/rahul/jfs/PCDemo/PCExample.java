package com.rahul.jfs.PCDemo;

public class PCExample {
public static void main(String[] args) {
	Stack s1 = new Stack(new int [5]);
	Producer p1 = new Producer(s1);
	Consumer c1 = new Consumer(s1);
	p1.start();
	c1.start();
	}
}
