import java.applet.*;
import java.awt.*;

public class Arc extends Applet
{
	public void paint(Graphics g)
	{
		int a=110,b=140,c=170,d=170,e=0,f=75;

		g.setColor(Color.blue);

		for(int i=0;i<5;i++)
		{
			try
			{
				Thread.sleep(1000);
			}catch(InterruptedException ex){}
			g.drawArc(a,b,c,d,e,f);
			a=a+10;
			b=b+10;
			c=c-20;
			d=d-20;
		}
	}
}

/*<applet code="Arc" width=400 height=400> </applet> */