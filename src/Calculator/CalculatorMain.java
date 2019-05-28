package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorMain {

	private JFrame frame;
	private JTextField textDisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorMain window = new CalculatorMain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorMain() {
		initialize();
	}
	
	CalculatorProcess process = new CalculatorProcess();
	
	
	  public void show() 
	  { 
		  textDisplay.setText(process.Displaystr); 
	  }
	 

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(143, 188, 143));
		frame.setBounds(100, 100, 290, 421);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textDisplay = new JTextField();
		textDisplay.setFont(new Font("Timpani", Font.BOLD, 30));
		textDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		textDisplay.setBounds(10, 11, 250, 57);
		frame.getContentPane().add(textDisplay);
		textDisplay.setColumns(10);
		
		JButton btnB = new JButton("B");
		btnB.setBackground(new Color(240, 230, 140));
		btnB.setFont(new Font("Tekton Pro Cond", Font.BOLD, 35));
		btnB.setBounds(10, 79, 55, 47);
		frame.getContentPane().add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
			textDisplay.setText(null);
			}
		});
		btnC.setFont(new Font("Tekton Pro Cond", Font.BOLD, 35));
		btnC.setBackground(new Color(211, 211, 211));
		btnC.setBounds(75, 79, 55, 47);
		frame.getContentPane().add(btnC);
		
		JButton btnPer = new JButton("%");
		btnPer.setFont(new Font("Tekton Pro Cond", Font.BOLD, 35));
		btnPer.setBackground(new Color(245, 222, 179));
		btnPer.setBounds(140, 79, 55, 47);
		frame.getContentPane().add(btnPer);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
								
				 JButton newbtn= (JButton) e.getSource();
				process.partition(newbtn.getText());
			}
		});
		btnAdd.setFont(new Font("Tekton Pro Cond", Font.BOLD, 35));
		btnAdd.setBackground(new Color(255, 218, 185));
		btnAdd.setBounds(205, 79, 55, 47);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				process.partition(btnSub.getText());
				textDisplay.setText(String.valueOf(process.cprocess()));
			}
		});
		btnSub.setFont(new Font("Tekton Pro Cond", Font.BOLD, 35));
		btnSub.setBackground(new Color(255, 218, 185));
		btnSub.setBounds(205, 137, 55, 47);
		frame.getContentPane().add(btnSub);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				process.Displaystr +="9";
				show();
				// String EnterNumber = textDisplay.getText() + btn9.getText();
				// textDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tekton Pro Cond", Font.BOLD, 35));
		btn9.setBackground(new Color(245, 222, 179));
		btn9.setBounds(140, 137, 55, 47);
		frame.getContentPane().add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			
		{
				process.Displaystr +="8";
				show();
				
				// String EnterNumber = textDisplay.getText() + btn8.getText();
				// textDisplay.setText(EnterNumber);
		}
		});
		btn8.setFont(new Font("Tekton Pro Cond", Font.BOLD, 35));
		btn8.setBackground(new Color(211, 211, 211));
		btn8.setBounds(75, 137, 55, 47);
		frame.getContentPane().add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				process.Displaystr +="7";
				show();
				//String EnterNumber = textDisplay.getText() + btn7.getText();
				//textDisplay.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tekton Pro Cond", Font.BOLD, 35));
		btn7.setBackground(new Color(240, 230, 140));
		btn7.setBounds(10, 137, 55, 47);
		frame.getContentPane().add(btn7);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				process.partition(btnMul.getText());
				textDisplay.setText(String.valueOf(process.cprocess()));
			}
		});
		btnMul.setFont(new Font("Tekton Pro Cond", Font.BOLD, 35));
		btnMul.setBackground(new Color(255, 218, 185));
		btnMul.setBounds(205, 195, 55, 47);
		frame.getContentPane().add(btnMul);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				process.Displaystr += "6";
				show();
				// String EnterNumber = textDisplay.getText() + btn6.getText();
				// textDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tekton Pro Cond", Font.BOLD, 35));
		btn6.setBackground(new Color(245, 222, 179));
		btn6.setBounds(140, 195, 55, 47);
		frame.getContentPane().add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				process.Displaystr +="5";
				show();
				// String EnterNumber = textDisplay.getText() + btn5.getText();
				// textDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tekton Pro Cond", Font.BOLD, 35));
		btn5.setBackground(new Color(211, 211, 211));
		btn5.setBounds(75, 195, 55, 47);
		frame.getContentPane().add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				process.Displaystr +="4";
				show();
				// String EnterNumber = textDisplay.getText() + btn4.getText();
				// textDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tekton Pro Cond", Font.BOLD, 35));
		btn4.setBackground(new Color(245, 245, 220));
		btn4.setBounds(10, 195, 55, 47);
		frame.getContentPane().add(btn4);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				process.partition(btnDiv.getText());
				textDisplay.setText(String.valueOf(process.cprocess()));
			}
		});
		btnDiv.setFont(new Font("Tekton Pro Cond", Font.BOLD, 35));
		btnDiv.setBackground(new Color(245, 255, 250));
		btnDiv.setBounds(205, 253, 55, 47);
		frame.getContentPane().add(btnDiv);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				process.Displaystr += "3";
				show();
				// String EnterNumber = textDisplay.getText() + btn3.getText();
				// textDisplay.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tekton Pro Cond", Font.BOLD, 35));
		btn3.setBackground(new Color(238, 232, 170));
		btn3.setBounds(140, 253, 55, 47);
		frame.getContentPane().add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				process.Displaystr += "2";
				show();
				// String EnterNumber = textDisplay.getText() + btn2.getText();
				// textDisplay.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tekton Pro Cond", Font.BOLD, 35));
		btn2.setBackground(new Color(255, 228, 225));
		btn2.setBounds(75, 253, 55, 47);
		frame.getContentPane().add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				process.Displaystr += "1";
				show();
				// String EnterNumber = textDisplay.getText() + btn1.getText();
				// textDisplay.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tekton Pro Cond", Font.BOLD, 35));
		btn1.setBackground(new Color(255, 240, 245));
		btn1.setBounds(10, 253, 55, 47);
		frame.getContentPane().add(btn1);
		
		JButton btnEnter = new JButton("=");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				process.GetsecondNum();
				textDisplay.setText(String.valueOf(process.cprocess()));
			}
		});
		btnEnter.setFont(new Font("Tekton Pro Cond", Font.BOLD, 35));
		btnEnter.setBackground(new Color(253, 245, 230));
		btnEnter.setBounds(140, 311, 120, 47);
		frame.getContentPane().add(btnEnter);
		
		JButton btnPo = new JButton(".");
		btnPo.setFont(new Font("Tekton Pro Cond", Font.BOLD, 35));
		btnPo.setBackground(new Color(224, 255, 255));
		btnPo.setBounds(75, 311, 55, 47);
		frame.getContentPane().add(btnPo);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				process.Displaystr += "0";
				show();
				// String EnterNumber = textDisplay.getText() + btn0.getText();
				// textDisplay.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tekton Pro Cond", Font.BOLD, 35));
		btn0.setBackground(new Color(238, 232, 170));
		btn0.setBounds(10, 311, 55, 47);
		frame.getContentPane().add(btn0);
	}
}
