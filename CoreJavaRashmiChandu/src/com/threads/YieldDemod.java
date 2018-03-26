package com.threads;

public class YieldDemod extends Thread{

	public static void main(String[] args) {

		
		YieldDemod y=new YieldDemod();
		y.start();
		y.setPriority(MAX_PRIORITY);
		y.yield();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("in Main  thread");
		}

	}
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("in child thread");
		}
	}

}
