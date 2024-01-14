package mypack;
public class Account
{
	int accno;
	double balance;

	public Account(int ano,double bal)
	{
		accno=ano;
		balance=bal;
	}
	public void display()
	{
		System.out.println("Account number : "+accno);
		System.out.println("Balance : "+balance); 
	}
}