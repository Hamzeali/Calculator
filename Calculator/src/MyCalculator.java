import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Component;
import java.awt.Rectangle;
import javax.swing.JLabel;

public class MyCalculator {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JButton minPlusButton;
	private JButton sqrtButton;
	private JButton percentButton;
	private JButton oneByXButton;
	private JButton divButton;
	private JButton deleteButton;
	private JButton CButton;
	private JButton CEButton;
	private JButton sevenButton;
	private JButton eightButton;
	private JButton nineButton;
	private JButton mulButton;
	private JButton fourButton;
	private JButton fiveButton;
	private JButton sixButton;
	private JButton subButton;
	private JButton oneButton;
	private JButton twoButton;
	private JButton threeButton;
	private JButton addButton;
	private JButton zeroButton;
	private JButton pointButton;
	private JButton equalButton;
	private boolean pointIsPressed = false;
	
	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalculator window = new MyCalculator();
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
	public MyCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 491, 395);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 255, 0), null, null, null));
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setForeground(Color.WHITE);
		textField.setBackground(Color.GRAY);
		textField.setBounds(10, 11, 455, 66);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 77, 455, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JButton memoryButton = new JButton("M");
		memoryButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				memoryButton.setBackground(Color.GRAY);
				memoryButton.setForeground(Color.WHITE);
			}
			public void mouseExited(java.awt.event.MouseEvent evt) {
				memoryButton.setBackground(Color.DARK_GRAY);
				memoryButton.setForeground(Color.GRAY);
			}
		});
		memoryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		memoryButton.setFocusPainted(false);
		memoryButton.setBorder(null);
		memoryButton.setForeground(Color.GRAY);
		memoryButton.setBackground(Color.DARK_GRAY);
		memoryButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		memoryButton.setBounds(10, 113, 80, 38);
		frame.getContentPane().add(memoryButton);
		
		minPlusButton = new JButton("-/+");
		minPlusButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				minPlusButton.setBackground(Color.GRAY);
				minPlusButton.setForeground(Color.WHITE);
			}
			public void mouseExited(java.awt.event.MouseEvent evt) {
				minPlusButton.setBackground(Color.DARK_GRAY);
				minPlusButton.setForeground(Color.GRAY);
			}
		});
		minPlusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = textField.getText();
				if(!value.contains("-"))
				{
					textField.setText('-' + value);
				}
				
				else
				{
					try {
						textField.setText(value.split("-")[1]);
					}
					catch(IndexOutOfBoundsException e1){
						textField.setText("");
					}
					
				}
				
			}
			
		});
		minPlusButton.setFocusPainted(false);
		minPlusButton.setBorder(null);
		minPlusButton.setForeground(Color.GRAY);
		minPlusButton.setBackground(Color.DARK_GRAY);
		minPlusButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		minPlusButton.setBounds(10, 162, 80, 38);
		frame.getContentPane().add(minPlusButton);
		
		sqrtButton = new JButton("\u221A");
		sqrtButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				sqrtButton.setBackground(Color.GRAY);
				sqrtButton.setForeground(Color.WHITE);
			}
			public void mouseExited(java.awt.event.MouseEvent evt) {
				sqrtButton.setBackground(Color.DARK_GRAY);
				sqrtButton.setForeground(Color.GRAY);
			}
		});
		sqrtButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = lblNewLabel.getText();
				if(!s.isEmpty()) {
					textField.setText(lblNewLabel.getText());
				}
				if(textField.getText().length() > 0) {
					double b = Double.parseDouble(textField.getText());
					lblNewLabel.setText(Double.toString(Math.sqrt(b)));
					}
				
					else {
						textField.setText("");
					}
				
				
			}
		});
		sqrtButton.setFocusPainted(false);
		sqrtButton.setBorder(null);
		sqrtButton.setForeground(Color.GRAY);
		sqrtButton.setBackground(Color.DARK_GRAY);
		sqrtButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		sqrtButton.setBounds(10, 211, 80, 38);
		frame.getContentPane().add(sqrtButton);
		
		percentButton = new JButton("x\u00B2");
		percentButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				percentButton.setBackground(Color.GRAY);
				percentButton.setForeground(Color.WHITE);
			}
			public void mouseExited(java.awt.event.MouseEvent evt) {
				percentButton.setBackground(Color.DARK_GRAY);
				percentButton.setForeground(Color.GRAY);
			}
		});
		percentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = lblNewLabel.getText();
				if(!s.isEmpty()) {
					textField.setText(lblNewLabel.getText());
				}
				if(textField.getText().length() > 0) {
					double b = Double.parseDouble(textField.getText());
					lblNewLabel.setText(Double.toString(Math.pow(b, 2)));
					}
				
					else {
						textField.setText("");
					}
				
			}
		});
		percentButton.setFocusPainted(false);
		percentButton.setBorder(null);
		percentButton.setForeground(Color.GRAY);
		percentButton.setBackground(Color.DARK_GRAY);
		percentButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		percentButton.setBounds(10, 260, 80, 38);
		frame.getContentPane().add(percentButton);
		
		oneByXButton = new JButton("1/x");
		oneByXButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				oneByXButton.setBackground(Color.GRAY);
				oneByXButton.setForeground(Color.WHITE);
			}
			public void mouseExited(java.awt.event.MouseEvent evt) {
				oneByXButton.setBackground(Color.DARK_GRAY);
				oneByXButton.setForeground(Color.GRAY);
			}
		});
		oneByXButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = lblNewLabel.getText();
				if(!s.isEmpty()) {
					textField.setText(lblNewLabel.getText());
				}
				if(textField.getText().length() > 0) {
					double b = Double.parseDouble(textField.getText());
					lblNewLabel.setText(Double.toString(1 / b));
					}
				
					else {
						textField.setText("");
					}
			}
		});
		oneByXButton.setFocusPainted(false);
		oneByXButton.setBorder(null);
		oneByXButton.setForeground(Color.GRAY);
		oneByXButton.setBackground(Color.DARK_GRAY);
		oneByXButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		oneByXButton.setBounds(10, 309, 80, 38);
		frame.getContentPane().add(oneByXButton);
		
		divButton = new JButton("/");
		divButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				divButton.setBackground(Color.GRAY);
				divButton.setForeground(Color.WHITE);
			}
			public void mouseExited(java.awt.event.MouseEvent evt) {
				divButton.setBackground(Color.DARK_GRAY);
				divButton.setForeground(Color.GRAY);
			}
		});
		divButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = lblNewLabel.getText();
				if(textField.getText().length() > 0) {
				textField.setText(textField.getText() + " / ");
				if(!s.isEmpty()) {
					textField.setText(s + " / ");
				}
				pointIsPressed = false;
				}
			}
		});
		divButton.setFocusPainted(false);
		divButton.setBorder(null);
		divButton.setForeground(Color.GRAY);
		divButton.setBackground(Color.DARK_GRAY);
		divButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		divButton.setBounds(385, 113, 80, 38);
		frame.getContentPane().add(divButton);
		
		deleteButton = new JButton("<--");
		deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				deleteButton.setBackground(Color.GRAY);
				deleteButton.setForeground(Color.WHITE);
			}
			public void mouseExited(java.awt.event.MouseEvent evt) {
				deleteButton.setBackground(Color.DARK_GRAY);
				deleteButton.setForeground(Color.GRAY);
			}
		});
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = textField.getText();
				int length = value.length();
				
				if(length > 0) {
					StringBuilder builder = new StringBuilder(value);
					builder.deleteCharAt(length - 1);
					textField.setText(builder.toString());
				}
			}
		});
		deleteButton.setFocusPainted(false);
		deleteButton.setBorder(null);
		deleteButton.setForeground(Color.GRAY);
		deleteButton.setBackground(Color.DARK_GRAY);
		deleteButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		deleteButton.setBounds(295, 113, 80, 38);
		frame.getContentPane().add(deleteButton);
		
		CButton = new JButton("C");
		CButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				CButton.setBackground(Color.GRAY);
				CButton.setForeground(Color.WHITE);
			}
			public void mouseExited(java.awt.event.MouseEvent evt) {
				CButton.setBackground(Color.DARK_GRAY);
				CButton.setForeground(Color.GRAY);
			}
		});
		CButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				lblNewLabel.setText("");
				pointIsPressed = false;
			}
		});
		CButton.setFocusPainted(false);
		CButton.setBorder(null);
		CButton.setForeground(Color.GRAY);
		CButton.setBackground(Color.DARK_GRAY);
		CButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		CButton.setBounds(205, 113, 80, 38);
		frame.getContentPane().add(CButton);
		
		CEButton = new JButton("CE");
		CEButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				CEButton.setBackground(Color.GRAY);
				CEButton.setForeground(Color.WHITE);
			}
			public void mouseExited(java.awt.event.MouseEvent evt) {
				CEButton.setBackground(Color.DARK_GRAY);
				CEButton.setForeground(Color.GRAY);
			}
		});
		CEButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				pointIsPressed = false;
			}
		});
		CEButton.setFocusPainted(false);
		CEButton.setBorder(null);
		CEButton.setBackground(Color.DARK_GRAY);
		CEButton.setForeground(Color.GRAY);
		CEButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		CEButton.setBounds(115, 113, 80, 38);
		frame.getContentPane().add(CEButton);
		
		sevenButton = new JButton("7");
		sevenButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				sevenButton.setBackground(Color.GRAY);
			}
			public void mouseExited(java.awt.event.MouseEvent evt) {
				sevenButton.setBackground(Color.DARK_GRAY);
			}
		});
		sevenButton.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "7");
			}
		});
		sevenButton.setFocusPainted(false);
		sevenButton.setBorder(null);
		sevenButton.setForeground(Color.WHITE);
		sevenButton.setBackground(Color.DARK_GRAY);
		sevenButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		sevenButton.setBounds(115, 162, 80, 38);
		frame.getContentPane().add(sevenButton);
		
		eightButton = new JButton("8");
		eightButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				eightButton.setBackground(Color.GRAY);
			}
			public void mouseExited(java.awt.event.MouseEvent evt) {
				eightButton.setBackground(Color.DARK_GRAY);
			}
		});
		eightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "8");

			}
		});
		eightButton.setFocusPainted(false);
		eightButton.setBorder(null);
		eightButton.setForeground(Color.WHITE);
		eightButton.setBackground(Color.DARK_GRAY);
		eightButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		eightButton.setBounds(205, 162, 80, 38);
		frame.getContentPane().add(eightButton);
		
		nineButton = new JButton("9");
		nineButton.setFocusPainted(false);
		nineButton.setBorder(null);
		nineButton.setBackground(Color.DARK_GRAY);
		nineButton.setForeground(Color.WHITE);
		nineButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				nineButton.setBackground(Color.GRAY);
			}
			public void mouseExited(java.awt.event.MouseEvent evt) {
				nineButton.setBackground(Color.DARK_GRAY);
			}
		});
		nineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					textField.setText(textField.getText() + "9");
			}
		});
		nineButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		nineButton.setBounds(295, 162, 80, 38);
		frame.getContentPane().add(nineButton);
		
		mulButton = new JButton("*");
		mulButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				mulButton.setBackground(Color.GRAY);
				mulButton.setForeground(Color.WHITE);
			}
			public void mouseExited(java.awt.event.MouseEvent evt) {
				mulButton.setBackground(Color.DARK_GRAY);
				mulButton.setForeground(Color.GRAY);
			}
		});
		mulButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = lblNewLabel.getText();
				if(textField.getText().length() > 0) {
				textField.setText(textField.getText() + " * ");
				if(!s.isEmpty()) {
					textField.setText(s + " * ");
				}
				pointIsPressed = false;
				}
			}
		});
		mulButton.setFocusPainted(false);
		mulButton.setBorder(null);
		mulButton.setBackground(Color.DARK_GRAY);
		mulButton.setForeground(Color.GRAY);
		mulButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		mulButton.setBounds(385, 162, 80, 38);
		frame.getContentPane().add(mulButton);
		
		fourButton = new JButton("4");
		fourButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				fourButton.setBackground(Color.GRAY);
			}
			public void mouseExited(java.awt.event.MouseEvent evt) {
				fourButton.setBackground(Color.DARK_GRAY);
			}
		});
		fourButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "4");
			}
		});
		fourButton.setFocusPainted(false);
		fourButton.setBorder(null);
		fourButton.setForeground(Color.WHITE);
		fourButton.setBackground(Color.DARK_GRAY);
		fourButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		fourButton.setBounds(115, 211, 80, 38);
		frame.getContentPane().add(fourButton);
		
		fiveButton = new JButton("5");
		fiveButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				fiveButton.setBackground(Color.GRAY);
			}
			public void mouseExited(java.awt.event.MouseEvent evt) {
				fiveButton.setBackground(Color.DARK_GRAY);
			}
		});
		fiveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "5");
			}
		});
		fiveButton.setFocusPainted(false);
		fiveButton.setBorder(null);
		fiveButton.setForeground(Color.WHITE);
		fiveButton.setBackground(Color.DARK_GRAY);
		fiveButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		fiveButton.setBounds(205, 211, 80, 38);
		frame.getContentPane().add(fiveButton);
		
		sixButton = new JButton("6");
		sixButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				sixButton.setBackground(Color.GRAY);
			}
			public void mouseExited(java.awt.event.MouseEvent evt) {
				sixButton.setBackground(Color.DARK_GRAY);
			}
		});
		sixButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = textField.getText();
					textField.setText(textField.getText() + "6");
			}
		});
		sixButton.setFocusPainted(false);
		sixButton.setBorder(null);
		sixButton.setForeground(Color.WHITE);
		sixButton.setBackground(Color.DARK_GRAY);
		sixButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		sixButton.setBounds(295, 211, 80, 38);
		frame.getContentPane().add(sixButton);
		
		subButton = new JButton("-");
		subButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				subButton.setBackground(Color.GRAY);
				subButton.setForeground(Color.WHITE);
			}
			public void mouseExited(java.awt.event.MouseEvent evt) {
				subButton.setBackground(Color.DARK_GRAY);
				subButton.setForeground(Color.GRAY);
			}
		});
		subButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = lblNewLabel.getText();
				if(textField.getText().length() > 0) {
				textField.setText(textField.getText() + " - ");
				if(!s.isEmpty()) {
					textField.setText(s + " - ");
				}
				pointIsPressed = false;
				}
			}
		});
		subButton.setFocusPainted(false);
		subButton.setBorder(null);
		subButton.setForeground(Color.GRAY);
		subButton.setBackground(Color.DARK_GRAY);
		subButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		subButton.setBounds(385, 211, 80, 38);
		frame.getContentPane().add(subButton);
		
		oneButton = new JButton("1");
		oneButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				oneButton.setBackground(Color.GRAY);
			}
			public void mouseExited(java.awt.event.MouseEvent evt) {
				oneButton.setBackground(Color.DARK_GRAY);
			}
		});
		oneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "1");
			}
		});
		oneButton.setFocusPainted(false);
		oneButton.setBorder(null);
		oneButton.setForeground(Color.WHITE);
		oneButton.setBackground(Color.DARK_GRAY);
		oneButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		oneButton.setBounds(115, 260, 80, 38);
		frame.getContentPane().add(oneButton);
		
		twoButton = new JButton("2");
		twoButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				twoButton.setBackground(Color.GRAY);
			}
			public void mouseExited(java.awt.event.MouseEvent evt) {
				twoButton.setBackground(Color.DARK_GRAY);
			}
		});
		twoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "2");
			}
		});
		twoButton.setFocusPainted(false);
		twoButton.setBorder(null);
		twoButton.setForeground(Color.WHITE);
		twoButton.setBackground(Color.DARK_GRAY);
		twoButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		twoButton.setBounds(205, 260, 80, 38);
		frame.getContentPane().add(twoButton);
		
		threeButton = new JButton("3");
		threeButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				threeButton.setBackground(Color.GRAY);
			}
			public void mouseExited(java.awt.event.MouseEvent evt) {
				threeButton.setBackground(Color.DARK_GRAY);
			}
		});
		threeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "3");
			}
		});
		threeButton.setFocusPainted(false);
		threeButton.setBorder(null);
		threeButton.setBackground(Color.DARK_GRAY);
		threeButton.setForeground(Color.WHITE);
		threeButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		threeButton.setBounds(295, 260, 80, 38);
		frame.getContentPane().add(threeButton);
		
		addButton = new JButton("+");
		addButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				addButton.setBackground(Color.GRAY);
				addButton.setForeground(Color.WHITE);
				
			}
			public void mouseExited(java.awt.event.MouseEvent evt) {
				addButton.setBackground(Color.DARK_GRAY);
				addButton.setForeground(Color.GRAY);
			}
		});
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = lblNewLabel.getText();
				if(textField.getText().length() > 0) {
				textField.setText(textField.getText() + " + ");
				if(!s.isEmpty()) {
					textField.setText(s + " + ");
				}
				pointIsPressed = false;
				}
			}
		});
		addButton.setFocusPainted(false);
		addButton.setBorder(null);
		addButton.setForeground(Color.GRAY);
		addButton.setBackground(Color.DARK_GRAY);
		addButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		addButton.setBounds(385, 260, 80, 38);
		frame.getContentPane().add(addButton);
		
		zeroButton = new JButton("0");
		zeroButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				zeroButton.setBackground(Color.GRAY);
			}
			public void mouseExited(java.awt.event.MouseEvent evt) {
				zeroButton.setBackground(Color.DARK_GRAY);
			}
		});
		zeroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = textField.getText();
				if(!s.contains("=")) {
					textField.setText(textField.getText() + "0");
				}
				else {
					
				}

			}
		});
		zeroButton.setFocusPainted(false);
		zeroButton.setBorder(null);
		zeroButton.setForeground(Color.WHITE);
		zeroButton.setBackground(Color.DARK_GRAY);
		zeroButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		zeroButton.setBounds(115, 309, 170, 38);
		frame.getContentPane().add(zeroButton);
		
		pointButton = new JButton(".");
		pointButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				pointButton.setBackground(Color.GRAY);
			}
			public void mouseExited(java.awt.event.MouseEvent evt) {
				pointButton.setBackground(Color.DARK_GRAY);
			}
		});
		pointButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!pointIsPressed) {
					String s = textField.getText();
						textField.setText(textField.getText() + ".");

				pointIsPressed = true;
				}
			}
		});
		pointButton.setFocusPainted(false);
		pointButton.setBorder(null);
		pointButton.setBackground(Color.DARK_GRAY);
		pointButton.setForeground(Color.WHITE);
		pointButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		pointButton.setBounds(295, 309, 80, 38);
		frame.getContentPane().add(pointButton);
		
		equalButton = new JButton("=");
		equalButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				equalButton.setBackground(Color.ORANGE);
			}
			public void mouseExited(java.awt.event.MouseEvent evt) {
				equalButton.setBackground(Color.GREEN);
			}
		});
		equalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().length() > 0) {
				ScriptEngineManager mgr = new ScriptEngineManager();
				ScriptEngine engine = mgr.getEngineByName("JavaScript");
				double i;
				try {
					i = ((Number)engine.eval(textField.getText())).doubleValue();
					lblNewLabel.setText(Double.toString(i));
					}
					catch(ScriptException e1){
					//e1.printStackTrace();
						textField.setText("0.");
					}
				
				}
				else {
					textField.setText(textField.getText());
				}
			}
		});
		equalButton.setFocusPainted(false);
		equalButton.setBorder(null);
		equalButton.setForeground(Color.WHITE);
		equalButton.setBackground(Color.GREEN);
		equalButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		equalButton.setBounds(385, 309, 80, 38);
		frame.getContentPane().add(equalButton);
		
		
	}
}
