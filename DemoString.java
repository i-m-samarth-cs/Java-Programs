
class DemoString
{
	public static void main(String args[])
	{
		String str="Pooja";
		
		System.out.println(str);
		

		System.out.println(str.charAt(2)); 
		System.out.println(str.length());
		System.out.println(str.substring(1));     //substring(int beginindex)
		System.out.println(str.substring(1,4));	  //substring(int startindex, int endindex)
		System.out.println(str.startsWith("Po"));
		System.out.println(str.endsWith("ja"));
		System.out.println(str.equals("pooja"));
		System.out.println(str.equalsIgnoreCase("POOJA"));
			
		
	}
}