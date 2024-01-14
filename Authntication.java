import java.util.*;
class Authentication
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
     if(pass!="GPD")
     {
        throw new Authentication;
     }
     else
     {
	     System.out.prinln("***WELCOME****");
     }
     catch(Authetication e)
     {
         System.out.println("Chal Bhagh BSDK");
     }
  }
}