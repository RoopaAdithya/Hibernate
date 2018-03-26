package com.threads;

public class SynchronizationDemo extends Thread {

	int sum;
	
	
	public  static void main(String[] args) {

		
		SynchronizationDemo s=new SynchronizationDemo();

		s.start();
		synchronized (s) {
			
			System.out.println("Main Thread called");
		try {
			System.out.println("Wait() called");
			s.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Sum "+s.sum);
		}
	}
	
	public void run()
	{
	System.out.println("Child Thread called after wait()" );
		synchronized (this) {
					
		for(int i=1;i<=10;i++)
		{
			sum=sum+i;
		}
		System.out.println("Child thread sending notification to main thread");
		notify();
		
		}
	}

}
