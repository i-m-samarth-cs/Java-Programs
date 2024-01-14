class Table
{
   public static void main(String args[])
   {
	  int num;
      num=Integer.parseInt(args[0]);
	  for(int i=1;i<=10;i++)
	  {
		int t=num*i;
		System.out.println(num+" X"+i+"="+t);
     }
   }
}