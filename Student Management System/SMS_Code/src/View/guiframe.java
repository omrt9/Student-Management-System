package View;
import Controller.*;
import Model.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JButton;



public class guiframe extends JFrame {

	private JPanel contentPane;
	private JTextField txtIetahmedabadUniversity;
	private JTextField txtUserid;
	public JTextField textField;
	private JTextField txtPassword;
	public JTextField textField_1;
	public JTextField textField_2;
	private JButton btnNewButton;
	SMSMAINLISTENER1 l;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					guiframe frame = new guiframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public guiframe() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel);
		
		txtIetahmedabadUniversity = new JTextField();
		txtIetahmedabadUniversity.setHorizontalAlignment(SwingConstants.CENTER);
		txtIetahmedabadUniversity.setBackground(Color.LIGHT_GRAY);
		txtIetahmedabadUniversity.setEditable(false);
		txtIetahmedabadUniversity.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtIetahmedabadUniversity.setText("IET-AHMEDABAD UNIVERSITY");
		txtIetahmedabadUniversity.setBounds(84, 22, 259, 36);
		contentPane.add(txtIetahmedabadUniversity);
		txtIetahmedabadUniversity.setColumns(10);
		
		txtUserid = new JTextField();
		txtUserid.setEditable(false);
		txtUserid.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtUserid.setText("USER-ID");
		txtUserid.setBounds(42, 87, 86, 20);
		contentPane.add(txtUserid);
		txtUserid.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(181, 87, 137, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setEditable(false);
		txtPassword.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtPassword.setText("PASSWORD");
		txtPassword.setBounds(42, 145, 100, 20);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(181, 145, 137, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		
		textField_2 = new JTextField();
		textField_2.setBounds(42, 192, 232, 20);
		contentPane.add(textField_2);
		textField_2.setVisible(false);
		textField_2.setColumns(10);
		
		btnNewButton = new JButton("LOGIN");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnNewButton.setBounds(133, 215, 89, 23);
		contentPane.add(btnNewButton);
		
		l = new SMSMAINLISTENER1(this);
		btnNewButton.addActionListener(l);
	}
	
	public String getTextField() {
		return textField.getText();
	}

	public void setTextField(String t) {
		textField.setText(t);
	}
	
	public String getTextField_1() {
		return textField_1.getText();
	}

	public void setTextField_1(String t) {
		textField_1.setText(t);
	}
	
	public void showT()
	{
		textField_2.setVisible(true);
	}
	
	public void hideT()
	{
		textField_2.setVisible(false);
	}
}
