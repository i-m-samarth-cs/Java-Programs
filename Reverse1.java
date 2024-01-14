class Reverse1 implements Runnable
{
  static int i=0;
  Thread T=new Thread();
  Reverse1()
  {
     T.start();
  }
  public void run()
  {
      for(i=10;i>0;i--)
      {
		  System.out.println(" "+i);
      }
  }
     
  public static void main(String args[])
  {
     new Reverse1();
      for(i=1;i>=10;i++)
      {
		  System.out.println(" "+i);
      }
     
  }
}