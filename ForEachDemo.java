class ForEachDemo
{
   public static void main(String args[])
   {
     int[] array={1,2,3,4,5};
   int sum=0;
     for(int ele:array)
     {
        sum=sum+ele;
     }
System.out.println("Sum is"+sum);
   }
}