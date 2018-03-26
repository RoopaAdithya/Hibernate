package com.threads;

public class JoinDemo extends Thread
{

	public static void main(String[] args) {
		
		JoinDemo j=new JoinDemo();
		j.start();

		Thread.currentThread().setPriority(1);
		j.setPriority(7);
		
		
		for(int i=1;i<10;i++)
		{
			System.out.println("In Parent thread");
		}
		try {
			Thread.currentThread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void run()
	{
		for(int i=1;i<10;i++)
		{
			System.out.println("In child thread");
		}
	}

}
