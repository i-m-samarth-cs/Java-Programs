class MyThread implements Runnable
{
  Thread tobj;
  MyThread()
  {
     tobj=new Thread(this,"Samarth");
     System.out.println("Thread Name:"+tobj);
     tobj.start();
  }
  public void run()
  {
    int i=0;
    try
    {
       for(i=1;i<50;i++)
       {
  		  System.out.println("\t"+i);
          Thread.sleep(1000);
       }
    }
    catch(Exception e)
    {
       System.out.println("999");
    }
}
}
class DemoThread
{
   public static void main(String args[])
   {
      new MyThread();
      try
      {
         for(int i=50;i>0;i--)
         {
			System.out.println("\t"+i);
           Thread.sleep(1000);
         }
      }
      catch(Exception e)
    {
       System.out.println("999");
    }
}
}
   