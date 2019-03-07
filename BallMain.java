import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class BallMain 
{

	public static void main(String[] args)
	{
		JFrame myFrame = new JFrame("Ballin'");
		myFrame.setLayout(null);
		myFrame.setBounds(300, 300, 600, 600);
		
		Ball myBall = new Ball();
		myBall.setLocation(30, 100);
		myFrame.add(myBall);
		
		Ball myBall2 = new Ball();
		myBall2.setLocation(200, 30);
		myFrame.add(myBall2);
		
		Ball nose = new Ball();
		nose.setLocation(110, 60);
		myFrame.add(nose);
		
		
		Timer t1 = new Timer(100,new ActionListener ()
				{
					public void actionPerformed(ActionEvent e)
					{
						myBall.setLocation((int)(Math.random()* 550), (int)(Math.random()*150));
						myFrame.repaint();
					}
				}
				);
		
		
		t1.start();
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	}

}
