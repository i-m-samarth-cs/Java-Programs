import java.io.*;
import java.util.*;
class AuthenticationFailure extends Exception
{
	AuthenticationFailure()
	{
		System.out.println("Invalid Password");
	}
}
class Password
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter Password");
			String pass=sc.next();
		
			if(pass.equals("Samarth123@"))
				System.out.println("Login Successful");
			else
				throw new AuthenticationFailure();
		}		
		catch(AuthenticationFailure e)
		{
			System.out.println(e);
		}
	}

}