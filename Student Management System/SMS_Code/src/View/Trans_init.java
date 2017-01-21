package View;
import Controller.*;
import Model.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JButton;




public class Trans_init extends JFrame {

	private JPanel contentPane;
	private JTextField txtForTranscriptGeneration;
	private JTextField txtRollNo;
	private JTextField textField_1;
	private Trans_listener ti;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Trans_init frame = new Trans_init();
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
	public Trans_init() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtForTranscriptGeneration = new JTextField();
		txtForTranscriptGeneration.setEditable(false);
		txtForTranscriptGeneration.setText("FOR TRANSCRIPT GENERATION");
		txtForTranscriptGeneration.setHorizontalAlignment(SwingConstants.CENTER);
		txtForTranscriptGeneration.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtForTranscriptGeneration.setBounds(87, 53, 292, 38);
		contentPane.add(txtForTranscriptGeneration);
		txtForTranscriptGeneration.setColumns(10);
		
		txtRollNo = new JTextField();
		txtRollNo.setEditable(false);
		txtRollNo.setText("ROLL NO");
		txtRollNo.setHorizontalAlignment(SwingConstants.CENTER);
		txtRollNo.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtRollNo.setBounds(71, 170, 111, 31);
		contentPane.add(txtRollNo);
		txtRollNo.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_1.setBounds(240, 170, 275, 25);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 649, 393);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("GO");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnNewButton.setBounds(206, 282, 89, 23);
		contentPane.add(btnNewButton);
		
		
	   ti = new Trans_listener(this);
	   btnNewButton.addActionListener(ti);
	}
	
	
    public String getTextField_1() {
		return textField_1.getText();
	}

	public void setTextField_1(String t1) {
			textField_1.setText(t1);
	}

}

