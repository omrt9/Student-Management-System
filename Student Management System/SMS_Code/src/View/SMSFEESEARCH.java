package View;
import Controller.*;
import Model.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.UIManager;
import javax.swing.JButton;



public class SMSFEESEARCH extends JFrame {

	private JPanel contentPane;
	private JTextField txtFeesDetails;
	private JTextField txtRollNo;
	private JTextField textField;
	private JTextField txtName;
	private JTextField txtContactno;
	private JTextField txtEmailid;
	private JTextField txtSemester;
	private JTextField txtSemester_1;
	private JTextField txtPaymentMode;
	private JTextField textField_5;
	private JTextField txtCheque;
	private JTextField txtNetBanking;
	private JTextField txtInstallment;
	private JTextField txtInstallment_1;
	private JTextField txtNetstatus;
	private JTextField txtCheque_1;
	private JTextField txtNetBanking_1;
	private JTextField txtInstallment_2;
	private JTextField txtInstallment_3;
	private JTextField txtNetStatus;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JButton btnNewButton;
	SMSFEESEARCHLISTENER l;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SMSFEESEARCH frame = new SMSFEESEARCH();
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
	public SMSFEESEARCH() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 937);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtFeesDetails = new JTextField();
		txtFeesDetails.setHorizontalAlignment(SwingConstants.CENTER);
		txtFeesDetails.setText("FEES  DETAILS");
		txtFeesDetails.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		txtFeesDetails.setBounds(560, 11, 166, 39);
		txtFeesDetails.setEditable(false);
		contentPane.add(txtFeesDetails);
		txtFeesDetails.setColumns(10);
		
		txtRollNo = new JTextField();
		txtRollNo.setEditable(false);
		txtRollNo.setText("ROLL NO");
		txtRollNo.setHorizontalAlignment(SwingConstants.CENTER);
		txtRollNo.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtRollNo.setBounds(481, 83, 86, 28);
		contentPane.add(txtRollNo);
		txtRollNo.setColumns(10);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField.setBounds(667, 85, 277, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtName = new JTextField();
		txtName.setEditable(false);
		txtName.setText("NAME");
		txtName.setHorizontalAlignment(SwingConstants.CENTER);
		txtName.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtName.setBounds(481, 139, 86, 26);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtContactno = new JTextField();
		txtContactno.setText("CONTACT_NO");
		txtContactno.setHorizontalAlignment(SwingConstants.CENTER);
		txtContactno.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtContactno.setEditable(false);
		txtContactno.setBounds(441, 189, 126, 28);
		contentPane.add(txtContactno);
		txtContactno.setColumns(10);
		
		txtEmailid = new JTextField();
		txtEmailid.setHorizontalAlignment(SwingConstants.CENTER);
		txtEmailid.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtEmailid.setText("EMAIL_ID");
		txtEmailid.setEditable(false);
		txtEmailid.setBounds(469, 239, 98, 26);
		contentPane.add(txtEmailid);
		txtEmailid.setColumns(10);
		
		txtSemester = new JTextField();
		txtSemester.setText("SEMESTER - 1");
		txtSemester.setHorizontalAlignment(SwingConstants.CENTER);
		txtSemester.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtSemester.setEditable(false);
		txtSemester.setBounds(199, 316, 145, 39);
		contentPane.add(txtSemester);
		txtSemester.setColumns(10);
		
		txtSemester_1 = new JTextField();
		txtSemester_1.setEditable(false);
		txtSemester_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtSemester_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtSemester_1.setText("SEMESTER - 2");
		txtSemester_1.setBounds(943, 298, 145, 44);
		contentPane.add(txtSemester_1);
		txtSemester_1.setColumns(10);
		
		txtPaymentMode = new JTextField();
		txtPaymentMode.setEditable(false);
		txtPaymentMode.setHorizontalAlignment(SwingConstants.CENTER);
		txtPaymentMode.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtPaymentMode.setText("PAYMENT MODE");
		txtPaymentMode.setBounds(81, 395, 145, 28);
		contentPane.add(txtPaymentMode);
		txtPaymentMode.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setText("PAYMENT MODE");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(812, 395, 145, 28);
		contentPane.add(textField_5);
		
		txtCheque = new JTextField();
		txtCheque.setText("CHEQUE");
		txtCheque.setHorizontalAlignment(SwingConstants.CENTER);
		txtCheque.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtCheque.setEditable(false);
		txtCheque.setColumns(10);
		txtCheque.setBounds(81, 448, 145, 28);
		contentPane.add(txtCheque);
		
		txtNetBanking = new JTextField();
		txtNetBanking.setText("LUMPSUM");
		txtNetBanking.setHorizontalAlignment(SwingConstants.CENTER);
		txtNetBanking.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtNetBanking.setEditable(false);
		txtNetBanking.setColumns(10);
		txtNetBanking.setBounds(81, 498, 145, 28);
		contentPane.add(txtNetBanking);
		
		txtInstallment = new JTextField();
		txtInstallment.setText("INSTALLMENT 1");
		txtInstallment.setHorizontalAlignment(SwingConstants.CENTER);
		txtInstallment.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtInstallment.setEditable(false);
		txtInstallment.setColumns(10);
		txtInstallment.setBounds(81, 549, 145, 28);
		contentPane.add(txtInstallment);
		
		txtInstallment_1 = new JTextField();
		txtInstallment_1.setText("INSTALLMENT 2");
		txtInstallment_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtInstallment_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtInstallment_1.setEditable(false);
		txtInstallment_1.setColumns(10);
		txtInstallment_1.setBounds(81, 597, 145, 28);
		contentPane.add(txtInstallment_1);
		
		
		
		txtCheque_1 = new JTextField();
		txtCheque_1.setText("CHEQUE");
		txtCheque_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtCheque_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtCheque_1.setEditable(false);
		txtCheque_1.setColumns(10);
		txtCheque_1.setBounds(812, 448, 145, 28);
		contentPane.add(txtCheque_1);
		
		txtNetBanking_1 = new JTextField();
		txtNetBanking_1.setText("LUMPSUM");
		txtNetBanking_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtNetBanking_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtNetBanking_1.setEditable(false);
		txtNetBanking_1.setColumns(10);
		txtNetBanking_1.setBounds(812, 498, 145, 28);
		contentPane.add(txtNetBanking_1);
		
		txtInstallment_2 = new JTextField();
		txtInstallment_2.setText("INSTALLMENT 1");
		txtInstallment_2.setHorizontalAlignment(SwingConstants.CENTER);
		txtInstallment_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtInstallment_2.setEditable(false);
		txtInstallment_2.setColumns(10);
		txtInstallment_2.setBounds(812, 549, 145, 28);
		contentPane.add(txtInstallment_2);
		
		txtInstallment_3 = new JTextField();
		txtInstallment_3.setText("INSTALLMENT 2");
		txtInstallment_3.setHorizontalAlignment(SwingConstants.CENTER);
		txtInstallment_3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtInstallment_3.setEditable(false);
		txtInstallment_3.setColumns(10);
		txtInstallment_3.setBounds(812, 597, 145, 28);
		contentPane.add(txtInstallment_3);
		
		
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(667, 137, 277, 28);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(667, 189, 277, 28);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(667, 237, 277, 28);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_4.setColumns(10);
		textField_4.setBounds(295, 395, 211, 28);
		contentPane.add(textField_4);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_6.setColumns(10);
		textField_6.setBounds(295, 448, 211, 28);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_7.setColumns(10);
		textField_7.setBounds(295, 498, 211, 28);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_8.setColumns(10);
		textField_8.setBounds(295, 549, 211, 28);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_9.setColumns(10);
		textField_9.setBounds(295, 597, 211, 28);
		contentPane.add(textField_9);
		
		textField_11 = new JTextField();
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_11.setColumns(10);
		textField_11.setBounds(1024, 395, 211, 28);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_12.setColumns(10);
		textField_12.setBounds(1024, 448, 211, 28);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_13.setColumns(10);
		textField_13.setBounds(1024, 498, 211, 28);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_14.setColumns(10);
		textField_14.setBounds(1024, 549, 211, 28);
		contentPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_15.setColumns(10);
		textField_15.setBounds(1024, 597, 211, 28);
		contentPane.add(textField_15);
		
		btnNewButton = new JButton("GO");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnNewButton.setBounds(1023, 83, 89, 28);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\FINALIMG2.png"));
		lblNewLabel.setBounds(0, 0, 1980, 1080);
		contentPane.add(lblNewLabel);
		
		l = new SMSFEESEARCHLISTENER(this);
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

	public String getTextField_2() {
		return textField_2.getText();
	}

	public void setTextField_2(String t) {
		textField_2.setText(t);
	}

	public String getTextField_3() {
		return textField_3.getText();
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
}

