package com.threads;

public class SleepDemo  extends Thread {

	public static void main(String[] args) {

		SleepDemo s=new SleepDemo();
		s.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("In Parent Thread");
			
			try {
				Thread.currentThread().sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("In Child Thread");
			
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
