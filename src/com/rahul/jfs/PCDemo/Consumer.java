package com.rahul.jfs.PCDemo;

public class Consumer extends Thread {
Stack stack;
	
	public Consumer(Stack stack) {
		super();
		this.stack = stack;
	}

	public void run() {
		int item =0;
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			item=stack.pop(); 			
			System.out.println("Popped item Succesfully"+item);
		}
	}

}
