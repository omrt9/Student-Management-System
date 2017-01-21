package View;
import Controller.*;
import Model.*;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.Color;

import javax.swing.JTextPane;
import javax.swing.JRadioButton;

import java.awt.SystemColor;

import javax.swing.JButton;



public class SMSMAINGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtWelcomeToStudent;
	private JTextField txtIetAhmedabadUniversity;
	private JRadioButton rdbtnRemoveStudent;
	private JRadioButton rdbtnGrading;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnTranscriptSection;
	private JRadioButton rdbtnSearchStudent;
	private JRadioButton rdbtnModDelStudent;
	private JRadioButton rdbtnMasterTable;
	//private JButton btnNewButton;
	SMSMainListner l;

	
	ButtonGroup grp = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SMSMAINGUI frame = new SMSMAINGUI();
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
	public SMSMAINGUI() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtWelcomeToStudent = new JTextField();
		txtWelcomeToStudent.setBackground(Color.GRAY);
		txtWelcomeToStudent.setText("WELCOME TO STUDENT MANAGEMENT SYSTEM ");
		txtWelcomeToStudent.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcomeToStudent.setFont(new Font("Gadugi", Font.BOLD, 27));
		txtWelcomeToStudent.setEditable(false);
		txtWelcomeToStudent.setBounds(407, 48, 653, 69);
		contentPane.add(txtWelcomeToStudent);
		txtWelcomeToStudent.setColumns(10);
		
		txtIetAhmedabadUniversity = new JTextField();
		txtIetAhmedabadUniversity.setText("IET, AHMEDABAD UNIVERSITY");
		txtIetAhmedabadUniversity.setHorizontalAlignment(SwingConstants.CENTER);
		txtIetAhmedabadUniversity.setBackground(Color.GRAY);
		txtIetAhmedabadUniversity.setEditable(false);
		txtIetAhmedabadUniversity.setFont(new Font("Gadugi", Font.BOLD, 27));
		txtIetAhmedabadUniversity.setBounds(514, 110, 443, 59);
		contentPane.add(txtIetAhmedabadUniversity);
		txtIetAhmedabadUniversity.setColumns(10);
		
		rdbtnRemoveStudent = new JRadioButton("FEE");
		rdbtnRemoveStudent.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnRemoveStudent.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		rdbtnRemoveStudent.setBackground(SystemColor.activeCaption);
		rdbtnRemoveStudent.setBounds(599, 389, 300, 38);
		grp.add(rdbtnRemoveStudent);
		contentPane.add(rdbtnRemoveStudent);
		
		rdbtnGrading = new JRadioButton("GRADING");
		rdbtnGrading.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnGrading.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		rdbtnGrading.setBackground(SystemColor.activeCaption);
		rdbtnGrading.setBounds(599, 440, 300, 38);
		grp.add(rdbtnGrading);
		contentPane.add(rdbtnGrading);
		
		rdbtnNewRadioButton = new JRadioButton("ENROLL STUDENT");
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setBackground(SystemColor.activeCaption);
		rdbtnNewRadioButton.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		rdbtnNewRadioButton.setBounds(599, 337, 300, 38);
		grp.add(rdbtnNewRadioButton);
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnTranscriptSection = new JRadioButton("TRANSCRIPT SECTION\r\n");
		rdbtnTranscriptSection.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnTranscriptSection.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		rdbtnTranscriptSection.setBackground(SystemColor.activeCaption);
		rdbtnTranscriptSection.setBounds(599, 493, 300, 38);
		grp.add(rdbtnTranscriptSection);
		contentPane.add(rdbtnTranscriptSection);
		
		rdbtnSearchStudent = new JRadioButton("SEARCH STUDENT");
		rdbtnSearchStudent.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnSearchStudent.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		rdbtnSearchStudent.setBackground(SystemColor.activeCaption);
		rdbtnSearchStudent.setBounds(599, 546, 300, 38);
		grp.add(rdbtnSearchStudent);
		//contentPane.add(rdbtnSearchStudent);
		
		rdbtnModDelStudent = new JRadioButton("MODIFY/DELETE STUDENT");
		rdbtnModDelStudent.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnModDelStudent.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		rdbtnModDelStudent.setBackground(SystemColor.activeCaption);
		rdbtnModDelStudent.setBounds(599, 546, 300, 38);
		grp.add(rdbtnModDelStudent);
		contentPane.add(rdbtnModDelStudent);
		
		
		rdbtnMasterTable = new JRadioButton("GENERATE FINAL LIST");
		rdbtnMasterTable.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnMasterTable.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		rdbtnMasterTable.setBackground(SystemColor.activeCaption);
		rdbtnMasterTable.setBounds(599, 599, 300, 38);
		grp.add(rdbtnMasterTable);
		contentPane.add(rdbtnMasterTable);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\IET.jpg"));
		lblNewLabel_1.setBounds(1062, 152, 224, 104);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Gadugi", Font.BOLD, 27));
		lblNewLabel.setIcon(new ImageIcon("C:\\FINALIMG2.png"));
		lblNewLabel.setBounds(0, 0, 1920, 1080);
		contentPane.add(lblNewLabel);
		
		l = new SMSMainListner(this);
		rdbtnRemoveStudent.addActionListener(l);
		rdbtnGrading.addActionListener(l);
		rdbtnNewRadioButton.addActionListener(l);
		rdbtnTranscriptSection.addActionListener(l);
		rdbtnSearchStudent.addActionListener(l);
		rdbtnMasterTable.addActionListener(l);
		rdbtnModDelStudent.addActionListener(l);
		//btnNewButton.addActionListener(l);
		
	}
	
	public String getRdbtnRemoveStudent() {
		return rdbtnRemoveStudent.getText();
	}

	public String getRdbtnGrading() {
		return rdbtnGrading.getText();
	}

	public String getRdbtnNewRadioButton() {
		return rdbtnNewRadioButton.getText();
	}

	public String getRdbtnTranscriptSection() {
		return rdbtnTranscriptSection.getText();
	}

	public String getrdbtnModDelStudent() {
		return rdbtnModDelStudent.getText();
	}

	public String getrdbtnMasterTable() {
		return rdbtnMasterTable.getText();
	}



}
