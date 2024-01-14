import java.applet.*;
import java.awt.*;

public class circle2 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Circle inside square",150,110);

		g.drawOval(80,10,80,80);
		g.drawRect(80,10,80,80);
	}
} 

/* <applet code="circle2" width=400 height=400 ></applet> */