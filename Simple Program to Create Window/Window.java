//This is a java program to create a window inside main function.
//java Swing package is required for it. JFrame class is located inside swing package

import javax.swing.*; 

public class Window 
{ 
    public static void main(String[] args) 
    { 
		//create a object of JFrame class.
		JFrame myframe = new JFrame("My First Window");
		
		//set the size of the window
		myframe.setSize(500, 300) ;
		
		//optional -  What happens when the frame closes
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Make it Visible in your Screen
		myframe.setVisible(true); 
	}
}