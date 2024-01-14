class DemoExplicit
{
    public static void main(String args[])
    {
        double d =  45.0;
        float f  = (float) d;
        long l   = (long) f;
        int i    = (int) l;
        short s  = (short)i;
        byte b   = (byte)s;

         System.out.println("Double Value" +d);
         System.out.println("Float Value" +f);
         System.out.println("Long Value" +l);
         System.out.println("int Value" +i);
         System.out.println("short Value" +s);
         System.out.println("byte Value" +b);
    }
}