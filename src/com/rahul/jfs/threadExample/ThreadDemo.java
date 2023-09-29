package com.rahul.jfs.threadExample;

class MyThread extends Thread {
	//Same as Main of Thread
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.println(this+"------"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		Thread main=Thread.currentThread();// what is the priority of main 5
		MyThread m1 = new MyThread();//5
		System.out.println(main);
		System.out.println(m1);
		main.setPriority(8);
		System.out.println(main);
		MyThread m2 = new MyThread();
		System.out.println(m2);
		m1.start();
		m2.start();
		System.out.println(m1.isAlive());
		System.out.println(m2.isAlive());
		try {
			m1.join();
			m2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main Thread Completed There Task");
		
		
		
		
		
		
		
		// We cant Predict the output of Thread
		/*Thread main=Thread.currentThread();
		MyThread m1 = new MyThread();
		System.out.println(main);
		main.setPriority(8);
		MyThread m2 = new MyThread();
		System.out.println(main);
		m1.setName("Rahul");
		//m1.setPriority(10);
		m2.setName("Balram");
		//m2.setPriority(1);
		System.out.println(m1);
		System.out.println(m2);
		MyThread m3 = new MyThread();
		//m3.setPriority(0);
		System.out.println(m3);
	//	m1.start();
		//m2.start();*/
	}
}
