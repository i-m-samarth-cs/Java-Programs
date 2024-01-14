import java.util.*;

class EvenNo
{
   EvenNo()
   {
      int n;
      System.out.println("Enter Range:");
	  Scanner s=new Scanner(System.in);
      n=s.nextInt();
      for(int i=0;i<=n;i++)
      {
		if(i%2==0)
       {
		  System.out.println(i+" ");
	   }
      }
    }
}
class Demoeven1
{
   public static void main(String args[])
   {
	  EvenNo obj=new EvenNo();
   }
}
         