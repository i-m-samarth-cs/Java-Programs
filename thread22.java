class DemoThread implements Runnable
{
	Thread tobj;
	DemoThread()
	{
		tobj= new Thread("DemoThread");
		System.out.println("Child thread:" +tobj);
		tobj.start();
	}
	public void run()
	{
		try
		{
			for(int n=1;n<=25;n++)
			{
				System.out.println("\t" +n);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Child Thread Interrupted");
		}
		System.out.println("Child Execution Completed");
	}
}
class thread22 
{
	public static void main(String args[])
	{
		new DemoThread();
		try
		{
			for(int n=25;n>0;n--)
			{
				System.out.println(" "+n);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Error...Interrupted");
		}
		System.out.println("Main thread Execution Completed");
	}
}