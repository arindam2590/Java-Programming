//This is a java program to create and add Button in the window

import javax.swing.*; 

public class WindowButton 
{ 
    public static void main(String[] args) 
    { 
		//create a object of JFrame class.
		JFrame myframe = new JFrame("My First Window");
		
		//create a object of JButton class.
		JButton btn = new JButton("Click Me");
		
		// x axis, y axis, width, height
		btn.setBounds(180, 50, 100, 50); 
		
		//add button in Frame
		myframe.add(btn);
		
		//set the size of the window
		myframe.setSize(500, 300) ;
		
		//optional -  What happens when the frame closes
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Layout of the Frame
		myframe.setLayout(null);
		
		//Make it Visible in your Screen
		myframe.setVisible(true); 
	}
}