package com.threads;

 public class MyThread  extends Test11 implements Runnable{

	public static void main(String[] args) throws InterruptedException {

		
		MyThread m=new MyThread();
		Thread t=new Thread(m);
		t.start();
		System.out.println(Thread.currentThread().isDaemon());

		Thread.currentThread().setDaemon(true);
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Main Thread");
			Thread.currentThread().sleep(1000);
			m.display();
		}

	}

	@Override
	public void run() {


		for(int i=1;i<=10;i++)
		{
			System.err.println("child Thread");
			
			try {
				Thread.currentThread().sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
class Test11
{
	public void display()
	{
		System.out.println("**********************");
	}
	
}