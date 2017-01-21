package View;
import Controller.*;
import Model.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JButton;



public class SMSGRADEGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtAcademicDetails;
	private JTextField txtRollNo;
	private JTextField textField;
	private JTextField txtName;
	private JTextField textField_1;
	public JTextArea jta;
	JScrollPane jsp;
	SMSGRADEListener l;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SMSGRADEGUI frame = new SMSGRADEGUI();
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
	public SMSGRADEGUI() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1090, 936);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		jta = new JTextArea(10,20);
		jta.setVisible(true);
		jsp = new JScrollPane(jta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		jta.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		jsp.setBounds(100, 308, 1700, 550);
		
		jsp.setVisible(true);
		contentPane.add(jsp);
		
		txtAcademicDetails = new JTextField();
		txtAcademicDetails.setBackground(Color.GRAY);
		txtAcademicDetails.setText("ACADEMIC DETAILS");
		txtAcademicDetails.setHorizontalAlignment(SwingConstants.CENTER);
		txtAcademicDetails.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtAcademicDetails.setEditable(false);
		txtAcademicDetails.setBounds(445, 25, 175, 28);
		contentPane.add(txtAcademicDetails);
		txtAcademicDetails.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_1.setBounds(413, 149, 464, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtName.setEditable(false);
		txtName.setText("NAME");
		txtName.setHorizontalAlignment(SwingConstants.CENTER);
		txtName.setBounds(246, 149, 86, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JButton btnNewButton = new JButton("GO");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnNewButton.setBounds(812, 105, 65, 23);
		contentPane.add(btnNewButton);
		
		txtRollNo = new JTextField();
		txtRollNo.setHorizontalAlignment(SwingConstants.CENTER);
		txtRollNo.setEditable(false);
		txtRollNo.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtRollNo.setText("ROLL NO");
		txtRollNo.setBounds(246, 106, 86, 20);
		contentPane.add(txtRollNo);
		txtRollNo.setColumns(10);
		
		textField = new JTextField();
		textField.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField.setText("");
		textField.setBounds(413, 106, 298, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		l = new SMSGRADEListener(this);
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

	
}


