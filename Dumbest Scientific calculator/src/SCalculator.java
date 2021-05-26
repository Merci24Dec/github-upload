import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JPanel;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Window.Type;
import javax.swing.border.TitledBorder;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

public class SCalculator {

	private JFrame frmDumbestCalculator;
	private JTextField textField1;
	
	String s1=new String();
	double memory = 0;
	Double first, second, result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JMenuItem standard_mitem;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SCalculator window = new SCalculator();
					window.frmDumbestCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("deprecation")
	private void initialize() {
		frmDumbestCalculator = new JFrame();
		frmDumbestCalculator.getContentPane().setForeground(SystemColor.textHighlight);
		frmDumbestCalculator.setResizable(false);
		frmDumbestCalculator.setType(Type.POPUP);
		frmDumbestCalculator.setTitle("Dumbest Calculator");
		frmDumbestCalculator.getContentPane().setFont(new Font("SansSerif", Font.BOLD, 14));
		frmDumbestCalculator.getContentPane().setBackground(UIManager.getColor("nimbusFocus"));
		frmDumbestCalculator.setBounds(100, 100, 372, 472);
		frmDumbestCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDumbestCalculator.getContentPane().setLayout(null);
		
		JLabel lb1 = new JLabel("");
		lb1.setEnabled(false);
		lb1.setHorizontalAlignment(SwingConstants.RIGHT);
		lb1.setFont(new Font("SansSerif", Font.BOLD, 18));
		lb1.setBackground(new Color(224, 255, 255));
		lb1.setBounds(10, 60, 336, 45);
		frmDumbestCalculator.getContentPane().add(lb1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(UIManager.getColor("nimbusInfoBlue"));
		menuBar.setEnabled(false);
		menuBar.setToolTipText("");
		frmDumbestCalculator.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		mnNewMenu.setMnemonic(KeyEvent.VK_F);
		mnNewMenu.setEnabled(false);
		mnNewMenu.setFont(new Font("Dialog", Font.BOLD, 13));
		menuBar.add(mnNewMenu);
		
		standard_mitem = new JMenuItem("Standard");
		standard_mitem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		standard_mitem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frmDumbestCalculator.setTitle("Dumbest Calculator");
				frmDumbestCalculator.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
				frmDumbestCalculator.getContentPane().setBackground(UIManager.getColor("nimbusFocus"));
				frmDumbestCalculator.setBounds(100, 100, 372, 472);
				textField1.setBounds(10, 6, 336, 50);
				lb1.setBounds(10, 60, 336, 45);
				
				
				
			}
		});
		mnNewMenu.add(standard_mitem);
		
		JMenuItem exitapp = new JMenuItem("Exit");
		exitapp.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_MASK));
		exitapp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);
				
			}
		});
		
		JMenuItem Scientific_mitem = new JMenuItem("Scientific");
		Scientific_mitem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.SHIFT_MASK));
		Scientific_mitem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frmDumbestCalculator.setTitle("Dumbest Calculator");
				frmDumbestCalculator.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
				frmDumbestCalculator.getContentPane().setBackground(UIManager.getColor("nimbusFocus"));
				frmDumbestCalculator.setBounds(100, 100, 1245, 610);
				textField1.setBounds(10, 6, 784, 50);
				lb1.setBounds(10, 60, 784, 45);
			
				
			}
		});
		mnNewMenu.add(Scientific_mitem);
		mnNewMenu.add(exitapp);

		
		textField1 = new JTextField();
		textField1.setEditable(false);
		textField1.setText("Welcome to Dumbest Calculator v1.0 ");
		textField1.setFont(new Font("SansSerif", Font.PLAIN, 18));
		textField1.setEnabled(false);
		textField1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField1.setBackground(new Color(224, 255, 255));
		textField1.setBounds(10, 6, 336, 50);
		frmDumbestCalculator.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JButton btn_MC = new JButton("MC");
		btn_MC.setEnabled(false);
		btn_MC.setForeground(SystemColor.textHighlight);
		btn_MC.setBackground(SystemColor.text);
		btn_MC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
		          memory = 0;
		          textField1.setText("0");
		          textField1.setText("");
  
			}
		});
		btn_MC.setFont(new Font("Segoe UI Symbol", Font.BOLD, 10));
		btn_MC.setBounds(128, 106, 55, 40);
		frmDumbestCalculator.getContentPane().add(btn_MC);
		
		JButton btn_MR = new JButton("MR");
		btn_MR.setEnabled(false);
		btn_MR.setForeground(SystemColor.textHighlight);
		btn_MR.setBackground(SystemColor.text);
		btn_MR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
		          String str=String.valueOf(memory);
		          textField1.setText(str);
				
			}
		});
		btn_MR.setFont(new Font("Segoe UI Symbol", Font.BOLD, 10));
		btn_MR.setBounds(182, 106, 55, 40);
		frmDumbestCalculator.getContentPane().add(btn_MR);
		
		JButton btn_MS = new JButton("MS");
		btn_MS.setEnabled(false);
		btn_MS.setForeground(SystemColor.textHighlight);
		btn_MS.setBackground(SystemColor.text);
		btn_MS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
		          memory=Double.parseDouble(textField1.getText());
		          String str=String.valueOf(memory);
		          textField1.setText(str);
				
			}
		});
		btn_MS.setFont(new Font("Segoe UI Symbol", Font.BOLD, 10));
		btn_MS.setBounds(236, 106, 55, 40);
		frmDumbestCalculator.getContentPane().add(btn_MS);
		
		JButton btn_MPLS = new JButton("M+");
		btn_MPLS.setEnabled(false);
		btn_MPLS.setForeground(SystemColor.textHighlight);
		btn_MPLS.setBackground(SystemColor.text);
		btn_MPLS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				memory = memory + Double.parseDouble(textField1.getText());
				
			}
		});
		btn_MPLS.setFont(new Font("Segoe UI Symbol", Font.BOLD, 9));
		btn_MPLS.setBounds(290, 106, 55, 40);
		frmDumbestCalculator.getContentPane().add(btn_MPLS);
		
		
		JButton btn_pow = new JButton("xⁿ");
		btn_pow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				first=Double.parseDouble(textField1.getText());
				operation="xⁿ";
				lb1.setText(null);
				s1="";
				s1+=textField1.getText();	
				s1+= " ^ ";
				lb1.setText(s1);
				textField1.setText("");
				
			}
		});
		btn_pow.setForeground(SystemColor.textHighlight);
		btn_pow.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		btn_pow.setBackground(new Color(255, 255, 255));
		btn_pow.setBounds(490, 445, 60, 45);
		frmDumbestCalculator.getContentPane().add(btn_pow);
		
		JButton btn_cbrt = new JButton("x³");
		btn_cbrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = (Double.parseDouble(textField1.getText()));
				a = a * a * a;
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_cbrt.setForeground(SystemColor.textHighlight);
		btn_cbrt.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		btn_cbrt.setBackground(new Color(255, 255, 255));
		btn_cbrt.setBounds(370, 445, 60, 45);
		frmDumbestCalculator.getContentPane().add(btn_cbrt);
		
		JButton btn_pow2 = new JButton("x²");
		btn_pow2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = (Double.parseDouble(textField1.getText()));
				a = a * a;
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_pow2.setForeground(SystemColor.textHighlight);
		btn_pow2.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		btn_pow2.setBackground(new Color(255, 255, 255));
		btn_pow2.setBounds(430, 445, 60, 45);
		frmDumbestCalculator.getContentPane().add(btn_pow2);
		
		JButton btn_rt = new JButton("√");
		btn_rt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Double.parseDouble(String.valueOf(textField1.getText()));
				a = Math.sqrt(a);
				textField1.setText(String.valueOf(a));
				
			}
		});
		btn_rt.setForeground(SystemColor.textHighlight);
		btn_rt.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		btn_rt.setBackground(new Color(255, 255, 255));
		btn_rt.setBounds(670, 445, 60, 45);
		frmDumbestCalculator.getContentPane().add(btn_rt);
		
		JButton btn_rt3 = new JButton("∛");
		btn_rt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Double.parseDouble(String.valueOf(textField1.getText()));
				a = Math.cbrt(a);
				textField1.setText(String.valueOf(a));
				
				
			}
		});
		btn_rt3.setForeground(SystemColor.textHighlight);
		btn_rt3.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		btn_rt3.setBackground(new Color(255, 255, 255));
		btn_rt3.setBounds(610, 445, 60, 45);
		frmDumbestCalculator.getContentPane().add(btn_rt3);
		
		JButton btn_fact = new JButton("n!");
		btn_fact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			    double a =(Double.parseDouble(textField1.getText()));
			    double f=1;
			    while(a!=0)
			    {
			     f=f*a;
			     a--;
			    }
				textField1.setText("");
				textField1.setText(textField1.getText()+f);
				
			}
		});
		btn_fact.setForeground(SystemColor.textHighlight);
		btn_fact.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		btn_fact.setBackground(new Color(255, 255, 255));
		btn_fact.setBounds(700, 490, 60, 45);
		frmDumbestCalculator.getContentPane().add(btn_fact);
		
		JButton btn_ln = new JButton("ln");
		btn_ln.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.log(Double.parseDouble(textField1.getText()));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_ln.setForeground(SystemColor.textHighlight);
		btn_ln.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		btn_ln.setBackground(new Color(255, 255, 255));
		btn_ln.setBounds(400, 490, 60, 45);
		frmDumbestCalculator.getContentPane().add(btn_ln);
		
		JButton btn_log = new JButton("log");
		btn_log.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		btn_log.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.log10(Double.parseDouble(textField1.getText()));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_log.setForeground(SystemColor.textHighlight);
		btn_log.setBackground(new Color(255, 255, 255));
		btn_log.setBounds(460, 490, 60, 45);
		frmDumbestCalculator.getContentPane().add(btn_log);
		
		JButton btn_pow_n = new JButton("2ⁿ");
		btn_pow_n.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.pow(2 , Double.parseDouble(textField1.getText()));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_pow_n.setForeground(SystemColor.textHighlight);
		btn_pow_n.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		btn_pow_n.setBackground(new Color(255, 255, 255));
		btn_pow_n.setBounds(520, 490, 60, 45);
		frmDumbestCalculator.getContentPane().add(btn_pow_n);
		
		JButton btn_10 = new JButton("10ⁿ");
		btn_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.pow(10 , Double.parseDouble(textField1.getText()));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_10.setForeground(SystemColor.textHighlight);
		btn_10.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		btn_10.setBackground(new Color(255, 255, 255));
		btn_10.setBounds(580, 490, 60, 45);
		frmDumbestCalculator.getContentPane().add(btn_10);
		
		JButton btn_nth_root = new JButton("ⁿ√");
		btn_nth_root.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				first=Double.parseDouble(textField1.getText());
				operation="ⁿ√";
				lb1.setText(null);
				s1="";
				s1+=textField1.getText();	
				s1+="√";
				lb1.setText(s1);
				textField1.setText("");
				
			}
		});
		btn_nth_root.setForeground(SystemColor.textHighlight);
		btn_nth_root.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		btn_nth_root.setBackground(new Color(255, 255, 255));
		btn_nth_root.setBounds(730, 445, 60, 45);
		frmDumbestCalculator.getContentPane().add(btn_nth_root);
		
		JButton btn_abs = new JButton("|x|");
		btn_abs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Double.parseDouble(String.valueOf(textField1.getText()));
				a = Math.abs(a);
				textField1.setText(String.valueOf(a));
				
			}
		});
		btn_abs.setForeground(SystemColor.textHighlight);
		btn_abs.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		btn_abs.setBackground(new Color(255, 255, 255));
		btn_abs.setBounds(640, 490, 60, 45);
		frmDumbestCalculator.getContentPane().add(btn_abs);
		
		JButton btn_ac = new JButton("AC");
		btn_ac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField1.setText(null);
				lb1.setText(null);
				
			}
		});
		btn_ac.setForeground(new Color(255, 255, 255));
		btn_ac.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		btn_ac.setEnabled(false);
		btn_ac.setBackground(new Color(255, 0, 0));
		btn_ac.setBounds(10, 160, 64, 55);
		frmDumbestCalculator.getContentPane().add(btn_ac);
		
		JButton btn_pcnt = new JButton("%");
		btn_pcnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Double.parseDouble(textField1.getText());
				a = a/100;
				textField1.setText(String.valueOf(a));
			}
		});
		btn_pcnt.setForeground(Color.WHITE);
		btn_pcnt.setFont(new Font("Segoe UI Symbol", Font.BOLD, 25));
		btn_pcnt.setEnabled(false);
		btn_pcnt.setBackground(SystemColor.textHighlight);
		btn_pcnt.setBounds(146, 160, 64, 55);
		frmDumbestCalculator.getContentPane().add(btn_pcnt);
		
		JButton btn_c = new JButton("⌫");
		btn_c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String backspace=null;
				lb1.setText(null);
				if(textField1.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField1.getText());
					str.deleteCharAt(textField1.getText().length()-1);
					backspace=str.toString();
					textField1.setText(backspace);
				}
				
			}
		});
		btn_c.setForeground(new Color(255, 255, 255));
		btn_c.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		btn_c.setEnabled(false);
		btn_c.setBackground(new Color(255, 0, 0));
		btn_c.setBounds(78, 160, 64, 55);
		frmDumbestCalculator.getContentPane().add(btn_c);
		
		JButton btn_add = new JButton("+");
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				first=Double.parseDouble(textField1.getText());
				operation=" + ";
				lb1.setText(null);
				s1="";
				s1+=textField1.getText();	
				s1+=operation;
				lb1.setText(s1);
				textField1.setText("");
				
			}
		});
		btn_add.setForeground(Color.WHITE);
		btn_add.setFont(new Font("Segoe UI Symbol", Font.BOLD, 25));
		btn_add.setEnabled(false);
		btn_add.setBackground(SystemColor.textHighlight);
		btn_add.setBounds(214, 160, 64, 55);
		frmDumbestCalculator.getContentPane().add(btn_add);
		
		JButton btn_pos_neg = new JButton("+/-");
		btn_pos_neg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a=Double.parseDouble(String.valueOf(textField1.getText()));
				a=a*(-1);
				textField1.setText(String.valueOf(a));
				
			}
		});
		btn_pos_neg.setForeground(SystemColor.textHighlightText);
		btn_pos_neg.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		btn_pos_neg.setEnabled(false);
		btn_pos_neg.setBackground(SystemColor.textHighlight);
		btn_pos_neg.setBounds(282, 160, 64, 55);
		frmDumbestCalculator.getContentPane().add(btn_pos_neg);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String num=textField1.getText()+btn_7.getText();
				textField1.setText(num);
				
			}
		});
		btn_7.setForeground(SystemColor.textHighlight);
		btn_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_7.setEnabled(false);
		btn_7.setBackground(SystemColor.textHighlightText);
		btn_7.setBounds(10, 219, 64, 55);
		frmDumbestCalculator.getContentPane().add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String num=textField1.getText()+btn_8.getText();
				textField1.setText(num);
				
			}
		});
		btn_8.setForeground(SystemColor.textHighlight);
		btn_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_8.setEnabled(false);
		btn_8.setBackground(SystemColor.textHighlightText);
		btn_8.setBounds(78, 219, 64, 55);
		frmDumbestCalculator.getContentPane().add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.setMnemonic(KeyEvent.VK_NUMPAD9);
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String num=textField1.getText()+btn_9.getText();
				textField1.setText(num);
				
			}
		});
		btn_9.setForeground(SystemColor.textHighlight);
		btn_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_9.setEnabled(false);
		btn_9.setBackground(SystemColor.textHighlightText);
		btn_9.setBounds(146, 219, 64, 55);
		frmDumbestCalculator.getContentPane().add(btn_9);
		
		JButton btn_mul = new JButton("×");
		btn_mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				first=Double.parseDouble(textField1.getText());
				operation=" × ";
				lb1.setText(null);
				s1="";
				s1+=textField1.getText();	
				s1+=operation;
				lb1.setText(s1);
				textField1.setText("");

				
			}
		});
		btn_mul.setForeground(Color.WHITE);
		btn_mul.setFont(new Font("Segoe UI Symbol", Font.BOLD, 25));
		btn_mul.setEnabled(false);
		btn_mul.setBackground(SystemColor.textHighlight);
		btn_mul.setBounds(214, 219, 64, 55);
		frmDumbestCalculator.getContentPane().add(btn_mul);
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String num=textField1.getText()+btn_0.getText();
				textField1.setText(num);
				
			}
		});
		btn_0.setForeground(SystemColor.textHighlight);
		btn_0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_0.setEnabled(false);
		btn_0.setBackground(SystemColor.text);
		btn_0.setBounds(282, 219, 64, 55);
		frmDumbestCalculator.getContentPane().add(btn_0);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String num=textField1.getText()+btn_4.getText();
				textField1.setText(num);
				
			}
		});
		btn_4.setForeground(SystemColor.textHighlight);
		btn_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_4.setEnabled(false);
		btn_4.setBackground(SystemColor.textHighlightText);
		btn_4.setBounds(10, 279, 64, 55);
		frmDumbestCalculator.getContentPane().add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String num=textField1.getText()+btn_5.getText();
				textField1.setText(num);
				
			}
		});
		btn_5.setForeground(SystemColor.textHighlight);
		btn_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_5.setEnabled(false);
		btn_5.setBackground(SystemColor.textHighlightText);
		btn_5.setBounds(78, 279, 64, 55);
		frmDumbestCalculator.getContentPane().add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String num=textField1.getText()+btn_6.getText();
				textField1.setText(num);
				
			}
		});
		btn_6.setForeground(SystemColor.textHighlight);
		btn_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_6.setEnabled(false);
		btn_6.setBackground(SystemColor.textHighlightText);
		btn_6.setBounds(146, 279, 64, 55);
		frmDumbestCalculator.getContentPane().add(btn_6);
		
		JButton btn_sub = new JButton("-");
		btn_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				first=Double.parseDouble(textField1.getText());
				operation=" - ";
				lb1.setText(null);
				s1="";
				s1+=textField1.getText();	
				s1+=operation;
				lb1.setText(s1);
				textField1.setText("");

				
			}
		});
		btn_sub.setForeground(Color.WHITE);
		btn_sub.setFont(new Font("Segoe UI Symbol", Font.BOLD, 35));
		btn_sub.setEnabled(false);
		btn_sub.setBackground(SystemColor.textHighlight);
		btn_sub.setBounds(214, 279, 64, 55);
		frmDumbestCalculator.getContentPane().add(btn_sub);
		
		JButton btn_dot = new JButton(".");
		btn_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String number=textField1.getText()+btn_dot.getText();
				textField1.setText(number);
				
			}
		});
		btn_dot.setForeground(SystemColor.textHighlight);
		btn_dot.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn_dot.setEnabled(false);
		btn_dot.setBackground(SystemColor.text);
		btn_dot.setBounds(282, 279, 64, 55);
		frmDumbestCalculator.getContentPane().add(btn_dot);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String num=textField1.getText()+btn_1.getText();
				textField1.setText(num);
				
			}
		});
		btn_1.setForeground(SystemColor.textHighlight);
		btn_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_1.setEnabled(false);
		btn_1.setBackground(SystemColor.textHighlightText);
		btn_1.setBounds(10, 338, 64, 55);
		frmDumbestCalculator.getContentPane().add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String num=textField1.getText()+btn_2.getText();
				textField1.setText(num);
				
			}
		});
		btn_2.setForeground(SystemColor.textHighlight);
		btn_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_2.setEnabled(false);
		btn_2.setBackground(SystemColor.textHighlightText);
		btn_2.setBounds(78, 338, 64, 55);
		frmDumbestCalculator.getContentPane().add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String num=textField1.getText()+btn_3.getText();
				textField1.setText(num);
				
			}
		});
		btn_3.setForeground(SystemColor.textHighlight);
		btn_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_3.setEnabled(false);
		btn_3.setBackground(SystemColor.textHighlightText);
		btn_3.setBounds(146, 338, 64, 55);
		frmDumbestCalculator.getContentPane().add(btn_3);
		
		JButton btn_div = new JButton("÷");
		btn_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				first=Double.parseDouble(textField1.getText());
				operation=" ÷ ";
				lb1.setText(null);
				s1="";
				s1+=textField1.getText();	
				s1+=operation;
				lb1.setText(s1);
				textField1.setText("");
				
			}
		});
		btn_div.setForeground(Color.WHITE);
		btn_div.setFont(new Font("Segoe UI Symbol", Font.BOLD, 25));
		btn_div.setEnabled(false);
		btn_div.setBackground(SystemColor.textHighlight);
		btn_div.setBounds(214, 338, 64, 55);
		frmDumbestCalculator.getContentPane().add(btn_div);
		
		JButton btn_equal = new JButton("=");
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String answer;
				second=Double.parseDouble(textField1.getText());
				s1+=textField1.getText();
				lb1.setText(s1);
				s1="";
				if(operation==" + ")
				{
					result=first+second;
					answer=String.format("%.2f", result);
					textField1.setText(answer);
					
				}
				else if(operation==" - ")
				{
					result=first-second;
					answer=String.format("%.2f", result);
					textField1.setText(answer);
				}
				else if(operation==" × ")
				{
					result=first*second;
					answer=String.format("%.2f", result);
					textField1.setText(answer);
				}
				else if(operation==" ÷ ")
				{
					result=first/second;
					answer=String.format("%.2f", result);
					textField1.setText(answer);
				}
				else if(operation==" mod ")
				{
					result=first%second;
					answer=String.format("%.2f", result);
					textField1.setText(answer);
				}
				else if(operation=="xⁿ")
				{
					double resultt=1;
					for(int i=0;i<second;i++)
					{
						resultt=Math.pow(first, second);
						answer=String.format("%.16f", resultt);
						textField1.setText(answer);
					}
				}
				else if(operation=="ⁿ√")
				{
					double resultt=1;
					for(int i=0;i<second;i++)
					{
						resultt=Math.pow(Math.E, Math.log(first)/second);
						answer=String.format("%.16f", resultt);
						textField1.setText(answer);

					}
				}

				first=null;
				second=null;

			}
		});
		btn_equal.setForeground(SystemColor.textHighlight);
		btn_equal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_equal.setEnabled(false);
		btn_equal.setBackground(SystemColor.textHighlightText);
		btn_equal.setBounds(282, 338, 64, 55);
		frmDumbestCalculator.getContentPane().add(btn_equal);
		
		JButton btn_pi = new JButton("π");
		btn_pi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = (3.1415926535897932384626433832795);
				textField1.setText(String.valueOf(a));
				
			}
		});
		btn_pi.setForeground(SystemColor.textHighlight);
		btn_pi.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		btn_pi.setBackground(new Color(255, 255, 255));
		btn_pi.setBounds(10, 445, 70, 45);
		frmDumbestCalculator.getContentPane().add(btn_pi);
		
		JButton btn_exp = new JButton("e^x");
		btn_exp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.exp(Double.parseDouble(textField1.getText()));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_exp.setForeground(SystemColor.textHighlight);
		btn_exp.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		btn_exp.setBackground(new Color(255, 255, 255));
		btn_exp.setBounds(80, 445, 70, 45);
		frmDumbestCalculator.getContentPane().add(btn_exp);
		
		JButton btn_e = new JButton("e");
		btn_e.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.E;
				textField1.setText(String.valueOf(a));
				
			}
		});
		btn_e.setForeground(SystemColor.textHighlight);
		btn_e.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		btn_e.setBackground(new Color(255, 255, 255));
		btn_e.setBounds(150, 445, 70, 45);
		frmDumbestCalculator.getContentPane().add(btn_e);
		
		JButton btn_mod = new JButton("mod");
		btn_mod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				first=Double.parseDouble(textField1.getText());
				operation=" mod ";
				lb1.setText(null);
				s1="";
				s1+=textField1.getText();	
				s1+=operation;
				lb1.setText(s1);
				textField1.setText("");
				
			}
		});
		btn_mod.setForeground(SystemColor.textHighlight);
		btn_mod.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		btn_mod.setBackground(new Color(255, 255, 255));
		btn_mod.setBounds(220, 445, 70, 45);
		frmDumbestCalculator.getContentPane().add(btn_mod);
		
		JButton btn_x = new JButton("1/x");
		btn_x.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = 1/(Double.parseDouble(textField1.getText()));
				textField1.setText(String.valueOf(a));
				
			}
		});
		btn_x.setForeground(SystemColor.textHighlight);
		btn_x.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		btn_x.setBackground(new Color(255, 255, 255));
		btn_x.setBounds(290, 445, 70, 45);
		frmDumbestCalculator.getContentPane().add(btn_x);
		
		JButton btn_Round = new JButton("Round");
		btn_Round.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Double.parseDouble(String.valueOf(textField1.getText()));
				a = Math.round(a);
				textField1.setText(String.valueOf(a));
				
			}
		});
		btn_Round.setForeground(SystemColor.textHighlight);
		btn_Round.setBackground(new Color(255, 255, 255));
		btn_Round.setFont(new Font("Segoe UI Symbol", Font.BOLD, 10));
		btn_Round.setBounds(80, 490, 70, 45);
		frmDumbestCalculator.getContentPane().add(btn_Round);
		
		JButton btn_2pi = new JButton("2*π");
		btn_2pi.setBackground(new Color(255, 255, 255));
		btn_2pi.setForeground(SystemColor.textHighlight);
		btn_2pi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = (3.1415926535897932384626433832795)*2;
				textField1.setText(String.valueOf(a));
				
			}
		});
		btn_2pi.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		btn_2pi.setBounds(10, 490, 70, 45);
		frmDumbestCalculator.getContentPane().add(btn_2pi);
		
		JButton btn_bin = new JButton("Bin");
		btn_bin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int a = Integer.parseInt(textField1.getText());
				textField1.setText(Integer.toString(a,2));
				
			}
		});
		btn_bin.setForeground(SystemColor.textHighlight);
		btn_bin.setBackground(new Color(255, 255, 255));
		btn_bin.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		btn_bin.setBounds(150, 490, 70, 45);
		frmDumbestCalculator.getContentPane().add(btn_bin);
		
		JButton btn_octal = new JButton("Oct");
		btn_octal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int a = Integer.parseInt(textField1.getText());
				textField1.setText(Integer.toString(a,8));
				
			}
		});
		btn_octal.setBackground(new Color(255, 255, 255));
		btn_octal.setForeground(SystemColor.textHighlight);
		btn_octal.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		btn_octal.setBounds(220, 490, 70, 45);
		frmDumbestCalculator.getContentPane().add(btn_octal);
		
		JButton btn_hex = new JButton("Hex");
		btn_hex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int a = Integer.parseInt(textField1.getText());
				textField1.setText(Integer.toString(a,16));
				
			}
		});
		btn_hex.setForeground(SystemColor.textHighlight);
		btn_hex.setBackground(new Color(255, 255, 255));
		btn_hex.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		btn_hex.setBounds(290, 490, 70, 45);
		frmDumbestCalculator.getContentPane().add(btn_hex);
				
		
		
		JRadioButton rdbtn_ON = new JRadioButton("ON");
		rdbtn_ON.setForeground(Color.RED);
		rdbtn_ON.setMnemonic(KeyEvent.VK_F1);
		rdbtn_ON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField1.setText(null);
				textField1.setEnabled(true);
				lb1.setText(null);
				lb1.setEnabled(true);
				menuBar.setEnabled(true);
				mnNewMenu.setEnabled(true);
				btn_1.setEnabled(true);
				btn_2.setEnabled(true);
				btn_3.setEnabled(true);
				btn_4.setEnabled(true);
				btn_5.setEnabled(true);
				btn_6.setEnabled(true);
				btn_7.setEnabled(true);
				btn_8.setEnabled(true);
				btn_9.setEnabled(true);
				btn_div.setEnabled(true);
				btn_add.setEnabled(true);
				btn_mul.setEnabled(true);
				btn_sub.setEnabled(true);
				btn_equal.setEnabled(true);
				btn_dot.setEnabled(true);
				btn_pos_neg.setEnabled(true);
				btn_pcnt.setEnabled(true);
				btn_ac.setEnabled(true);
				btn_c.setEnabled(true);
				btn_0.setEnabled(true);
				btn_MC.setEnabled(true);
				btn_MR.setEnabled(true);
				btn_MS.setEnabled(true);
				btn_MPLS.setEnabled(true);

			}
		});
		buttonGroup.add(rdbtn_ON);
		rdbtn_ON.setBounds(12, 110, 55, 35);
		frmDumbestCalculator.getContentPane().add(rdbtn_ON);
		
		JRadioButton rdbtn_OFF = new JRadioButton("OFF");
		rdbtn_OFF.setForeground(Color.RED);
		rdbtn_OFF.setMnemonic(KeyEvent.VK_F2);
		rdbtn_OFF.setSelected(true);
		rdbtn_OFF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField1.setText(null);
				textField1.setEnabled(false);
				lb1.setText(null);
				lb1.setEnabled(false);
				menuBar.setEnabled(false);
				mnNewMenu.setEnabled(false);
				standard_mitem.doClick();
				btn_1.setEnabled(false);
				btn_2.setEnabled(false);
				btn_3.setEnabled(false);
				btn_4.setEnabled(false);
				btn_5.setEnabled(false);
				btn_6.setEnabled(false);
				btn_7.setEnabled(false);
				btn_8.setEnabled(false);
				btn_9.setEnabled(false);
				btn_div.setEnabled(false);
				btn_add.setEnabled(false);
				btn_mul.setEnabled(false);
				btn_sub.setEnabled(false);
				btn_equal.setEnabled(false);
				btn_dot.setEnabled(false);
				btn_pos_neg.setEnabled(false);
				btn_pcnt.setEnabled(false);
				btn_ac.setEnabled(false);
				btn_c.setEnabled(false);
				btn_0.setEnabled(false);
				btn_MC.setEnabled(false);
				btn_MR.setEnabled(false);
				btn_MS.setEnabled(false);
				btn_MPLS.setEnabled(false);
				memory= 0 ;
				textField1.setText("Welcome to Dumbest Calculator V1.0");
				
			}
		});
		buttonGroup.add(rdbtn_OFF);
		rdbtn_OFF.setBounds(72, 110, 55, 35);
		frmDumbestCalculator.getContentPane().add(rdbtn_OFF);
		
		JPanel Rpanel = new JPanel();
		Rpanel.setForeground(new Color(128, 0, 128));
		Rpanel.setBackground(UIManager.getColor("nimbusFocus"));
		Rpanel.setBorder(new TitledBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 128, 128), null, new Color(0, 128, 128), null), new LineBorder(new Color(0, 128, 128), 3, true)), "Radians", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 0, 0)));
		Rpanel.setBounds(799, 0, 426, 265);
		frmDumbestCalculator.getContentPane().add(Rpanel);
		Rpanel.setLayout(null);
		
		JButton btn_sinr = new JButton("sin");
		btn_sinr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.sin(Double.parseDouble(textField1.getText()));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_sinr.setBounds(14, 18, 64, 55);
		Rpanel.add(btn_sinr);
		btn_sinr.setForeground(SystemColor.textHighlight);
		btn_sinr.setFont(new Font("Serif", Font.BOLD, 12));
		btn_sinr.setBackground(new Color(255, 255, 255));
		
		JButton btn_cosr = new JButton("cos");
		btn_cosr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.cos(Double.parseDouble(textField1.getText()));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_cosr.setBounds(80, 18, 64, 55);
		Rpanel.add(btn_cosr);
		btn_cosr.setForeground(SystemColor.textHighlight);
		btn_cosr.setFont(new Font("Serif", Font.BOLD, 12));
		btn_cosr.setBackground(new Color(255, 255, 255));
		
		JButton btn_tanr = new JButton("tan");
		btn_tanr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.tan(Double.parseDouble(textField1.getText()));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_tanr.setBounds(146, 18, 64, 55);
		Rpanel.add(btn_tanr);
		btn_tanr.setForeground(SystemColor.textHighlight);
		btn_tanr.setFont(new Font("Serif", Font.BOLD, 12));
		btn_tanr.setBackground(new Color(255, 255, 255));
		
		JButton btn_sinhr = new JButton("sinh");
		btn_sinhr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.sinh(Double.parseDouble(textField1.getText()));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_sinhr.setBounds(212, 18, 64, 55);
		Rpanel.add(btn_sinhr);
		btn_sinhr.setForeground(SystemColor.textHighlight);
		btn_sinhr.setFont(new Font("Serif", Font.BOLD, 12));
		btn_sinhr.setBackground(new Color(255, 255, 255));
		
		JButton btn_coshr = new JButton("cosh");
		btn_coshr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.cosh(Double.parseDouble(textField1.getText()));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_coshr.setBounds(278, 18, 64, 55);
		Rpanel.add(btn_coshr);
		btn_coshr.setForeground(SystemColor.textHighlight);
		btn_coshr.setFont(new Font("Serif", Font.BOLD, 12));
		btn_coshr.setBackground(new Color(255, 255, 255));
		
		JButton btn_tanhr = new JButton("tanh");
		btn_tanhr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.tanh(Double.parseDouble(textField1.getText()));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_tanhr.setBounds(344, 18, 64, 55);
		Rpanel.add(btn_tanhr);
		btn_tanhr.setForeground(SystemColor.textHighlight);
		btn_tanhr.setFont(new Font("Serif", Font.BOLD, 12));
		btn_tanhr.setBackground(new Color(255, 255, 255));
		
		JButton btn_secr = new JButton("sec");
		btn_secr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = 1/(Math.cos(Double.parseDouble(textField1.getText())));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_secr.setBounds(14, 76, 64, 55);
		Rpanel.add(btn_secr);
		btn_secr.setForeground(SystemColor.textHighlight);
		btn_secr.setFont(new Font("Serif", Font.BOLD, 12));
		btn_secr.setBackground(new Color(255, 255, 255));
		
		JButton btn_cosecr = new JButton("csc");
		btn_cosecr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = 1/(Math.sin(Double.parseDouble(textField1.getText())));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_cosecr.setBounds(80, 76, 64, 55);
		Rpanel.add(btn_cosecr);
		btn_cosecr.setForeground(SystemColor.textHighlight);
		btn_cosecr.setFont(new Font("Serif", Font.BOLD, 12));
		btn_cosecr.setBackground(new Color(255, 255, 255));
		
		JButton btn_cotr = new JButton("cot");
		btn_cotr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = 1/(Math.tan(Double.parseDouble(textField1.getText())));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_cotr.setBounds(146, 76, 64, 55);
		Rpanel.add(btn_cotr);
		btn_cotr.setForeground(SystemColor.textHighlight);
		btn_cotr.setFont(new Font("Serif", Font.BOLD, 12));
		btn_cotr.setBackground(new Color(255, 255, 255));
		
		JButton btn_sechr = new JButton("sech");
		btn_sechr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = 1/(Math.cosh(Double.parseDouble(textField1.getText())));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_sechr.setBounds(212, 76, 64, 55);
		Rpanel.add(btn_sechr);
		btn_sechr.setForeground(SystemColor.textHighlight);
		btn_sechr.setFont(new Font("Serif", Font.BOLD, 12));
		btn_sechr.setBackground(new Color(255, 255, 255));
		
		JButton btn_cosechr = new JButton("csch");
		btn_cosechr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = 1/(Math.sinh(Double.parseDouble(textField1.getText())));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_cosechr.setBounds(278, 76, 64, 55);
		Rpanel.add(btn_cosechr);
		btn_cosechr.setForeground(SystemColor.textHighlight);
		btn_cosechr.setFont(new Font("Serif", Font.BOLD, 12));
		btn_cosechr.setBackground(new Color(255, 255, 255));
		
		JButton btn_cothr = new JButton("coth");
		btn_cothr.setFont(new Font("Serif", Font.BOLD, 12));
		btn_cothr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = 1/(Math.tanh(Double.parseDouble(textField1.getText())));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_cothr.setBounds(344, 76, 64, 55);
		Rpanel.add(btn_cothr);
		btn_cothr.setForeground(SystemColor.textHighlight);
		btn_cothr.setBackground(new Color(255, 255, 255));
		
		JButton btn_sininvr = new JButton("sin-1");
		btn_sininvr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.asin(Double.parseDouble(textField1.getText()));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_sininvr.setBounds(14, 134, 64, 55);
		Rpanel.add(btn_sininvr);
		btn_sininvr.setForeground(SystemColor.textHighlight);
		btn_sininvr.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		btn_sininvr.setBackground(new Color(255, 255, 255));
		
		JButton btn_cosinvr = new JButton("cos–1");
		btn_cosinvr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.acos(Double.parseDouble(textField1.getText()));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_cosinvr.setBounds(80, 134, 64, 55);
		Rpanel.add(btn_cosinvr);
		btn_cosinvr.setForeground(SystemColor.textHighlight);
		btn_cosinvr.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		btn_cosinvr.setBackground(new Color(255, 255, 255));
		
		JButton btn_taninvr = new JButton("tan–1");
		btn_taninvr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.atan(Double.parseDouble(textField1.getText()));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_taninvr.setBounds(146, 134, 64, 55);
		Rpanel.add(btn_taninvr);
		btn_taninvr.setForeground(SystemColor.textHighlight);
		btn_taninvr.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		btn_taninvr.setBackground(new Color(255, 255, 255));
		
		JButton btn_sinhinvr = new JButton("sinh–1");
		btn_sinhinvr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double x = Double.parseDouble(textField1.getText());
				double value = Math.log((x)+Math.sqrt((x*x)+1));
				textField1.setText("");
				textField1.setText(textField1.getText()+value);
				
			}
		});
		btn_sinhinvr.setBounds(212, 134, 64, 55);
		Rpanel.add(btn_sinhinvr);
		btn_sinhinvr.setForeground(SystemColor.textHighlight);
		btn_sinhinvr.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn_sinhinvr.setBackground(new Color(255, 255, 255));
		
		JButton btn_coshinvr = new JButton("cosh–1");
		btn_coshinvr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double x = Double.parseDouble(textField1.getText());
				double a = Math.log((x)+Math.sqrt((x*x)-1));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_coshinvr.setBounds(278, 134, 64, 55);
		Rpanel.add(btn_coshinvr);
		btn_coshinvr.setForeground(SystemColor.textHighlight);
		btn_coshinvr.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn_coshinvr.setBackground(new Color(255, 255, 255));
		
		JButton btn_tanhinvr = new JButton("tanh–1");
		btn_tanhinvr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double x = Double.parseDouble(textField1.getText());
				double a = ((0.5)*(Math.log((1+x)/(1-x))));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_tanhinvr.setBounds(344, 134, 64, 55);
		Rpanel.add(btn_tanhinvr);
		btn_tanhinvr.setForeground(SystemColor.textHighlight);
		btn_tanhinvr.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn_tanhinvr.setBackground(new Color(255, 255, 255));
		
		JButton btn_secinvr = new JButton("sec–1");
		btn_secinvr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.acos(1/Double.parseDouble(textField1.getText()));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_secinvr.setBounds(14, 192, 64, 55);
		Rpanel.add(btn_secinvr);
		btn_secinvr.setForeground(SystemColor.textHighlight);
		btn_secinvr.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		btn_secinvr.setBackground(new Color(255, 255, 255));
		
		JButton btn_cosecinvr = new JButton("csc–1");
		btn_cosecinvr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.asin(1/Double.parseDouble(textField1.getText()));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_cosecinvr.setBounds(80, 192, 64, 55);
		Rpanel.add(btn_cosecinvr);
		btn_cosecinvr.setForeground(SystemColor.textHighlight);
		btn_cosecinvr.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		btn_cosecinvr.setBackground(new Color(255, 255, 255));
		
		JButton btn_cotinvr = new JButton("cot–1");
		btn_cotinvr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.atan(1/Double.parseDouble(textField1.getText()));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_cotinvr.setBounds(146, 192, 64, 55);
		Rpanel.add(btn_cotinvr);
		btn_cotinvr.setForeground(SystemColor.textHighlight);
		btn_cotinvr.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		btn_cotinvr.setBackground(new Color(255, 255, 255));
		
		JButton btn_sechinvr = new JButton("sech–1");
		btn_sechinvr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double x = Double.parseDouble(textField1.getText());
				double a = Math.log((1/(x))+Math.sqrt((1/(x*x))-1));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_sechinvr.setBounds(212, 192, 64, 55);
		Rpanel.add(btn_sechinvr);
		btn_sechinvr.setForeground(SystemColor.textHighlight);
		btn_sechinvr.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn_sechinvr.setBackground(new Color(255, 255, 255));
		
		JButton btn_cosechinvr = new JButton("csch-1");
		btn_cosechinvr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double x = Double.parseDouble(textField1.getText());
				double a = Math.log((1/(x))+Math.sqrt((1/(x*x))+1));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_cosechinvr.setBounds(278, 192, 64, 55);
		Rpanel.add(btn_cosechinvr);
		btn_cosechinvr.setForeground(SystemColor.textHighlight);
		btn_cosechinvr.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn_cosechinvr.setBackground(new Color(255, 255, 255));
		
		JButton btn_cothinvr = new JButton("coth–1");
		btn_cothinvr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double x = Double.parseDouble(textField1.getText());
				double a = ((0.5)*(Math.log((x+1)/(x-1))));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_cothinvr.setBounds(344, 192, 64, 55);
		Rpanel.add(btn_cothinvr);
		btn_cothinvr.setForeground(SystemColor.textHighlight);
		btn_cothinvr.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn_cothinvr.setBackground(new Color(255, 255, 255));
		
		JPanel Dpanel = new JPanel();
		Dpanel.setForeground(UIManager.getColor("nimbusRed"));
		Dpanel.setBackground(UIManager.getColor("nimbusFocus"));
		Dpanel.setBorder(new TitledBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 128, 128), new Color(255, 255, 255), new Color(0, 128, 128), new Color(255, 255, 255)), new LineBorder(new Color(0, 128, 128), 3, true)), "Degrees", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 0, 0)));
		Dpanel.setBounds(368, 160, 426, 265);
		frmDumbestCalculator.getContentPane().add(Dpanel);
		Dpanel.setLayout(null);
		
		JButton btn_sind = new JButton("sin");
		btn_sind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.sin(Math.toRadians(Double.parseDouble(textField1.getText())));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_sind.setBounds(14, 18, 64, 55);
		Dpanel.add(btn_sind);
		btn_sind.setForeground(SystemColor.textHighlight);
		btn_sind.setFont(new Font("Serif", Font.BOLD, 12));
		btn_sind.setBackground(new Color(255, 255, 255));
		
		JButton btn_cosd = new JButton("cos");
		btn_cosd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.cos(Math.toRadians(Double.parseDouble(textField1.getText())));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);	
				
			}
		});
		btn_cosd.setBounds(80, 18, 64, 55);
		Dpanel.add(btn_cosd);
		btn_cosd.setForeground(SystemColor.textHighlight);
		btn_cosd.setFont(new Font("Serif", Font.BOLD, 12));
		btn_cosd.setBackground(new Color(255, 255, 255));
		
		JButton btn_tand = new JButton("tan");
		btn_tand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.tan(Math.toRadians(Double.parseDouble(textField1.getText())));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_tand.setBounds(146, 18, 64, 55);
		Dpanel.add(btn_tand);
		btn_tand.setForeground(SystemColor.textHighlight);
		btn_tand.setFont(new Font("Serif", Font.BOLD, 12));
		btn_tand.setBackground(new Color(255, 255, 255));
		
		JButton btn_sinhd = new JButton("sinh");
		btn_sinhd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.sinh(Double.parseDouble(textField1.getText()));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_sinhd.setBounds(212, 18, 64, 55);
		Dpanel.add(btn_sinhd);
		btn_sinhd.setForeground(SystemColor.textHighlight);
		btn_sinhd.setFont(new Font("Serif", Font.BOLD, 12));
		btn_sinhd.setBackground(new Color(255, 255, 255));
		
		JButton btn_coshd = new JButton("cosh");
		btn_coshd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.cosh(Double.parseDouble(textField1.getText()));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);	
				
			}
		});
		btn_coshd.setBounds(278, 18, 64, 55);
		Dpanel.add(btn_coshd);
		btn_coshd.setForeground(SystemColor.textHighlight);
		btn_coshd.setFont(new Font("Serif", Font.BOLD, 12));
		btn_coshd.setBackground(new Color(255, 255, 255));
		
		JButton btn_tanhd = new JButton("tanh");
		btn_tanhd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.tanh(Double.parseDouble(textField1.getText()));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_tanhd.setBounds(344, 18, 64, 55);
		Dpanel.add(btn_tanhd);
		btn_tanhd.setForeground(SystemColor.textHighlight);
		btn_tanhd.setFont(new Font("Serif", Font.BOLD, 12));
		btn_tanhd.setBackground(new Color(255, 255, 255));
		
		JButton btn_secd = new JButton("sec");
		btn_secd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = 1/(Math.cos(Math.toRadians(Double.parseDouble(textField1.getText()))));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_secd.setBounds(14, 76, 64, 55);
		Dpanel.add(btn_secd);
		btn_secd.setForeground(SystemColor.textHighlight);
		btn_secd.setFont(new Font("Serif", Font.BOLD, 12));
		btn_secd.setBackground(new Color(255, 255, 255));
		
		JButton btn_cosecd = new JButton("csc");
		btn_cosecd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = 1/(Math.sin(Math.toRadians(Double.parseDouble(textField1.getText()))));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_cosecd.setBounds(80, 76, 64, 55);
		Dpanel.add(btn_cosecd);
		btn_cosecd.setForeground(SystemColor.textHighlight);
		btn_cosecd.setFont(new Font("Serif", Font.BOLD, 12));
		btn_cosecd.setBackground(new Color(255, 255, 255));
		
		JButton btn_cotd = new JButton("cot");
		btn_cotd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = 1/(Math.tan(Math.toRadians(Double.parseDouble(textField1.getText()))));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_cotd.setBounds(146, 76, 64, 55);
		Dpanel.add(btn_cotd);
		btn_cotd.setForeground(SystemColor.textHighlight);
		btn_cotd.setFont(new Font("Serif", Font.BOLD, 12));
		btn_cotd.setBackground(new Color(255, 255, 255));
		
		JButton btn_sechd = new JButton("sech");
		btn_sechd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = 1/(Math.cosh(Double.parseDouble(textField1.getText())));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_sechd.setBounds(212, 76, 64, 55);
		Dpanel.add(btn_sechd);
		btn_sechd.setForeground(SystemColor.textHighlight);
		btn_sechd.setFont(new Font("Serif", Font.BOLD, 12));
		btn_sechd.setBackground(new Color(255, 255, 255));
		
		JButton btn_cosechd = new JButton("csch");
		btn_cosechd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = 1/(Math.sinh(Double.parseDouble(textField1.getText())));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_cosechd.setBounds(278, 76, 64, 55);
		Dpanel.add(btn_cosechd);
		btn_cosechd.setForeground(SystemColor.textHighlight);
		btn_cosechd.setFont(new Font("Serif", Font.BOLD, 12));
		btn_cosechd.setBackground(new Color(255, 255, 255));
		
		JButton btn_cothd = new JButton("coth");
		btn_cothd.setFont(new Font("Serif", Font.BOLD, 12));
		btn_cothd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = 1/(Math.tanh(Double.parseDouble(textField1.getText())));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_cothd.setBounds(344, 76, 64, 55);
		Dpanel.add(btn_cothd);
		btn_cothd.setForeground(SystemColor.textHighlight);
		btn_cothd.setBackground(new Color(255, 255, 255));
		
		JButton btn_sininvd = new JButton("sin-1");
		btn_sininvd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.toDegrees(Math.asin(Double.parseDouble(textField1.getText())));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_sininvd.setBounds(14, 134, 64, 55);
		Dpanel.add(btn_sininvd);
		btn_sininvd.setForeground(SystemColor.textHighlight);
		btn_sininvd.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		btn_sininvd.setBackground(new Color(255, 255, 255));
		
		JButton btn_cosinvd = new JButton("cos–1");
		btn_cosinvd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.toDegrees(Math.acos(Double.parseDouble(textField1.getText())));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_cosinvd.setBounds(80, 134, 64, 55);
		Dpanel.add(btn_cosinvd);
		btn_cosinvd.setForeground(SystemColor.textHighlight);
		btn_cosinvd.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		btn_cosinvd.setBackground(new Color(255, 255, 255));
		
		JButton btn_taninvd = new JButton("tan–1");
		btn_taninvd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.toDegrees(Math.atan(Double.parseDouble(textField1.getText())));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_taninvd.setBounds(146, 134, 64, 55);
		Dpanel.add(btn_taninvd);
		btn_taninvd.setForeground(SystemColor.textHighlight);
		btn_taninvd.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		btn_taninvd.setBackground(new Color(255, 255, 255));
		
		JButton btn_sinhinvd = new JButton("sinh–1");
		btn_sinhinvd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double x = Double.parseDouble(textField1.getText());
				double value = Math.log((x)+Math.sqrt((x*x)+1));
				textField1.setText("");
				textField1.setText(textField1.getText()+value);
				
			}
		});
		btn_sinhinvd.setBounds(212, 134, 64, 55);
		Dpanel.add(btn_sinhinvd);
		btn_sinhinvd.setForeground(SystemColor.textHighlight);
		btn_sinhinvd.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn_sinhinvd.setBackground(new Color(255, 255, 255));
		
        JButton btn_coshinvd = new JButton("cosh–1");
		btn_coshinvd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double x = Double.parseDouble(textField1.getText());
				double a = Math.log((x)+Math.sqrt((x*x)-1));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_coshinvd.setBounds(278, 134, 64, 55);
		Dpanel.add(btn_coshinvd);
		btn_coshinvd.setForeground(SystemColor.textHighlight);
		btn_coshinvd.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn_coshinvd.setBackground(new Color(255, 255, 255));
		
		JButton btn_tanhinvd = new JButton("tanh–1");
		btn_tanhinvd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double x = Double.parseDouble(textField1.getText());
				double a = ((0.5)*(Math.log((1+x)/(1-x))));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
			}
		});
		btn_tanhinvd.setBounds(344, 134, 64, 55);
		Dpanel.add(btn_tanhinvd);
		btn_tanhinvd.setForeground(SystemColor.textHighlight);
		btn_tanhinvd.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn_tanhinvd.setBackground(new Color(255, 255, 255));
		
		
		JButton btn_secinvd = new JButton("sec–1");
		btn_secinvd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.toDegrees(Math.acos(1/Double.parseDouble(textField1.getText())));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_secinvd.setBounds(14, 192, 64, 55);
		Dpanel.add(btn_secinvd);
		btn_secinvd.setForeground(SystemColor.textHighlight);
		btn_secinvd.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		btn_secinvd.setBackground(new Color(255, 255, 255));
		
		JButton btn_cosecinvd = new JButton("csc–1");
		btn_cosecinvd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.toDegrees(Math.asin(1/Double.parseDouble(textField1.getText())));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_cosecinvd.setBounds(80, 192, 64, 55);
		Dpanel.add(btn_cosecinvd);
		btn_cosecinvd.setForeground(SystemColor.textHighlight);
		btn_cosecinvd.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		btn_cosecinvd.setBackground(new Color(255, 255, 255));
		
		JButton btn_cotinvd = new JButton("cot–1");
		btn_cotinvd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.toDegrees(Math.atan(1/Double.parseDouble(textField1.getText())));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_cotinvd.setBounds(146, 192, 64, 55);
		Dpanel.add(btn_cotinvd);
		btn_cotinvd.setForeground(SystemColor.textHighlight);
		btn_cotinvd.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		btn_cotinvd.setBackground(new Color(255, 255, 255));
		
		JButton btn_sechinvd = new JButton("sech–1");
		btn_sechinvd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double x = Double.parseDouble(textField1.getText());
				double a = Math.log((1/(x))+Math.sqrt((1/(x*x))-1));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_sechinvd.setBounds(212, 192, 64, 55);
		Dpanel.add(btn_sechinvd);
		btn_sechinvd.setForeground(SystemColor.textHighlight);
		btn_sechinvd.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn_sechinvd.setBackground(new Color(255, 255, 255));
		
		JButton btn_cosechinvd = new JButton("csch–1");
		btn_cosechinvd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double x = Double.parseDouble(textField1.getText());
				double a = Math.log((1/(x))+Math.sqrt((1/(x*x))+1));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_cosechinvd.setBounds(278, 192, 64, 55);
		Dpanel.add(btn_cosechinvd);
		btn_cosechinvd.setForeground(SystemColor.textHighlight);
		btn_cosechinvd.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn_cosechinvd.setBackground(new Color(255, 255, 255));
		
		JButton btn_cothinvd = new JButton("coth–1");
		btn_cothinvd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double x = Double.parseDouble(textField1.getText());
				double a = ((0.5)*(Math.log((x+1)/(x-1))));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_cothinvd.setBounds(344, 192, 64, 55);
		Dpanel.add(btn_cothinvd);
		btn_cothinvd.setForeground(SystemColor.textHighlight);
		btn_cothinvd.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn_cothinvd.setBackground(new Color(255, 255, 255));
		
		JPanel Gpanel = new JPanel();
		Gpanel.setForeground(UIManager.getColor("nimbusRed"));
		Gpanel.setBackground(UIManager.getColor("nimbusFocus"));
		Gpanel.setBorder(new TitledBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 128, 128), null, new Color(0, 128, 128), null), new LineBorder(new Color(0, 128, 128), 3, true)), "Gradians", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 0, 0)));
		Gpanel.setBounds(799, 272, 426, 265);
		frmDumbestCalculator.getContentPane().add(Gpanel);
		Gpanel.setLayout(null);
		
		JButton btn_sing = new JButton("sin");
		btn_sing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.sin(Math.PI * ((Double.parseDouble(textField1.getText())/200)));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_sing.setBounds(14, 18, 64, 55);
		Gpanel.add(btn_sing);
		btn_sing.setForeground(SystemColor.textHighlight);
		btn_sing.setFont(new Font("Serif", Font.BOLD, 12));
		btn_sing.setBackground(new Color(255, 255, 255));
		
		JButton btn_cosg = new JButton("cos");
		btn_cosg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.cos(Math.PI * ((Double.parseDouble(textField1.getText())/200)));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_cosg.setBounds(80, 18, 64, 55);
		Gpanel.add(btn_cosg);
		btn_cosg.setForeground(SystemColor.textHighlight);
		btn_cosg.setFont(new Font("Serif", Font.BOLD, 12));
		btn_cosg.setBackground(new Color(255, 255, 255));
		
		JButton btn_tang = new JButton("tan");
		btn_tang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.tan(Math.PI * ((Double.parseDouble(textField1.getText())/200)));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_tang.setBounds(146, 18, 64, 55);
		Gpanel.add(btn_tang);
		btn_tang.setForeground(SystemColor.textHighlight);
		btn_tang.setFont(new Font("Serif", Font.BOLD, 12));
		btn_tang.setBackground(new Color(255, 255, 255));
		
		JButton btn_sinhg = new JButton("sinh");
		btn_sinhg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.sinh(Double.parseDouble(textField1.getText()));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_sinhg.setBounds(212, 18, 64, 55);
		Gpanel.add(btn_sinhg);
		btn_sinhg.setForeground(SystemColor.textHighlight);
		btn_sinhg.setFont(new Font("Serif", Font.BOLD, 12));
		btn_sinhg.setBackground(new Color(255, 255, 255));
		
		JButton btn_coshg = new JButton("cosh");
		btn_coshg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.cosh(Double.parseDouble(textField1.getText()));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_coshg.setBounds(278, 18, 64, 55);
		Gpanel.add(btn_coshg);
		btn_coshg.setForeground(SystemColor.textHighlight);
		btn_coshg.setFont(new Font("Serif", Font.BOLD, 12));
		btn_coshg.setBackground(new Color(255, 255, 255));
		
		JButton btn_tanhg = new JButton("tanh");
		btn_tanhg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = Math.tanh(Double.parseDouble(textField1.getText()));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_tanhg.setBounds(344, 18, 64, 55);
		Gpanel.add(btn_tanhg);
		btn_tanhg.setForeground(SystemColor.textHighlight);
		btn_tanhg.setFont(new Font("Serif", Font.BOLD, 12));
		btn_tanhg.setBackground(new Color(255, 255, 255));
		
		JButton btn_secg = new JButton("sec");
		btn_secg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = 1/(Math.cos(Math.PI * ((Double.parseDouble(textField1.getText())/200))));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_secg.setBounds(14, 76, 64, 55);
		Gpanel.add(btn_secg);
		btn_secg.setForeground(SystemColor.textHighlight);
		btn_secg.setFont(new Font("Serif", Font.BOLD, 12));
		btn_secg.setBackground(new Color(255, 255, 255));
		
		JButton btn_cosecg = new JButton("csc");
		btn_cosecg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = 1/(Math.sin(Math.PI * ((Double.parseDouble(textField1.getText())/200))));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_cosecg.setBounds(80, 76, 64, 55);
		Gpanel.add(btn_cosecg);
		btn_cosecg.setForeground(SystemColor.textHighlight);
		btn_cosecg.setFont(new Font("Serif", Font.BOLD, 12));
		btn_cosecg.setBackground(new Color(255, 255, 255));
		
		JButton btn_cotg = new JButton("cot");
		btn_cotg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = 1/(Math.tan(Math.PI * ((Double.parseDouble(textField1.getText())/200))));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_cotg.setBounds(146, 76, 64, 55);
		Gpanel.add(btn_cotg);
		btn_cotg.setForeground(SystemColor.textHighlight);
		btn_cotg.setFont(new Font("Serif", Font.BOLD, 12));
		btn_cotg.setBackground(new Color(255, 255, 255));
		
		JButton btn_sechg = new JButton("sech");
		btn_sechg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = 1/(Math.cosh(Double.parseDouble(textField1.getText())));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_sechg.setBounds(212, 76, 64, 55);
		Gpanel.add(btn_sechg);
		btn_sechg.setForeground(SystemColor.textHighlight);
		btn_sechg.setFont(new Font("Serif", Font.BOLD, 12));
		btn_sechg.setBackground(new Color(255, 255, 255));
		
		JButton btn_cosechg = new JButton("csch");
		btn_cosechg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = 1/(Math.sinh(Double.parseDouble(textField1.getText())));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_cosechg.setBounds(278, 76, 64, 55);
		Gpanel.add(btn_cosechg);
		btn_cosechg.setForeground(SystemColor.textHighlight);
		btn_cosechg.setFont(new Font("Serif", Font.BOLD, 12));
		btn_cosechg.setBackground(new Color(255, 255, 255));
		
		JButton btn_cothg = new JButton("coth");
		btn_cothg.setFont(new Font("Serif", Font.BOLD, 12));
		btn_cothg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = 1/(Math.tanh(Double.parseDouble(textField1.getText())));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_cothg.setBounds(344, 76, 64, 55);
		Gpanel.add(btn_cothg);
		btn_cothg.setForeground(SystemColor.textHighlight);
		btn_cothg.setBackground(new Color(255, 255, 255));
		
		JButton btn_sininvg = new JButton("sin-1");
		btn_sininvg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = 	(Math.asin(Double.parseDouble(textField1.getText()))/Math.PI) * 200;
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_sininvg.setBounds(14, 134, 64, 55);
		Gpanel.add(btn_sininvg);
		btn_sininvg.setForeground(SystemColor.textHighlight);
		btn_sininvg.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		btn_sininvg.setBackground(new Color(255, 255, 255));
		
		JButton btn_cosinvg = new JButton("cos–1");
		btn_cosinvg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = 	(Math.acos(Double.parseDouble(textField1.getText()))/Math.PI) * 200;
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_cosinvg.setBounds(80, 134, 64, 55);
		Gpanel.add(btn_cosinvg);
		btn_cosinvg.setForeground(SystemColor.textHighlight);
		btn_cosinvg.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		btn_cosinvg.setBackground(new Color(255, 255, 255));
		
		JButton btn_taninvg = new JButton("tan–1");
		btn_taninvg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = 	(Math.atan(Double.parseDouble(textField1.getText()))/Math.PI) * 200;
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_taninvg.setBounds(146, 134, 64, 55);
		Gpanel.add(btn_taninvg);
		btn_taninvg.setForeground(SystemColor.textHighlight);
		btn_taninvg.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		btn_taninvg.setBackground(new Color(255, 255, 255));
		
		JButton btn_sinhinvg = new JButton("sinh–1");
		btn_sinhinvg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double x = Double.parseDouble(textField1.getText());
				double a = Math.log((x)+Math.sqrt((x*x)+1));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_sinhinvg.setBounds(212, 134, 64, 55);
		Gpanel.add(btn_sinhinvg);
		btn_sinhinvg.setForeground(SystemColor.textHighlight);
		btn_sinhinvg.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn_sinhinvg.setBackground(new Color(255, 255, 255));
		
		JButton btn_coshinvg = new JButton("cosh–1");
		btn_coshinvg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double x = Double.parseDouble(textField1.getText());
				double a = Math.log((x)+Math.sqrt((x*x)-1));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);				
				
			}
		});
		btn_coshinvg.setBounds(278, 134, 64, 55);
		Gpanel.add(btn_coshinvg);
		btn_coshinvg.setForeground(SystemColor.textHighlight);
		btn_coshinvg.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn_coshinvg.setBackground(new Color(255, 255, 255));
		
		JButton btn_tanhinvg = new JButton("tanh–1");
		btn_tanhinvg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double x = Double.parseDouble(textField1.getText());
				double a = ((0.5)*(Math.log((1+x)/(1-x))));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_tanhinvg.setBounds(344, 134, 64, 55);
		Gpanel.add(btn_tanhinvg);
		btn_tanhinvg.setForeground(SystemColor.textHighlight);
		btn_tanhinvg.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn_tanhinvg.setBackground(new Color(255, 255, 255));
		
		JButton btn_secinvg = new JButton("sec–1");
		btn_secinvg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = 	(Math.acos(1/Double.parseDouble(textField1.getText()))/Math.PI) * 200;
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_secinvg.setBounds(14, 192, 64, 55);
		Gpanel.add(btn_secinvg);
		btn_secinvg.setForeground(SystemColor.textHighlight);
		btn_secinvg.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		btn_secinvg.setBackground(new Color(255, 255, 255));
		
		JButton btn_cosecinvg = new JButton("csc–1");
		btn_cosecinvg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = 	(Math.asin(1/Double.parseDouble(textField1.getText()))/Math.PI) * 200;
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_cosecinvg.setBounds(80, 192, 64, 55);
		Gpanel.add(btn_cosecinvg);
		btn_cosecinvg.setForeground(SystemColor.textHighlight);
		btn_cosecinvg.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		btn_cosecinvg.setBackground(new Color(255, 255, 255));
		
		JButton btn_cotinvg = new JButton("cot–1");
		btn_cotinvg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a = 	(Math.atan(1/Double.parseDouble(textField1.getText()))/Math.PI) * 200;
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_cotinvg.setBounds(146, 192, 64, 55);
		Gpanel.add(btn_cotinvg);
		btn_cotinvg.setForeground(SystemColor.textHighlight);
		btn_cotinvg.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		btn_cotinvg.setBackground(new Color(255, 255, 255));
		
		JButton btn_sechinvg = new JButton("sech–1");
		btn_sechinvg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double x = Double.parseDouble(textField1.getText());
				double a = Math.log((1/(x))+Math.sqrt((1/(x*x))-1));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_sechinvg.setBounds(212, 192, 64, 55);
		Gpanel.add(btn_sechinvg);
		btn_sechinvg.setForeground(SystemColor.textHighlight);
		btn_sechinvg.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn_sechinvg.setBackground(new Color(255, 255, 255));
		
		JButton btn_cosechinvg = new JButton("csch–1");
		btn_cosechinvg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double x = Double.parseDouble(textField1.getText());
				double a = Math.log((1/(x))+Math.sqrt((1/(x*x))+1));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_cosechinvg.setBounds(278, 192, 64, 55);
		Gpanel.add(btn_cosechinvg);
		btn_cosechinvg.setForeground(SystemColor.textHighlight);
		btn_cosechinvg.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn_cosechinvg.setBackground(new Color(255, 255, 255));
		
		JButton btn_cothinvg = new JButton("coth–1");
		btn_cothinvg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double x = Double.parseDouble(textField1.getText());
				double a = ((0.5)*(Math.log((x+1)/(x-1))));
				textField1.setText("");
				textField1.setText(textField1.getText()+a);
				
			}
		});
		btn_cothinvg.setBounds(344, 192, 64, 55);
		Gpanel.add(btn_cothinvg);
		btn_cothinvg.setForeground(SystemColor.textHighlight);
		btn_cothinvg.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn_cothinvg.setBackground(new Color(255, 255, 255));
		
		JLabel inslbl_1 = new JLabel("Value of 6.123233995736766E-17 = 0");
		inslbl_1.setBackground(UIManager.getColor("nimbusFocus"));
		inslbl_1.setForeground(new Color(255, 255, 255));
		inslbl_1.setHorizontalAlignment(SwingConstants.CENTER);
		inslbl_1.setBounds(370, 105, 426, 40);
		frmDumbestCalculator.getContentPane().add(inslbl_1);
		inslbl_1.setFont(new Font("SansSerif", Font.PLAIN, 16));
		
		JLabel inslbl_2 = new JLabel("Value of 1.633123935319537E16 = Cannot be Defined");
		inslbl_2.setBackground(UIManager.getColor("nimbusFocus"));
		inslbl_2.setForeground(new Color(255, 255, 255));
		inslbl_2.setHorizontalAlignment(SwingConstants.CENTER);
		inslbl_2.setFont(new Font("SansSerif", Font.PLAIN, 16));
		inslbl_2.setBounds(362, 125, 428, 35);
		frmDumbestCalculator.getContentPane().add(inslbl_2);
		
		JButton btn_CHNG = new JButton("00");
		btn_CHNG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String num=textField1.getText()+btn_CHNG.getText();
				textField1.setText(num);
				
			}
		});
		btn_CHNG.setForeground(SystemColor.textHighlight);
		btn_CHNG.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		btn_CHNG.setBackground(new Color(255, 255, 255));
		btn_CHNG.setBounds(550, 445, 60, 45);
		frmDumbestCalculator.getContentPane().add(btn_CHNG);
		
		JPanel Lpanel = new JPanel();
		Lpanel.setBorder(new LineBorder(new Color(0, 128, 128), 50, true));
		Lpanel.setBounds(370, 105, 420, 55);
		frmDumbestCalculator.getContentPane().add(Lpanel);
		Lpanel.setLayout(null);

	    }
	}
