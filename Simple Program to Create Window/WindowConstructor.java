//This is a java program to create a window inside the constructor of the class.
//java Swing package is required for it. JFrame class is located inside swing package

import javax.swing.*; 

public class WindowConstructor 
{ 
	private JFrame myframe;
	
	WindowConstructor(String title, int w, int h)
	{
		//create a object of JFrame class.
		myframe = new JFrame(title);
		
		//set the size of the window
		myframe.setSize(w, h) ;
		
		//optional -  What happens when the frame closes
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Make it Visible in your Screen
		myframe.setVisible(true); 
		
	}
    public static void main(String[] args) 
    { 
		new WindowConstructor("My First Window", 500, 300);
	}
}