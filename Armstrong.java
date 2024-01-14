import java.util.*;

class Armstrong
{
	public static void main(String args[])
    {
	   int num,temp,sum=0,rem;
	   System.out.println("Enter any Number:");
	   Scanner s=new Scanner(System.in);
	   num=s.nextInt();
	   temp=num;
	   while(num<0)
	   {
	     rem=num%10;
		 sum=sum+(rem*rem*rem);
		 num=num/10;
	   }
       if(sum==temp)
	   {
	      System.out.println(temp+"is Armstrong Number");
	   }
	   else
	   {
		  System.out.println(temp+"is not an Armstrong Number");
	   }
	}
}