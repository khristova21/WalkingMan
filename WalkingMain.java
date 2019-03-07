import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

public class WalkingMain extends JFrame implements ActionListener
{

	int changeX;
	int changeY; 
	boolean up, down, left, right;
	Man person = new Man(10, 0);

	
	public WalkingMain()
	{
		
		new JFrame("Walking Person");
		setLayout(null);
		setBounds(300, 300, 600, 600);
		
		//Man person = new Man(10, 0);
		person.setLocation(30, 100);
		add(person);

		
		//CREATE A PROPER TIMER
		Timer t1 = new Timer(100, this);
		t1.start();
		
		
		this.addKeyListener(new KeyListener() 
		{

			@Override
			public void keyPressed(KeyEvent e) 
			{
				System.out.print(e.getKeyChar());
				
				if(e.getKeyCode() == e.VK_UP)
				{
					if(person.getY() <= 0)
					{
						person.setDY(0);
					}
					person.setDY(-5);
					
				}
				else if(e.getKeyCode() == e.VK_DOWN)
				{
					person.setDY(5);
				}
				else if(e.getKeyCode() == e.VK_LEFT)
				{
					person.setDX(-5);
				}
				else if(e.getKeyCode() == e.VK_RIGHT)
				{
					person.setDX(5);
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
			}

			@Override
			public void keyTyped(KeyEvent e)
			{
				
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
	}
	public static void main(String[] args)  
	{
			new WalkingMain();	
	}

	
}
