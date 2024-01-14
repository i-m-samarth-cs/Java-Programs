import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Animation extends Applet
{
	public void paint(Graphics g)
	{
		int a=150,b=170,c=10,d=10;

		g.setColor(Color.red);
		for(int i=0;i<10;i++)
		{
			try
			{
				Thread.sleep(1000);
			}catch(InterruptedException e){}
			g.drawOval(a,b,c,d);
			a-=10;
			b-=10;
			c+=8;
			d+=8;
		}
	}
}

/*<applet code=Animation width=400 height=400 ></applet > */