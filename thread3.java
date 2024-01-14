class MyThread extends Thread
{
	public void run()
	{
		for(int i=1;i<6;i++)
		{
			System.out.println(i +"\t");
		}
	}
}
class thread3
{
	public static void main(String args[])
	{
		MyThread t=new MyThread();
		System.out.println(t);
		t.start();
	}
}
