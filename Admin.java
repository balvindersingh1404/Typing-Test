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


public class Admin extends JFrame {
	private JTextField textField;
	private JPasswordField passwordField;
	

	public static void main(String[] args) {
		Admin admin =new Admin();
		admin.setVisible(true);
		
		
	}
	public Admin() {
		getContentPane().setBackground(new Color(0, 153, 204));
		
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 477);
		this.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TECHNOVATION");
		lblNewLabel.setForeground(new Color(220, 20, 60));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(228, 34, 297, 52);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(new Color(135, 206, 250));
		textField.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		textField.setBounds(269, 134, 272, 34);
		getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText(null);
		
		JLabel lblUserName = new JLabel("Admin ");
		lblUserName.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblUserName.setBounds(134, 134, 137, 32);
		getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblPassword.setBounds(134, 206, 137, 32);
		getContentPane().add(lblPassword);
		
		
		JButton btnRegister = new JButton("Login");
		btnRegister.setBackground(new Color(240, 230, 140));
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				if(textField.getText().equalsIgnoreCase("") || passwordField.getText().equalsIgnoreCase(""))
				{
					textField.setText(null);
					passwordField.setText(null);
				}
				
				else if(textField.getText().equals("abc")&&passwordField.getText().equals("abc")){
				    setVisible(false);
					Login login=new Login();
					login.setVisible(true);
					
				}
				else
				{
					textField.setText("Enter Admin Login");
					passwordField.setText(null);
				}
			}
		});
		btnRegister.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		btnRegister.setBounds(156, 293, 146, 50);
		getContentPane().add(btnRegister);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(new Color(240, 230, 140));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				passwordField.setText(null);
				textField.setText(null);
			}
		});
		btnReset.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		btnReset.setBounds(379, 293, 146, 50);
		getContentPane().add(btnReset);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(135, 206, 250));
		passwordField.setEchoChar('*');
		passwordField.setBounds(269, 195, 272, 40);
		getContentPane().add(passwordField);
	}
}
