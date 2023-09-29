package com.rahul.jfs.threadExample;

public class DaemonExample {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		//T1 runs in background
		t1.setDaemon(true);
		t1.start();
		for (int i =0 ;i<20;i++)
		{
			System.out.println("Main thread "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Main Thread Completes Here");
	}
}
