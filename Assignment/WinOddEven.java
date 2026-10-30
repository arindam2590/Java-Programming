//This is a java program to check whether a given number is odd or even.

import javax.swing.*; 
import java.awt.event.*; 
import java.awt.Font;
import java.awt.Dimension;

public class WinOddEven
{ 
	private JFrame myframe;
	private JPanel mypanel;
	private JButton CheckBtn;
	private JButton ResetBtn;
	private JTextField TxtFld;
	private JLabel lblNum;
	private JLabel lblResult;
	private Dimension size;
	
	WinOddEven(String title, int w, int h)
	{
		myframe = new JFrame(title);
		mypanel = new JPanel();
		CheckBtn = new JButton("CHECK");
		ResetBtn = new JButton("RESET");
		lblNum = new JLabel("ENTER A NUMBER :: ");
		lblResult = new JLabel();
		TxtFld = new JTextField("");
		
		Font font = new Font("Courier", Font.BOLD,20);
		lblNum.setFont(font);
		lblResult.setFont(font);
		size = lblNum.getPreferredSize();
		lblNum.setBounds(20, 10, size.width, size.height);
		TxtFld.setBounds(230, 10, 100, 30);
		TxtFld.setFont(font);
		CheckBtn.setBounds(100, 110, 100, 30);
		ResetBtn.setBounds(230, 110, 100, 30);
		
		CheckBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(TxtFld.getText());
				if (num%2 == 0)
				{
					lblResult.setText(num + " is an EVEN Number");
				}
				else
				{
					lblResult.setText(num + " is an ODD Number");
				}
				size = lblResult.getPreferredSize();
				lblResult.setBounds(20, 50, size.width, size.height);
			}
		});
		ResetBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblResult.setText("");
				TxtFld.setText("");
			}
		});
		
		mypanel.setLayout(null);
		mypanel.add(lblNum);
		mypanel.add(TxtFld);
		mypanel.add(lblResult);
		mypanel.add(CheckBtn);
		mypanel.add(ResetBtn);
		
		myframe.add(mypanel);
		myframe.setSize(w, h);
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setLocationRelativeTo(null); //make center appearance of the window
		myframe.setVisible(true);
	}
	public static void main(String[] args) 
    { 
		new WinOddEven("Odd Even Checking", 370, 200);
	}
}