class Priority
{
  public static void main(String args[])
  {
    Thread d= Thread.currentThread();
    int p=d.getPriority();
    System.out.println("Default Priority:"+d);
    d.setPriority(8);
 
    p=d.getPriority();
    System.out.println("New Priority:"+p);
  }
}
    