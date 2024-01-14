class thread1 
{
	public static void main(String args[])
	{
		Thread t=new Thread();
		t.currentThread();
		System.out.println("Current Thread :" +t);
		
		t.setName("My Thread");

		System.out.println("After Name Changed : " +t);
		try
		{
			for(int n=5;n>0;n--)
			{
				System.out.println("\t" +n);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread Interrrupted");
		}
	}
}