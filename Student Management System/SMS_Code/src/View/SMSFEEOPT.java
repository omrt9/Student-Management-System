package View;
import Controller.*;
import Model.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;



import java.awt.Font;


public class SMSFEEOPT extends JFrame {

	private JPanel contentPane;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	ButtonGroup grp = new ButtonGroup(); 
	SMSFEEOPTListener l;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SMSFEEOPT frame = new SMSFEEOPT();
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
	public SMSFEEOPT() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 731, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\IET.jpg"));
		lblNewLabel.setBounds(0, -80, 715, 449);
		contentPane.add(lblNewLabel);
		
		rdbtnNewRadioButton = new JRadioButton("RECORD STUDENT'S FEE");
		rdbtnNewRadioButton.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setBounds(149, 234, 413, 31);
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("SEARCH INDIVIDUAL FEE STATUS");
		rdbtnNewRadioButton_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1.setBounds(173, 284, 378, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		grp.add(rdbtnNewRadioButton);
		grp.add(rdbtnNewRadioButton_1);
		
		l = new SMSFEEOPTListener(this);
		rdbtnNewRadioButton.addActionListener(l);
		rdbtnNewRadioButton_1.addActionListener(l);
	}
	
	public String getRdbtnNewRadioButton() {
		return rdbtnNewRadioButton.getText();
	}

	public String getRdbtnNewRadioButton_1() {
		return rdbtnNewRadioButton_1.getText();
	}
}
