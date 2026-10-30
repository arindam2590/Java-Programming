//package Windcal;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Dimension;
//import java.awt.FlowLayout;

public class Windcal{
    
    private JFrame myframe;
    private JLabel lblnum1;
    private JLabel lblnum2;
    private JLabel lblresult;
    private JPanel mypanel;
    private JButton calbtn;
    private JButton resetbtn;
    private JTextField TxtFld1;
    private JTextField TxtFld2;
    private Dimension size1;
    //private Dimension size2;

    Windcal(String title,int w, int h)
    {
        myframe = new JFrame(title);
        mypanel=   new JPanel();
        calbtn= new JButton("Calculate");
        resetbtn= new JButton("Reset");
        lblnum1= new JLabel("ENTER FIRST NUMBER :: ");
        TxtFld1 = new JTextField(5);
        lblnum2= new JLabel("ENTER SECOND NUMBER :: ");
        TxtFld2 = new JTextField(5);
        lblresult =  new JLabel("");
        //TxtFld1 = new JTextField(5);
        //TxtFld2 = new JTextField(5);
        
        
        Font font= new Font("Courier",Font.BOLD,20);
        
        lblnum1.setFont(font);
        lblnum2.setFont(font);
        lblresult.setFont(font);
        calbtn.setFont(font);
        resetbtn.setFont(font);
		TxtFld1.setFont(font);
        TxtFld2.setFont(font);
		
        size1=lblnum1.getPreferredSize();
        lblnum1.setBounds(20, 10, size1.width, size1.height);
        size1=lblnum2.getPreferredSize();
        lblnum2.setBounds(20, 60, size1.width, size1.height);
		
		TxtFld1.setBounds(290, 10, 100, 30);
        TxtFld2.setBounds(290, 60, 100, 30);
		calbtn.setBounds(100, 160, 150, 30);
		resetbtn.setBounds(270, 160, 100, 30);
        
        calbtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                int one = Integer.parseInt(TxtFld1.getText());
                int two = Integer.parseInt(TxtFld2.getText());
                int sum = one+two;
                lblresult.setText("Sum of "+one+ " and "+two+" is "+sum);
				size1 = lblresult.getPreferredSize();
				lblresult.setBounds(30, 110, size1.width, size1.height);
            }
        });
        
        resetbtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
				lblresult.setText("");
				TxtFld1.setText("");
                TxtFld2.setText("");        
			}
        });
        
//mypanel.setLayout(new FlowLayout());
		mypanel.add(lblnum1);
        mypanel.add(lblnum2);
		mypanel.add(TxtFld1);
        mypanel.add(TxtFld2);
		mypanel.add(lblresult);
		mypanel.add(calbtn);
		mypanel.add(resetbtn);
		
		mypanel.setLayout(null);
		myframe.add(mypanel);
		myframe.setSize(w, h);
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setLocationRelativeTo(null); //make center appearance of the window
		myframe.setVisible(true);
	}
	public static void main(String[] args) 
    { 
		new Windcal("simple Addition", 430, 250);
	}
}
        