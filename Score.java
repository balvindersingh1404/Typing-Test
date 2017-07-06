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


public class Score extends JFrame {
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JTextField textField_4;
	public JTextField textField_5;
	
		
	
	public Score() {
		setResizable(false);
		getContentPane().setBackground(new Color(255, 228, 196));
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 80, 662, 600);
		this.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Blind-Typing");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setBounds(201, 33, 340, 52);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(new Color(135, 206, 250));
		textField.setEditable(false);
		textField.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		textField.setBounds(269, 134, 272, 34);
		getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText(null);
		
		JLabel lblUserName = new JLabel("TECH_ID");
		lblUserName.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblUserName.setBounds(134, 134, 137, 32);
		getContentPane().add(lblUserName);
		
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
		textField_1.setBackground(new Color(135, 206, 250));
		textField_1.setEditable(false);
		textField_1.setText((String) null);
		textField_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(269, 196, 272, 34);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(135, 206, 250));
		textField_2.setEditable(false);
		textField_2.setText((String) null);
		textField_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(269, 264, 272, 34);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(135, 206, 250));
		textField_3.setEditable(false);
		textField_3.setText((String) null);
		textField_3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(269, 333, 272, 34);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(135, 206, 250));
		textField_4.setEditable(false);
		textField_4.setText((String) null);
		textField_4.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(269, 397, 272, 34);
		getContentPane().add(textField_4);
		
		JLabel lblScore = new JLabel("SCORE");
		lblScore.setForeground(Color.BLACK);
		lblScore.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblScore.setBounds(134, 470, 137, 32);
		getContentPane().add(lblScore);
		
		textField_5 = new JTextField();
		textField_5.setBackground(new Color(135, 206, 250));
		textField_5.setText((String) null);
		textField_5.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(269, 468, 272, 34);
		getContentPane().add(textField_5);
	}
}
