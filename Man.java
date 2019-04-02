import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

import javax.swing.JComponent;

/**
 * 
 * @author Krisi Hristova
 *
 */
public class Man extends JComponent 
{
	private Ellipse2D.Double head;    //don't need (x,y) coordinates, bc they are already set in JCompent and it it inherited
	private Rectangle leftArm, rightArm, leftLeg, rightLeg, body;
	private int dx = 0; 
	private int dy= 0;
	
	
	
	public Man(int x, int y)
	{
		this.setLocation(x,y);
		this.setSize(31, 56);
		head     = new Ellipse2D.Double(10, 0, 10, 10);
		body     = new Rectangle(12, 10, 8, 22);
		leftArm  = new Rectangle(12, 10, 15, 3);
		rightArm = new Rectangle(5, 10, 17, 3);
		leftLeg  = new Rectangle(12, 25, 3, 20);
		rightLeg = new Rectangle(17,25, 3, 20);
	
	}
	
	public void setDX(int x)
	{
		dx = x;
	}
	public void setDY(int y)
	{
		dy = y;
	}
	
	public int getDX()
	{
		return dx;
	}
	public int getDY()
	{
		return dy;
	}
	
	public void update()
	{
		setLocation(getX() + dx, getY() + dy);
		if(getX() <= 0)
		{
			setDX(0);
		}
		if(getX() >= 590)
		{
			setDX(0);
		}
		if(getY() <= 0)
		{
			setDY(0);
		}
		if(getY() >= 570)
		{
			setDY(0);
		}
	}
	

	
	
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.fill(head);
		g2.fill(body);
		g2.fill(leftArm);
		g2.fill(rightArm);
		g2.fill(leftLeg);
		g2.fill(rightLeg);
		


	}
}
