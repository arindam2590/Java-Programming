//This is a java program for ActionListener.

import javax.swing.*; 
import java.awt.event.*; 

public class WinActionPerform implements ActionListener
{ 
	private JFrame myframe;
	private JPanel mypanel;
	private JButton btn;
	private JLabel msg;
	
	WinActionPerform(String title, int w, int h)
	{
		//create a object of JFrame, JPanel, JButton, JLabel  class.
		myframe = new JFrame(title);
		mypanel = new JPanel();
		btn = new JButton("Click Me");
		msg = new JLabel("************Thank You***********");
		
		//set properties of label
		msg.setBounds(180, 50, 300, 70);
		msg.setVisible(false);
		
		//set properties of button
		btn.setBounds(180, 50, 100, 70); 
		btn.addActionListener(this);
		
		//add component in the panel
		mypanel.add(btn);
		mypanel.add(msg);
				
		//set properties of frame
		myframe.add(mypanel);
		myframe.setSize(w, h);
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setVisible(true);
	}
	
	//add Action Listner(Click on Button) to the Button
	public void actionPerformed(ActionEvent e) 
	{
		msg.setVisible(true);
	}
	
    public static void main(String[] args) 
    { 
		new WinActionPerform("My First Window", 500, 300);
	}
}