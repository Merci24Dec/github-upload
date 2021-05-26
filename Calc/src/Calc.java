import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
//import java.util.concurrent.TimeUnit
public class Calc {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	Double first,second,result;
	String operation;
	String s1=new String();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
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
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 309, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lb1 = new JLabel("");
		lb1.setBackground(new Color(127, 255, 212));
		lb1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lb1.setBounds(10, 365, 274, 43);
		frame.getContentPane().add(lb1);
		
		textField = new JTextField();
		textField.setBackground(new Color(224, 255, 255));
		textField.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField.setBounds(10, 20, 274, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn_ac = new JButton("AC");
		btn_ac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				lb1.setText(null);
			}
		});
		btn_ac.setBackground(Color.RED);
		btn_ac.setForeground(Color.BLACK);
		btn_ac.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_ac.setBounds(10, 100, 61, 43);
		frame.getContentPane().add(btn_ac);
		
		JButton btn_b = new JButton("\uF0E7");
		btn_b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String backspace=null;
				lb1.setText(null);
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace=str.toString();
					textField.setText(backspace);
				}
			}
		});
		btn_b.setForeground(Color.BLACK);
		btn_b.setFont(new Font("Windings", Font.BOLD, 20));
		btn_b.setBackground(Color.RED);
		btn_b.setBounds(81, 100, 61, 43);
		frame.getContentPane().add(btn_b);
		
		JButton btn_percent = new JButton("%");
		btn_percent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				operation="%";
				lb1.setText(null);
				s1="";
				s1+=textField.getText();	
				s1+=operation;
				lb1.setText(s1);
				textField.setText("");
			}
		});
		btn_percent.setForeground(Color.BLACK);
		btn_percent.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_percent.setBackground(Color.CYAN);
		btn_percent.setBounds(152, 100, 61, 43);
		frame.getContentPane().add(btn_percent);
		
		JButton btn_div = new JButton("/");
		btn_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				lb1.setText(null);
				s1="";
				s1+=textField.getText();
				operation="/";	
				s1+=operation;
				lb1.setText(s1);
				textField.setText("");
				
			}
		});
		btn_div.setForeground(Color.BLACK);
		btn_div.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_div.setBackground(Color.CYAN);
		btn_div.setBounds(223, 100, 61, 43);
		frame.getContentPane().add(btn_div);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn_7.getText();
				textField.setText(num);
			}
		});
		btn_7.setForeground(Color.BLACK);
		btn_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_7.setBackground(Color.GREEN);
		btn_7.setBounds(10, 153, 61, 43);
		frame.getContentPane().add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn_8.getText();
				textField.setText(num);
			}
		});
		btn_8.setForeground(Color.BLACK);
		btn_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_8.setBackground(Color.GREEN);
		btn_8.setBounds(81, 153, 61, 43);
		frame.getContentPane().add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn_9.getText();
				textField.setText(num);
			}
		});
		btn_9.setForeground(Color.BLACK);
		btn_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_9.setBackground(Color.GREEN);
		btn_9.setBounds(152, 153, 61, 43);
		frame.getContentPane().add(btn_9);
		
		JButton btn_mul = new JButton("x");
		btn_mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				lb1.setText(null);
				s1="";
				s1+=textField.getText();
				operation="*";	
				s1+=operation;
				lb1.setText(s1);
				textField.setText("");
				
			}
		});
		btn_mul.setForeground(Color.BLACK);
		btn_mul.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_mul.setBackground(Color.CYAN);
		btn_mul.setBounds(223, 153, 61, 43);
		frame.getContentPane().add(btn_mul);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn_4.getText();
				textField.setText(num);
			}
		});
		btn_4.setForeground(Color.BLACK);
		btn_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_4.setBackground(Color.GREEN);
		btn_4.setBounds(10, 206, 61, 43);
		frame.getContentPane().add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn_5.getText();
				textField.setText(num);
			}
		});
		btn_5.setForeground(Color.BLACK);
		btn_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_5.setBackground(Color.GREEN);
		btn_5.setBounds(81, 206, 61, 43);
		frame.getContentPane().add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn_6.getText();
				textField.setText(num);
			}
		});
		btn_6.setForeground(Color.BLACK);
		btn_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_6.setBackground(Color.GREEN);
		btn_6.setBounds(152, 206, 61, 43);
		frame.getContentPane().add(btn_6);
		
		JButton btn_neg = new JButton("-");
		btn_neg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				lb1.setText(null);
				s1="";
				s1+=textField.getText();
				operation="-";	
				s1+=operation;
				lb1.setText(s1);
				textField.setText("");

			}
		});
		btn_neg.setForeground(Color.BLACK);
		btn_neg.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_neg.setBackground(Color.CYAN);
		btn_neg.setBounds(223, 206, 61, 43);
		frame.getContentPane().add(btn_neg);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String num=textField.getText()+btn_1.getText();
				textField.setText(num);
			}
		});
		btn_1.setForeground(Color.BLACK);
		btn_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_1.setBackground(Color.GREEN);
		btn_1.setBounds(10, 259, 61, 43);
		frame.getContentPane().add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn_2.getText();
				textField.setText(num);
			}
		});
		btn_2.setForeground(Color.BLACK);
		btn_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_2.setBackground(Color.GREEN);
		btn_2.setBounds(81, 259, 61, 43);
		frame.getContentPane().add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn_3.getText();
				textField.setText(num);
			}
		});
		btn_3.setForeground(Color.BLACK);
		btn_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_3.setBackground(Color.GREEN);
		btn_3.setBounds(152, 259, 61, 43);
		frame.getContentPane().add(btn_3);
		
		JButton btn_pos = new JButton("+");
		btn_pos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				lb1.setText(null);
				s1="";
				s1+=textField.getText();
				operation="+";	
				s1+=operation;
				lb1.setText(s1);
				textField.setText("");
				
			}
		});
		btn_pos.setForeground(Color.BLACK);
		btn_pos.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_pos.setBackground(Color.CYAN);
		btn_pos.setBounds(223, 259, 61, 43);
		frame.getContentPane().add(btn_pos);
		
		JButton btn_chng = new JButton("SC");
		btn_chng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText("Welcome");
				
			}
		});
		btn_chng.setForeground(Color.BLACK);
		btn_chng.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_chng.setBackground(Color.CYAN);
		btn_chng.setBounds(10, 312, 61, 43);
		frame.getContentPane().add(btn_chng);
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn_0.getText();
				textField.setText(num);
			}
		});
		btn_0.setForeground(Color.BLACK);
		btn_0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_0.setBackground(Color.GREEN);
		btn_0.setBounds(81, 312, 61, 43);
		frame.getContentPane().add(btn_0);
		
		JButton btn_dec = new JButton(".");
		btn_dec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn_dec.getText();
				textField.setText(num);
			}
		});
		btn_dec.setForeground(Color.BLACK);
		btn_dec.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_dec.setBackground(Color.CYAN);
		btn_dec.setBounds(152, 312, 61, 43);
		frame.getContentPane().add(btn_dec);
		
		JButton btn_equal = new JButton("=");
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String answer;
				second=Double.parseDouble(textField.getText());
				s1+=textField.getText();
				lb1.setText(s1);
				s1="";
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				if(operation=="%")
				{
					result=(first/second)*100;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				first=null;
				second=null;
			}
		});
		btn_equal.setForeground(Color.BLACK);
		btn_equal.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_equal.setBackground(Color.CYAN);
		btn_equal.setBounds(223, 312, 61, 43);
		frame.getContentPane().add(btn_equal);
		
		
	}
}

