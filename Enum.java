import java.util.*;
class Enum
{
  public enum students{SAM,RAM,SHYAM};
  
  public static void main(String args[])
  {
    for(students s:students.values())
     System.out.println(s);
  }
}