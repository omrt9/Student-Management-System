package View;
import Controller.*;
import Model.*;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;




public class SMSMODDEL extends JFrame {

	private JPanel contentPane;
	private JTextField txtJeeMainRoll;
	private JTextField textField;
	private JTextField txtStudentProfile;
	private JTextField txtStudentsName;
	private JTextField textField_1;
	private JTextField txtFathersName;
	private JTextField textField_2;
	private JTextField txtMothersName;
	private JTextField textField_3;
	private JTextField txtGender;
	private JTextField textField_4;
	private JTextField txtAddress;
	private JTextField textField_5;
	private JTextField txtContactNumber;
	private JTextField textField_6;
	private JTextField txtBloodGrop;
	private JTextField textField_7;
	private JTextField txtEmailId;
	private JTextField textField_8;
	private JTextField txtAcademicDetails;
	private JTextField txtAcpcRank;
	private JTextField textField_9;
	private JTextField txtPcmTheoryMarks;
	private JTextField textField_10;
	private JTextField txtPamTheoryPercentile;
	private JTextField textField_11;
	private JTextField txtJeeMainScore;
	private JTextField textField_12;
	private JTextField txtJeeMainPercentile;
	private JTextField textField_13;
	private JTextField txtOverallPercentile;
	private JTextField textField_14;
	private JTextField txtCategory;
	private JTextField txtBranch;
	private JTextField txtAdmissionQuota;
	private JTextField txtSchoolName;
	private JTextField textField_15;
	private JTextField txtBoard;
	private JTextField textField_16;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JTextField txtDateOfBirth;
	private JTextField textField_17;
	private SMSMODDELListener l;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SMSMODDEL frame = new SMSMODDEL();
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
	public SMSMODDEL() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("GO");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(1608, 36, 80, 36);
		contentPane.add(btnNewButton);
		
		txtJeeMainRoll = new JTextField();
		txtJeeMainRoll.setEditable(false);
		txtJeeMainRoll.setHorizontalAlignment(SwingConstants.CENTER);
		txtJeeMainRoll.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		txtJeeMainRoll.setText("TEMP ROLL NO");
		txtJeeMainRoll.setBounds(349, 36, 272, 41);
		contentPane.add(txtJeeMainRoll);
		txtJeeMainRoll.setColumns(10);
		
