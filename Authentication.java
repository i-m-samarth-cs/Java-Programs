import java.util.*;
class Authentication extends Exception
{
  Authentication()
  {
     System.out.println("Incorrect Password");
  }
  public static void main(String args[])
  {
     String pass;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter Password");
     pass=s.next();
     try
     {
     if(!pass.equals("GPD"))
     {
        throw new Authentication();
     }
     else
     {
	     System.out.println("***WELCOME****");
     }
}
     catch(Authentication e)
     {
         System.out.println("Chal Bhagh BSDK");
     }
  }
}