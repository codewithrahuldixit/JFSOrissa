package com.rahul.jfs.PCDemo;

public class Producer extends Thread{
	Stack stack;
	
	public Producer(Stack stack) {
		super();
		this.stack = stack;
	}

	public void run() {
		int i =0;
		while(true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
			if (stack.push(i)<0) {
				System.out.println("Not Successful Operation");
			}
			System.out.println("Item Pushed Succesfully"+i);
		}
	}
}
