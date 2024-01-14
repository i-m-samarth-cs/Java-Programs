import java.applet.*;
import java.awt.*;
/*
<applet code = "aap1" width=200 height=300>
< param name="pname" value="Samarth"/>
</applet>
*/
public class aap1 extends Applet
{
  String name,msg;
  public void init()
  {
     name= getParameter("pname");  
  }
  public void paint(Graphics g)
  {
     msg="Hello "+name;
     g.drawString(msg,30,40);
  }
}