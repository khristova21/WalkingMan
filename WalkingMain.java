import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

public class WalkingMain extends JFrame implements ActionListener
{

	int changeX;
	int changeY; 
	boolean up, down, left, right;
	Man person = new Man(10, 0);
	ArrayList<Ball> balls = new ArrayList<Ball>();  
	
	public WalkingMain()
	{
		
		new JFrame("Walking Person");
		setLayout(null);
		setBounds(200, 150, 600, 600);
		
		//Man person = new Man(10, 0);
		person.setLocation(30, 100);
		add(person);

		
		//CREATE A PROPER TIMER
		Timer t1 = new Timer(60, this);
		t1.start();
		
		this.addKeyListener(new KeyListener() 
		{

			@Override
			public void keyPressed(KeyEvent e) 
			{
				if(e.getKeyCode() == e.VK_UP)
				{
					person.setDY(-5);
					if(person.getY() <= 0)
					{
						person.setDY(0);
					} 
				}
				else if(e.getKeyCode() == e.VK_DOWN)
				{
					person.setDY(5);
					if(person.getY() >= 550)
					{
						person.setDY(0);
					} 
				}
				else if(e.getKeyCode() == e.VK_LEFT)
				{
					person.setDX(-5);
					if(person.getX() <= 0)
					{
						person.setDX(0);
					} 
				}
				else if(e.getKeyCode() == e.VK_RIGHT)
				{
					person.setDX(5);
					if(person.getX() >= 300)
					{
						person.setDX(0);
					} 
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {

				if(e.getKeyCode() == e.VK_UP)
				{
					person.setDY(0);
				}
				else if(e.getKeyCode() == e.VK_DOWN)
				{
					person.setDY(0);
				}
				else if(e.getKeyCode() == e.VK_LEFT)
				{
					person.setDX(0);
				}
				else if(e.getKeyCode() == e.VK_RIGHT)
				{
					person.setDX(0);
				}
				else if(e.getKeyCode() == e.VK_SPACE)
				{
					//SHOOT  BALL
					
				}
			}

			@Override
			public void keyTyped(KeyEvent e)
			{
				if(e.getKeyChar() == ' ')
				{
					Ball ball = new Ball();
					ball.setLocation(person.getX(), person.getY());
					balls.add(ball);
					add(ball);					
				}
			}
			
		});
			
				
		

			
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		person.update();
		repaint();

		for(int i = 0; i < balls.size(); i++)
		{
			balls.get(i).setLocation(balls.get(i).getLocation().x + 12, balls.get(i).getLocation().y);	
			if(balls.get(i).getX() > 600)
			{
				remove(balls.get(i));
				balls.remove(balls.get(i));
			}
		}
	}
	public static void main(String[] args)  
	{
			new WalkingMain();	
	}

	
}
