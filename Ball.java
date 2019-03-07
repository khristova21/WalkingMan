import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

/**
 * @author Krisi Hristova
 * Period 6
 *
 */

public class Ball extends JComponent
{
	private Ellipse2D.Double ball;    //don't need (x,y) coordinates, bc they are already set in JCompent and it it inherited
	
	public Ball()
	{
		ball = new Ellipse2D.Double(0, 0, 10, 10);
		this.setSize(11,11);
	}
	public void paintComponent(Graphics g)     //this method already exists but we're overriding 
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.fill(ball);
		
	}

}
