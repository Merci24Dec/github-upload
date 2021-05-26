		import java.awt.EventQueue;

		import javax.swing.JFrame;
		import javax.swing.JTextField;
		import javax.swing.JButton;
		import java.awt.Font;
		import java.awt.event.ActionListener;
		import java.awt.event.ActionEvent;
		import javax.swing.JLabel;
        import java.awt.Color;
        import java.awt.SystemColor;

		public class Calculator {

			private JFrame frmCaculator;
			private JTextField textField;
			
			double first;
			double second;
			double result;
			String operation;
			String answer;

			/**
			 * Launch the application.
			 */
			public static void main(String[] args) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Calculator window = new Calculator();
							window.frmCaculator.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}

			/**
			 * Create the application.
			 */
			public Calculator() {
				initialize();
			}

			/**
			 * Initialize the contents of the frame.
			 */
			private void initialize() {
				frmCaculator = new JFrame();
				frmCaculator.setTitle("Caculator");
				frmCaculator.getContentPane().setBackground(SystemColor.info);
				frmCaculator.setBounds(100, 100, 349, 580);
				frmCaculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frmCaculator.getContentPane().setLayout(null);
				
				JLabel label1 = new JLabel("");
				label1.setBackground(SystemColor.activeCaption);
				label1.setFont(new Font("Tahoma", Font.BOLD, 18));
				label1.setBounds(10, 417, 316, 53);
				frmCaculator.getContentPane().add(label1);
				
				JLabel label2 = new JLabel("");
				label2.setBackground(SystemColor.activeCaptionBorder);
				label2.setFont(new Font("Tahoma", Font.BOLD, 18));
				label2.setBounds(10, 480, 316, 53);
				frmCaculator.getContentPane().add(label2);
				
				textField = new JTextField();
				textField.setForeground(Color.BLUE);
				textField.setBackground(new Color(224, 255, 255));
				textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
				textField.setBounds(10, 10, 316, 68);
				frmCaculator.getContentPane().add(textField);
				textField.setColumns(10);
				
				JButton btn_ac = new JButton("C");
				btn_ac.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						textField.setText(null);
						label1.setText(null);
						label2.setText(null);
					}
				});
				btn_ac.setBackground(Color.RED);
				btn_ac.setForeground(Color.BLACK);
				btn_ac.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn_ac.setBounds(10, 100, 72, 53);
				frmCaculator.getContentPane().add(btn_ac);
				
				JButton btn_b = new JButton("\uF0E7");
				btn_b.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						String backspace=null;
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
				btn_b.setFont(new Font("Wingdings", Font.BOLD, 20));
				btn_b.setBackground(Color.RED);
				btn_b.setBounds(172, 100, 72, 53);
				frmCaculator.getContentPane().add(btn_b);
				
				JButton btn_percent = new JButton("%");
				btn_percent.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						first=Double.parseDouble(textField.getText());
						operation="%";
						textField.setText("");
						label1.setText("First number:"+first);
						label2.setText("Operator: "+operation);
					}
				});
				btn_percent.setForeground(Color.BLACK);
				btn_percent.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn_percent.setBackground(Color.CYAN);
				btn_percent.setBounds(92, 100, 72, 53);
				frmCaculator.getContentPane().add(btn_percent);
				
				JButton btn_div = new JButton("/");
				btn_div.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						first=Double.parseDouble(textField.getText());
						textField.setText("");
						operation="/";
						label1.setText("First number:"+first);
						label2.setText("Operator: "+operation);
					}
				});
				btn_div.setForeground(Color.BLACK);
				btn_div.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn_div.setBackground(Color.CYAN);
				btn_div.setBounds(254, 289, 72, 53);
				frmCaculator.getContentPane().add(btn_div);
				
				JButton btn_7 = new JButton("7");
				btn_7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String num=textField.getText()+btn_7.getText();
						textField.setText(num);
					}
				});
				btn_7.setForeground(Color.BLACK);
				btn_7.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn_7.setBackground(SystemColor.activeCaption);
				btn_7.setBounds(10, 163, 72, 53);
				frmCaculator.getContentPane().add(btn_7);
				
				JButton btn_8 = new JButton("8");
				btn_8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String num=textField.getText()+btn_8.getText();
						textField.setText(num);
					}
				});
				btn_8.setForeground(Color.BLACK);
				btn_8.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn_8.setBackground(SystemColor.activeCaption);
				btn_8.setBounds(92, 163, 72, 53);
				frmCaculator.getContentPane().add(btn_8);
				
				JButton btn_9 = new JButton("9");
				btn_9.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String num=textField.getText()+btn_9.getText();
						textField.setText(num);
					}
				});
				btn_9.setForeground(Color.BLACK);
				btn_9.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn_9.setBackground(SystemColor.activeCaption);
				btn_9.setBounds(172, 163, 72, 53);
				frmCaculator.getContentPane().add(btn_9);
				
				JButton btn_mul = new JButton("*");
				btn_mul.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						first=Double.parseDouble(textField.getText());
						textField.setText("");
						operation="*";
						label1.setText("First number:"+first);
						label2.setText("Operator: "+operation);
					}
				});
				btn_mul.setForeground(Color.BLACK);
				btn_mul.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn_mul.setBackground(Color.CYAN);
				btn_mul.setBounds(254, 226, 72, 53);
				frmCaculator.getContentPane().add(btn_mul);
				
				JButton btn_4 = new JButton("4");
				btn_4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String num=textField.getText()+btn_4.getText();
						textField.setText(num);
					}
				});
				btn_4.setForeground(Color.BLACK);
				btn_4.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn_4.setBackground(SystemColor.activeCaption);
				btn_4.setBounds(10, 226, 72, 53);
				frmCaculator.getContentPane().add(btn_4);
				
				JButton btn_5 = new JButton("5");
				btn_5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String num=textField.getText()+btn_5.getText();
						textField.setText(num);
					}
				});
				btn_5.setForeground(Color.BLACK);
				btn_5.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn_5.setBackground(SystemColor.activeCaption);
				btn_5.setBounds(92, 226, 72, 53);
				frmCaculator.getContentPane().add(btn_5);
				
				JButton btn_6 = new JButton("6");
				btn_6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String num=textField.getText()+btn_6.getText();
						textField.setText(num);
					}
				});
				btn_6.setForeground(Color.BLACK);
				btn_6.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn_6.setBackground(SystemColor.activeCaption);
				btn_6.setBounds(172, 226, 72, 53);
				frmCaculator.getContentPane().add(btn_6);
				
				JButton btn_neg = new JButton("-");
				btn_neg.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						first=Double.parseDouble(textField.getText());
						textField.setText("");
						operation="-";
						label1.setText("First number:"+first);
						label2.setText("Operator: "+operation);
					}
				});
				btn_neg.setForeground(Color.BLACK);
				btn_neg.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn_neg.setBackground(Color.CYAN);
				btn_neg.setBounds(254, 163, 72, 53);
				frmCaculator.getContentPane().add(btn_neg);
				
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
				btn_1.setBackground(SystemColor.activeCaption);
				btn_1.setBounds(10, 289, 72, 53);
				frmCaculator.getContentPane().add(btn_1);
				
				JButton btn_2 = new JButton("2");
				btn_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String num=textField.getText()+btn_2.getText();
						textField.setText(num);
					}
				});
				btn_2.setForeground(Color.BLACK);
				btn_2.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn_2.setBackground(SystemColor.activeCaption);
				btn_2.setBounds(92, 289, 72, 53);
				frmCaculator.getContentPane().add(btn_2);
				
				JButton btn_3 = new JButton("3");
				btn_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String num=textField.getText()+btn_3.getText();
						textField.setText(num);
					}
				});
				btn_3.setForeground(Color.BLACK);
				btn_3.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn_3.setBackground(SystemColor.activeCaption);
				btn_3.setBounds(172, 289, 72, 53);
				frmCaculator.getContentPane().add(btn_3);
				
				JButton btn_pos = new JButton("+");
				btn_pos.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						first=Double.parseDouble(textField.getText());
						textField.setText("");
						operation="+";
						label1.setText("First number:"+first);
						label2.setText("Operator: "+operation);
					}
				});
				btn_pos.setForeground(Color.BLACK);
				btn_pos.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn_pos.setBackground(Color.CYAN);
				btn_pos.setBounds(254, 100, 72, 53);
				frmCaculator.getContentPane().add(btn_pos);
				
				JButton btn_chng = new JButton("00");
				btn_chng.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String number= textField.getText()+btn_chng.getText();
						textField.setText(number);
					}
				});
				btn_chng.setForeground(SystemColor.textHighlightText);
				btn_chng.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn_chng.setBackground(new Color(0, 51, 51));
				btn_chng.setBounds(10, 354, 72, 53);
				frmCaculator.getContentPane().add(btn_chng);
				
				JButton btn_0 = new JButton("0");
				btn_0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String num=textField.getText()+btn_0.getText();
						textField.setText(num);
					}
				});
				btn_0.setForeground(Color.BLACK);
				btn_0.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn_0.setBackground(SystemColor.activeCaption);
				btn_0.setBounds(92, 354, 72, 53);
				frmCaculator.getContentPane().add(btn_0);
				
				JButton btn_dec = new JButton(".");
				btn_dec.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String num=textField.getText()+btn_dec.getText();
						textField.setText(num);
					}
				});
				btn_dec.setForeground(SystemColor.textHighlightText);
				btn_dec.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn_dec.setBackground(new Color(0, 51, 51));
				btn_dec.setBounds(172, 354, 72, 53);
				frmCaculator.getContentPane().add(btn_dec);
				
				JButton btn_equal = new JButton("=");
				btn_equal.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String answer;
						second= Double.parseDouble(textField.getText());

						if(operation == "+")
						{
							label1.setText(null);
							label2.setText(null);
							result= first+second;
							answer= String.format("%.1f",result);
							textField.setText(first+" + "+second+" = "+answer);
						}
						else if(operation == "-")
						{
							label1.setText(null);
							label2.setText(null);
							result= first-second;
							answer= String.format("%.1f",result);
							textField.setText(first+" - "+second+" = "+answer);
						}
						else if(operation == "*")
						{
							label1.setText(null);
							label2.setText(null);
							result= first*second;
							answer= String.format("%.1f",result);
							textField.setText(first+" * "+second+" = "+answer);
						}
						else if(operation == "/")
						{
							label1.setText(null);
							label2.setText(null);
							result= first/second;
							answer= String.format("%.1f",result);
							textField.setText(first+" / "+second+" = "+answer);
						}
						else if(operation == "%")
						{
							label1.setText(null);
							label2.setText(null);
							result= first%second; 
							answer= String.format("%.1f",result);
							textField.setText(first+" % "+second+" = "+answer);
						}
					}
				});				
				btn_equal.setForeground(Color.WHITE);
				btn_equal.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn_equal.setBackground(SystemColor.desktop);
				btn_equal.setBounds(254, 352, 72, 53);
				frmCaculator.getContentPane().add(btn_equal);
			}
		}
