package com.rahul.jfs.threadExample;

public class MyThreadRunnable implements Runnable {

	String name ;
		public MyThreadRunnable(String name) {
		super();
		this.name = name;
	}




	@Override
	public void run() {
		
		for (int i=1;i<=10;i++) {
			System.out.println(this +"---->"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}




	@Override
	public String toString() {
		return "MyThreadRunnable [name=" + name + "]";
	}
	

}
