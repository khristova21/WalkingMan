import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;


public class Button extends JFrame implements ActionListener
{

	private int height;
	private int wide;
	private JButton button;
	
	public Button()
	{
		 height = 0;
		 wide = 0;
		
		 new JFrame("Button");
		 setLayout(null);
		 setBounds(300, 300, 600, 600);
			
			

			//put this in a new class
			JButton button = new JButton("BUTTON!");
			button.setSize(100,50);
			button.setLocation(getWidth()/2-button.getWidth()/2, getHeight()/2-button.getHeight()/2);   //button in center of the frame 
			
			add(button);
			
			Timer t1 = new Timer(100, this);
			
			this.addKeyListener(new KeyListener() 
			{

				@Override
				public void keyPressed(KeyEvent e) 
				{
					if(e.getKeyCode() == e.VK_UP)
					{
						height = 1;
					}
					else if(e.getKeyCode() == e.VK_DOWN)
					{
						height = -1;
					}
					else if(e.getKeyCode() == e.VK_LEFT)
					{
						wide = -1;
					}
					else if(e.getKeyCode() == e.VK_RIGHT)
					{
						wide = 1;
					}
				}

				@Override
				public void keyReleased(KeyEvent e) {

					if(e.getKeyCode() == e.VK_UP)
					{
						height = 0;
					}
					else if(e.getKeyCode() == e.VK_DOWN)
					{
						height = 0;
					}
					else if(e.getKeyCode() == e.VK_LEFT)
					{
						wide = 0;
					}
					else if(e.getKeyCode() == e.VK_RIGHT)
					{
						wide = 0;
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
		button.setSize(button.getWidth() + wide, button.getHeight() + height);
		button.setLocation(getWidth()/2-button.getWidth()/2, getHeight()/2-button.getHeight()/2);   //button in center of the frame 
		repaint();

		
	}

	
	public static void main(String[] args)
	{
			new Button();	
	}
	

}
