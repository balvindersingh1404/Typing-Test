import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class Login extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
		
	
	public Login() {
		setResizable(false);
		getContentPane().setBackground(new Color(240, 255, 240));
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 600);
		this.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Blind-Typing");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBackground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setBounds(201, 33, 321, 52);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(new Color(0, 206, 209));
		textField.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		textField.setBounds(269, 134, 272, 34);
		getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText(null);
		
		JLabel lblUserName = new JLabel("TECH_ID");
		lblUserName.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblUserName.setBounds(134, 134, 137, 32);
		getContentPane().add(lblUserName);
		
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBackground(new Color(240, 230, 140));
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//			
				if(textField.getText().equalsIgnoreCase("") ||textField_1.getText().equalsIgnoreCase("") || textField_2.getText().equalsIgnoreCase("") ||textField_3.getText().equalsIgnoreCase("") ||textField_4.getText().equalsIgnoreCase("") )
				{
					textField.setText(null);
					textField_1.setText(null);
					textField_2.setText(null);
					textField_3.setText(null);
					textField_4.setText(null);
				}
				
				else{
					setVisible(false);
					BlindTyping blindTyping=new BlindTyping();
					blindTyping.setVisible(true);
					blindTyping.id=textField.getText();
					blindTyping.name=textField_1.getText();
					blindTyping.email=textField_2.getText();
					blindTyping.branch=textField_3.getText();
					blindTyping.mob=textField_4.getText();
					
				}
			}
		});
		btnRegister.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		btnRegister.setBounds(164, 478, 146, 50);
		getContentPane().add(btnRegister);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(new Color(240, 230, 140));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
			}
		});
		btnReset.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		btnReset.setBounds(388, 478, 146, 50);
		getContentPane().add(btnReset);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblName.setBounds(134, 198, 137, 32);
		getContentPane().add(lblName);
		
		JLabel lblEmailid = new JLabel("EMAIL_ID");
		lblEmailid.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblEmailid.setBounds(134, 266, 137, 32);
		getContentPane().add(lblEmailid);
		
		JLabel lblContactno = new JLabel("BRANCH");
		lblContactno.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblContactno.setBounds(134, 333, 137, 32);
		getContentPane().add(lblContactno);
		
		JLabel lblMobileno = new JLabel("CONTACT");
		lblMobileno.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblMobileno.setBounds(134, 399, 137, 32);
		getContentPane().add(lblMobileno);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(0, 206, 209));
		textField_1.setText((String) null);
		textField_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(269, 196, 272, 34);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(0, 206, 209));
		textField_2.setText((String) null);
		textField_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(269, 264, 272, 34);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(0, 206, 209));
		textField_3.setText((String) null);
		textField_3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(269, 333, 272, 34);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(0, 206, 209));
		textField_4.setText((String) null);
		textField_4.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(269, 397, 272, 34);
		getContentPane().add(textField_4);
	}
}
