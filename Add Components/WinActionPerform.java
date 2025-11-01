//This is a java program to create and add a Button inside the constructor of the class.

import javax.swing.*; 

public class WinActionPerform 
{ 
	private JFrame myframe;
	private JButton btn;
	private JLabel msg;
	
	WinConsButton(String title, int w, int h)
	{
		//create a object of JFrame class.
		myframe = new JFrame(title);
		
		//set the size of the window
		myframe.setSize(w, h) ;
		
		//create a object of JButton class.
		btn = new JButton("Click Me");
		
		//create a object of JLabel class.
		msg = new JLabel("Thank You");
		
		// x axis, y axis, width, height
		btn.setBounds(180, 50, 100, 70); 
		
		//add button and label in Frame
		myframe.add(btn);
		myframe.add(msg);
		
		//make label invisible
		msg.setVisible(false);
		
		//optional -  What happens when the frame closes
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Layout of the Frame
		myframe.setLayout(null);
		
		//Make it Visible in your Screen
		myframe.setVisible(true);

		//add Action Listner(Click on Button) to the Button
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				msg.setVisible(true);
			}
		})
	}
	
    public static void main(String[] args) 
    { 
		new WinConsButton("My First Window", 500, 300);
	}
}