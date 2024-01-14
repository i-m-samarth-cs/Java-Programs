import java.applet.*;
import java.awt.*;
/*
 <applet code="Number" width=200 height=200>
 </applet>
*/
class Number extends Applet
{
  
  public void paint(Graphics g)
  {     setBackground(Color.red);
     setForeground(Color.yellow);
        
		for(int i=1;i<11;i++)
        {
         String no=" "+i;
		  g.drawString(no,20,20);
        }
  }
}