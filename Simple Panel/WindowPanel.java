//This is a java program for Panel.

import javax.swing.*; 
import java.awt.event.*; 

public class WindowPanel
{ 
	private JFrame myframe;
	private JPanel mypanel;
	private JButton btn;
	private JLabel msg;
	
	WindowPanel(String title, int w, int h)
	{
		//create a object of JFrame, JPanel, JButton, JLabel class.
		myframe = new JFrame(title);
		mypanel = new JPanel();
		btn = new JButton("Click Me");
		msg = new JLabel("************Thank You***********");
		
		//set properties of label
		msg.setBounds(180, 50, 300, 70);
		
		
		//set properties of button
		btn.setBounds(180, 50, 100, 70); 
				
		//add component in the panel
		mypanel.add(msg);
		mypanel.add(btn);
		
		//set properties of frame
		myframe.add(mypanel);
		myframe.setSize(w, h);
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setVisible(true);
	}
    public static void main(String[] args) 
    { 
		new WindowPanel("My First Window", 500, 300);
	}
}