		txtStudentsName = new JTextField();
		txtStudentsName.setEditable(false);
		txtStudentsName.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtStudentsName.setText("STUDENT'S NAME");
		txtStudentsName.setBounds(127, 197, 180, 20);
		contentPane.add(txtStudentsName);
		txtStudentsName.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_1.setBounds(415, 199, 360, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_2.setBounds(415, 230, 360, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_3.setBounds(415, 261, 360, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_4.setBounds(415, 292, 360, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_5.setBounds(415, 323, 360, 46);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_6.setBounds(415, 386, 213, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_7.setBounds(415, 417, 86, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(415, 448, 348, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_9.setBounds(1495, 197, 169, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_10.setBounds(1495, 230, 169, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_11.setBounds(1495, 263, 224, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_12.setBounds(1495, 294, 169, 20);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(1495, 323, 224, 20);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		txtBranch = new JTextField();
		txtBranch.setEditable(false);
		txtBranch.setText("BRANCH");
		txtBranch.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtBranch.setBounds(1147, 417, 213, 20);
		contentPane.add(txtBranch);
		txtBranch.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_14.setBounds(1495, 354, 224, 20);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		txtSchoolName = new JTextField();
		txtSchoolName.setText("SCHOOL NAME");
		txtSchoolName.setEditable(false);
		txtSchoolName.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtSchoolName.setBounds(1147, 479, 213, 20);
		contentPane.add(txtSchoolName);
		txtSchoolName.setColumns(10);
		
		txtAdmissionQuota = new JTextField();
		txtAdmissionQuota.setEditable(false);
		txtAdmissionQuota.setText("ADMISSION QUOTA");
		txtAdmissionQuota.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtAdmissionQuota.setBounds(1147, 448, 213, 20);
		contentPane.add(txtAdmissionQuota);
		txtAdmissionQuota.setColumns(10);
		
		txtCategory = new JTextField();
		txtCategory.setText("CATEGORY");
		txtCategory.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtCategory.setEditable(false);
		txtCategory.setBounds(1147, 386, 213, 20);
		contentPane.add(txtCategory);
		txtCategory.setColumns(10);
		
		txtOverallPercentile = new JTextField();
		txtOverallPercentile.setText("OVERALL PERCENTILE");
		txtOverallPercentile.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtOverallPercentile.setEditable(false);
		txtOverallPercentile.setBounds(1147, 354, 213, 20);
		contentPane.add(txtOverallPercentile);
		txtOverallPercentile.setColumns(10);
		
		txtJeeMainPercentile = new JTextField();
		txtJeeMainPercentile.setText("JEE MAIN PERCENTILE");
		txtJeeMainPercentile.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtJeeMainPercentile.setEditable(false);
		txtJeeMainPercentile.setBounds(1147, 323, 213, 20);
		contentPane.add(txtJeeMainPercentile);
		txtJeeMainPercentile.setColumns(10);
		
		txtJeeMainScore = new JTextField();
		txtJeeMainScore.setText("JEE MAIN SCORE");
		txtJeeMainScore.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtJeeMainScore.setEditable(false);
		txtJeeMainScore.setBounds(1147, 294, 180, 20);
		contentPane.add(txtJeeMainScore);
		txtJeeMainScore.setColumns(10);
		
		txtPamTheoryPercentile = new JTextField();
		txtPamTheoryPercentile.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtPamTheoryPercentile.setEditable(false);
		txtPamTheoryPercentile.setText("PCM THEORY PERCENTILE");
		txtPamTheoryPercentile.setBounds(1147, 263, 213, 20);
		contentPane.add(txtPamTheoryPercentile);
		txtPamTheoryPercentile.setColumns(10);
		
		txtPcmTheoryMarks = new JTextField();
		txtPcmTheoryMarks.setText("PCM THEORY MARKS");
		txtPcmTheoryMarks.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtPcmTheoryMarks.setEditable(false);
		txtPcmTheoryMarks.setBounds(1147, 232, 180, 20);
		contentPane.add(txtPcmTheoryMarks);
		txtPcmTheoryMarks.setColumns(10);
		
		txtAcademicDetails = new JTextField();
		txtAcademicDetails.setBackground(Color.GRAY);
		txtAcademicDetails.setText("ACADEMIC DETAILS");
		txtAcademicDetails.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		txtAcademicDetails.setEditable(false);
		txtAcademicDetails.setBounds(1046, 115, 200, 36);
		contentPane.add(txtAcademicDetails);
		txtAcademicDetails.setColumns(10);
		
		txtEmailId = new JTextField();
		txtEmailId.setEditable(false);
		txtEmailId.setText("EMAIL ID");
		txtEmailId.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtEmailId.setBounds(127, 446, 180, 20);
		contentPane.add(txtEmailId);
		txtEmailId.setColumns(10);
		
		txtBloodGrop = new JTextField();
		txtBloodGrop.setEditable(false);
		txtBloodGrop.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtBloodGrop.setText("BLOOD GROUP");
		txtBloodGrop.setBounds(127, 415, 180, 20);
		contentPane.add(txtBloodGrop);
		txtBloodGrop.setColumns(10);
		
		txtContactNumber = new JTextField();
		txtContactNumber.setEditable(false);
		txtContactNumber.setText("CONTACT NUMBER");
		txtContactNumber.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtContactNumber.setBounds(127, 384, 180, 20);
		contentPane.add(txtContactNumber);
		txtContactNumber.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setText("ADDRESS");
		txtAddress.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtAddress.setEditable(false);
		txtAddress.setBounds(127, 321, 180, 20);
		contentPane.add(txtAddress);
		txtAddress.setColumns(10);
		
		txtGender = new JTextField();
		txtGender.setEditable(false);
		txtGender.setText("GENDER");
		txtGender.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtGender.setBounds(127, 290, 180, 20);
		contentPane.add(txtGender);
		txtGender.setColumns(10);
		
		txtMothersName = new JTextField();
		txtMothersName.setText("MOTHER'S NAME");
		txtMothersName.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtMothersName.setEditable(false);
		txtMothersName.setBounds(127, 259, 180, 20);
		contentPane.add(txtMothersName);
		txtMothersName.setColumns(10);
		
		txtStudentProfile = new JTextField();
		txtStudentProfile.setBackground(Color.GRAY);
		txtStudentProfile.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		txtStudentProfile.setText("STUDENT DETAILS");
		txtStudentProfile.setBounds(53, 115, 194, 36);
		contentPane.add(txtStudentProfile);
		txtStudentProfile.setColumns(10);
		
		txtFathersName = new JTextField();
		txtFathersName.setText("FATHER'S NAME");
		txtFathersName.setEditable(false);
		txtFathersName.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtFathersName.setBounds(127, 228, 180, 20);
		contentPane.add(txtFathersName);
		txtFathersName.setColumns(10);
		
		txtAcpcRank = new JTextField();
		txtAcpcRank.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtAcpcRank.setEditable(false);
		txtAcpcRank.setText("ACPC RANK");
		txtAcpcRank.setBounds(1147, 197, 135, 20);
		contentPane.add(txtAcpcRank);
		txtAcpcRank.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(1495, 479, 296, 20);
		contentPane.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_16.setBounds(1495, 512, 169, 20);
		contentPane.add(textField_16);
		textField_16.setColumns(10);
		
		txtBoard = new JTextField();
		txtBoard.setText("BOARD");
		txtBoard.setEditable(false);
		txtBoard.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtBoard.setBounds(1147, 510, 213, 20);
		contentPane.add(txtBoard);
		txtBoard.setColumns(10);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		textField.setBounds(701, 36, 816, 41);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_13.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"...............................................", "General", "SEBC", "DS", "SC", "ST"}));
		comboBox.setBounds(1495, 386, 169, 20);
		contentPane.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"..............................................", "ICT", "Mech", "Chem"}));
		comboBox_1.setBounds(1495, 417, 169, 20);
		contentPane.add(comboBox_1);
		
		btnNewButton_1 = new JButton("MODIFY STUDENT");
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnNewButton_1.setBounds(1577, 597, 200, 57);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("DELETE STUDENT");
		btnNewButton_2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnNewButton_2.setBounds(1577, 660, 200, 57);
		contentPane.add(btnNewButton_2);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"..................................................", "OPEN", "TFWS", "NRI Sponsered"}));
		comboBox_2.setBounds(1495, 448, 169, 20);
		contentPane.add(comboBox_2);
		
		txtDateOfBirth = new JTextField();
		txtDateOfBirth.setEditable(false);
		txtDateOfBirth.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtDateOfBirth.setText("DATE OF BIRTH");
		txtDateOfBirth.setBounds(127, 481, 180, 20);
		contentPane.add(txtDateOfBirth);
		txtDateOfBirth.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_17.setBounds(415, 483, 180, 20);
		contentPane.add(textField_17);
		textField_17.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel.setIcon(new ImageIcon("C:\\FINALIMG2.png"));
		lblNewLabel.setBounds(-108, 0, 2050, 1080);
		contentPane.add(lblNewLabel);
		
		l = new SMSMODDELListener(this);
		btnNewButton.addActionListener(l);
		btnNewButton_1.addActionListener(l);
		btnNewButton_2.addActionListener(l);

		
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

	public void setTextField_1(String t1) {
		textField_1.setText(t1);
	}
	
	public String getTextField_2() {
		return textField_2.getText();
	}

	public void setTextField_3(String t) {
		textField_3.setText(t);
	}
	
	public String getTextField_4() {
		return textField_4.getText();
	}

	public void setTextField_4(String t) {
		textField_4.setText(t);
	}
	
	public String getTextField_5() {
		return textField_5.getText();
	}

	public void setTextField_5(String t) {
		textField_5.setText(t);
	}
	
	public String getTextField_6() {
		return textField_6.getText();
	}

	public void setTextField_6(String t) {
		textField_6.setText(t);
	}
	
	public String getTextField_7() {
		return textField_7.getText();
	}

	public void setTextField_7(String t) {
		textField_7.setText(t);
	}
	
	public String getTextField_8() {
		return textField_8.getText();
	}

	public void setTextField_8(String t) {
		textField_8.setText(t);
	}
	
	public String getTextField_9() {
		return textField_9.getText();
	}

	public void setTextField_9(String t) {
		textField_9.setText(t);
	}
	
	public String getTextField_10() {
		return textField_10.getText();
	}

	public void setTextField_10(String t) {
		textField_10.setText(t);
	}
	
	public String getTextField_11() {
		return textField_11.getText();
	}

	public void setTextField_11(String t) {
		textField_11.setText(t);
	}
	
	public String getTextField_12() {
		return textField_12.getText();
	}

	public void setTextField_12(String t) {
		textField_12.setText(t);
	}
	
	public String getTextField_13() {
		return textField_13.getText();
	}

	public void setTextField_13(String t) {
		textField_13.setText(t);
	}
	
	public String getTextField_14() {
		return textField_14.getText();
	}

	public void setTextField_14(String t) {
		textField_14.setText(t);
	}
	
	public String getTextField_15() {
		return textField_15.getText();
	}

	public void setTextField_15(String t) {
		textField_15.setText(t);
	}
	
	public String getTextField_16() {
		return textField_16.getText();
	}

	public void setTextField_16(String t) {
		textField_16.setText(t);
	}
	
	public String getTextField_17() {
		return textField_17.getText();
	}

	public void setTextField_17(String t) {
		textField_17.setText(t);
	}
	
	public String gettype()
	{
		return (String) comboBox.getSelectedItem();
	}
	
	public String gettype1()
	{
		return (String) comboBox_1.getSelectedItem();
	}
	
	public String gettype2()
	{
		return (String) comboBox_2.getSelectedItem();
	}
}
