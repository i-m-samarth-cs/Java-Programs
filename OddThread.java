import java.util.*;
class EvenThread extends Thread
{
   public void run()
   {
	        Scanner s=new Scanner(System.in);
      int num;
      if(num%2==0)
      {
		 System.out.println("Even");
      }
	  else
	  {
		 System.out.println("Odd");
	  }
   }
}
class OddThread
{
   public static void main(String args[])
   {

      System.out.println("Enter any Number:");
      num=s.nextInt();
      EvenThread obj=new EvenThread();
      obj.start();
   }
}