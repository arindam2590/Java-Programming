//This is a java program to create a window using class inheritance feature of Java.
//java Swing package is required for it. JFrame class is located inside swing package

import javax.swing.*; 

public class WindowInheritance extends JFrame
{ 
	private JFrame myframe;
	
	WindowInheritance(String title, int w, int h)
	{
		//set title of the Frame.
		setTitle(title);
		
		//set the size of the window
		setSize(w, h) ;
		
		//optional -  What happens when the frame closes
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Make it Visible in your Screen
		setVisible(true); 
		
	}
    public static void main(String[] args) 
    { 
		new WindowInheritance("My First Window", 500, 300);
	}
}