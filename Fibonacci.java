import java.util.*;

class Fibonacci
{
   public static void main(String args[])
   {
	 int f1=0,f2=1,r=0,i=0;
     System.out.println("Enter Range:");
	 Scanner s=new Scanner(System.in);
	 int no=s.nextInt();
     System.out.println(" "+f1);
	 System.out.println(" "+f2);
     do
	 {
	 	r=f1+f2;
		f1=f2;
		f2=r;
		System.out.println(" "+r);
		i++;
	  }while(i<no);
}
}
