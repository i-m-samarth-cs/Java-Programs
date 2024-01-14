import java.util.*;
class DemoFibo
{
	public static void main(String args[])
	{
		int f1,f2,no,i=0,r;
		
		f1=0;
		f2=1;
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		no=s.nextInt();
		System.out.print(f1+" "+f2);
			
		do
		{
			r=f1+f2;
			System.out.print(" "+r);
			f1=f2;
			f2=r;
			i=i+1;
		}while(i<no);
	}
}