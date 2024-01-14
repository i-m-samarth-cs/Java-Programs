import java.util.*;
class DemoArmstrong
{
	public static void main(String args[])
	{
		int n,r,sum=0,temp;
		System.out.println("Enter number");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
	
		temp=n;	  		
		
		while(n>0)		 
		{
			r=n%10;			
			sum=sum+(r*r*r);		
			n=n/10;			
		}
		if(temp==sum)
			System.out.println("Armstrong number");
		else
			System.out.println("Not an Armstrong number"); 
	}
}