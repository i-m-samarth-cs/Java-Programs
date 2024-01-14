import java.applet.*;
import java.awt.*;

public class square extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Square inside Circle",150,110);

		g.drawOval(180,10,80,80);
		g.drawRect(192,22,55,55);
	}
} 

/* <applet code="square" width=400 height=400 ></applet> */