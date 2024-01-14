class thread4 
{
	public static void main(String args[])
	{
		Thread d=new Thread();
		int p=d.getPriority();

		System.out.println("Default Proper :" +p);
		d.setPriority(10);
		p=d.getPriority();
		System.out.println("New Priority :" +p);
	}
}