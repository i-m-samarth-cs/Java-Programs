class DemoImplicit2
{
    public static void main(String args[])
    {
        byte b=32;

        short j=b;
        int k=j;
        long l=k;
        float m=l;
        double d=m;

        System.out.println("Byte value =" +b);
        System.out.println("Short value= "+j);
        System.out.println("int value= "+k);
        System.out.println("Long value ="+l);
        System.out.println("Float value= "+m);
        System.out.println("Double value= "+d);
    }
}