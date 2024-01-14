class ThrowDemo
{
  static void error()
  {
  try
  {
     throw new NumberFormatException();
  }
  catch(NumberFormatException e)
  {
     System.out.println("Error");
     throw e;
  }
}
  public static void main(String args[])
  {
    System.out.println("Main");
    try
    {
       error();
    }
    catch(NumberFormatException e)
    {
 		System.out.println("Error in Main");
    }
    System.out.println("Main End");
  }
}