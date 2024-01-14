class DemoFor
{
	public static void main(String args[])
	{
		int i,sum;
		sum=0;
		System.out.println("Sum of Even number from 1 to 100");
		for(i=1;i<100;i++)
		{
			if(i%2==0)
			{
				System.out.print("  " +i);
				sum=sum+i;
			}
		}
		System.out.println(" Sum is "+sum);
	}
}