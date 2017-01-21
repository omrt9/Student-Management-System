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
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;


public class Transscript extends JFrame {

	private JPanel contentPane;
	private JTextField txtCandidateName;
	private JTextField textField;
	private JTextField txtTranscriptCertificate;
	private JTextField txtSignatureOfDean;
	private JTextField txtCandidateFaculty;
	private JTextField textField_1;
	private JTextField txtCandidateNumber;
	private JTextField textField_2;
	private JTextField txtCollegeForHigher;
	private JTextField textField_3;
	private JTextField txtStampOfCollege;
	private JTextField txtSubjectname;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField txtSubjectcode;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField txtCgpa;
	private JTextField textField_17;
	private JTextField txtRanking;
	private JTextField textField_21;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transscript frame = new Transscript();
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
	public Transscript() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1521, 1092);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtCandidateName = new JTextField();
		txtCandidateName.setEditable(false);
		txtCandidateName.setText("CANDIDATE NAME");
		txtCandidateName.setHorizontalAlignment(SwingConstants.CENTER);
		txtCandidateName.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtCandidateName.setBounds(294, 298, 167, 28);
		contentPane.add(txtCandidateName);
		txtCandidateName.setColumns(10);
		
		textField = new JTextField();
		textField.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField.setBounds(540, 298, 386, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtTranscriptCertificate = new JTextField();
		txtTranscriptCertificate.setEditable(false);
		txtTranscriptCertificate.setHorizontalAlignment(SwingConstants.CENTER);
		txtTranscriptCertificate.setText("Transcript Certificate");
		txtTranscriptCertificate.setFont(new Font("Monotype Corsiva", Font.BOLD, 44));
		txtTranscriptCertificate.setBounds(397, 142, 700, 86);
		contentPane.add(txtTranscriptCertificate);
		txtTranscriptCertificate.setColumns(10);
		
		txtCandidateFaculty = new JTextField();
		txtCandidateFaculty.setEditable(false);
		txtCandidateFaculty.setText("CANDIDATE FACULTY");
		txtCandidateFaculty.setHorizontalAlignment(SwingConstants.CENTER);
		txtCandidateFaculty.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtCandidateFaculty.setBounds(281, 398, 180, 28);
		contentPane.add(txtCandidateFaculty);
		txtCandidateFaculty.setColumns(10);
		
		txtSignatureOfDean = new JTextField();
		txtSignatureOfDean.setEditable(false);
		txtSignatureOfDean.setText("SIGNATURE OF DEAN");
		txtSignatureOfDean.setHorizontalAlignment(SwingConstants.CENTER);
		txtSignatureOfDean.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtSignatureOfDean.setBounds(591, 1017, 201, 20);
		contentPane.add(txtSignatureOfDean);
		txtSignatureOfDean.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(540, 400, 386, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		txtCandidateNumber = new JTextField();
		txtCandidateNumber.setEditable(false);
		txtCandidateNumber.setText("CANDIDATE NUMBER");
		txtCandidateNumber.setHorizontalAlignment(SwingConstants.CENTER);
		txtCandidateNumber.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtCandidateNumber.setBounds(281, 447, 180, 28);
		contentPane.add(txtCandidateNumber);
		txtCandidateNumber.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(540, 447, 386, 28);
		contentPane.add(textField_2);
		
		txtStampOfCollege = new JTextField();
		txtStampOfCollege.setText("STAMP OF COLLEGE");
		txtStampOfCollege.setHorizontalAlignment(SwingConstants.CENTER);
		txtStampOfCollege.setEditable(false);
		txtStampOfCollege.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtStampOfCollege.setBounds(1000, 1017, 214, 20);
		contentPane.add(txtStampOfCollege);
		txtStampOfCollege.setColumns(10);
		
		txtCollegeForHigher = new JTextField();
		txtCollegeForHigher.setText("COLLEGE FOR HIGHER STUDIES");
		txtCollegeForHigher.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtCollegeForHigher.setHorizontalAlignment(SwingConstants.CENTER);
		txtCollegeForHigher.setEditable(false);
		txtCollegeForHigher.setBounds(170, 347, 291, 28);
		contentPane.add(txtCollegeForHigher);
		txtCollegeForHigher.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(540, 349, 386, 28);
		contentPane.add(textField_3);
		
		txtSubjectname = new JTextField();
		txtSubjectname.setHorizontalAlignment(SwingConstants.CENTER);
		txtSubjectname.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtSubjectname.setEditable(false);
		txtSubjectname.setText("SEMSETER");
		txtSubjectname.setBounds(186, 586, 98, 20);
		contentPane.add(txtSubjectname);
		txtSubjectname.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setText("1");
		textField_5.setBounds(198, 640, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setText("2");
		textField_6.setBounds(198, 680, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		txtSubjectcode = new JTextField();
		txtSubjectcode.setHorizontalAlignment(SwingConstants.CENTER);
		txtSubjectcode.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtSubjectcode.setEditable(false);
		txtSubjectcode.setText("GPA");
		txtSubjectcode.setBounds(363, 586, 86, 20);
		contentPane.add(txtSubjectcode);
		txtSubjectcode.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(363, 640, 86, 20);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(363, 680, 86, 20);
		contentPane.add(textField_10);
		
		txtCgpa = new JTextField();
		txtCgpa.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtCgpa.setHorizontalAlignment(SwingConstants.CENTER);
		txtCgpa.setEditable(false);
		txtCgpa.setText("CGPA");
		txtCgpa.setColumns(10);
		txtCgpa.setBounds(591, 633, 86, 27);
		contentPane.add(txtCgpa);
		
		textField_17 = new JTextField();
		textField_17.setText(" ");
		textField_17.setColumns(10);
		textField_17.setBounds(706, 640, 86, 20);
		contentPane.add(textField_17);
		
		txtRanking = new JTextField();
		txtRanking.setHorizontalAlignment(SwingConstants.CENTER);
		txtRanking.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtRanking.setEditable(false);
		txtRanking.setText("RANKING");
		txtRanking.setColumns(10);
		txtRanking.setBounds(306, 801, 180, 20);
		contentPane.add(txtRanking);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(591, 801, 86, 20);
		contentPane.add(textField_21);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\IET.jpg"));
		label.setBounds(10, -894, 1883, 1956);
		contentPane.add(label);
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
	
	public String getTextField_3() {
		return textField_3.getText();
	}

	public void setTextField_3(String t) {
		textField_3.setText(t);
	}
	
	public String getTextField_2() {
		return textField_2.getText();
	}

	public void setTextField_2(String t) {
		textField_2.setText(t);
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
	
	public String getTextField_17() {
		return textField_17.getText();
	}

	public void setTextField_17(String t) {
		textField_17.setText(t);
	}







}

