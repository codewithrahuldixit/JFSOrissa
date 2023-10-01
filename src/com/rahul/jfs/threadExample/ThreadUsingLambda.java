package com.rahul.jfs.threadExample;

public class ThreadUsingLambda {
public static void main(String[] args) {
	Runnable r = ()-> {

		
		for (int i=1;i<=10;i++) {
			System.out.println("Thread Lambda---->"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
	Thread t1 = new Thread(r);
	t1.start();
}
}
