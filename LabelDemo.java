class LabelDemo
{
public static void main(String args[])
{
boolean t=true;
first:
{
second:
{
third:
{
System.out.println("Before the break;");

//break out the second block
System.out.println("This won't execute");
}
continue third;
System.out.println("This won't execute");
}
System.out.println("This is after second block.");
}
}
}
