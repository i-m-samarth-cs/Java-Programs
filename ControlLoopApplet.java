import java.awt.*;
import java.applet.*;

public class ControlLoopApplet extends Applet
{
	public void paint(Graphics g)
	{
		for(int i=1;i<=4;i++)
		{
			if(i%2==0)
			{
				g.fillOval(90,i*50+10,50,50);
				g.setColor(Color.black);
			}
			else
			{
				g.fillOval(90,i*50+10,50,50);
				g.setColor(Color.green);
			}
		}
	}
}

/*
<applet code=ControlLoopApplet width=300 height=300>
</applet> */



 