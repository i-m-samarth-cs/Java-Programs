import java.applet.*;
import java.awt.*;

public class AnimationPolygon extends Applet 
{
	int a1=110,b1=180,c1=30,d1=110,a2=30,b2=100,c2=100,d2=30;

	public void paint(Graphics g)
	{
		for(int i=0;i<5;i++)
		{
			try
			{
				Thread.sleep(1000);
			}catch(InterruptedException e){}
		
			int xPoints[]={a1,b1,c1,d1};
			int yPoints[]={a2,b2,c2,d2};
		
			g.setColor(Color.RED);
			g.fillPolygon(xPoints,yPoints,4);

			a1=a1+20;
			b1=b1+20;
			a2=a2+20;
			b2=b2+20;
			c1=c1+20;
			d1=d1+20;
			c2=c2+20;
			d2=d2+20;
		}
	}
}

/*<applet code="AnimationPolygon" width=400 height=400 ></applet> */