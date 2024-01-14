import java.awt.*;
import java.applet.*;

public class ConcentricCircles extends Applet
{
 public void paint(Graphics g)
 {
  g.setFont(new Font("Times New Roman",Font.BOLD|Font.ITALIC,14));
  g.drawString("Concentric Circles",30,30);
  int i=65,j=65;
  while(i>=30)
  {
   g.drawCircle(i,i,j,j);   
   i = i - 10;
   j = j + 20;
  }
 }
}

/* <applet code=ConcentricCircles width=200 height=200>
  </applet> */
