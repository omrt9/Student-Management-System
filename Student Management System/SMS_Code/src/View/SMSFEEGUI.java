package View;
import Controller.*;
import Model.*;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;



public class SMSFEEGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtFeesPayment;
	private JTextField txtRollNo;
	private JTextField textField;
	private JTextField txtMobileNo;
	private JTextField textField_1;
	private JTextField txtEmailid;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtName;
	private JTextField txtYear;
	private JTextField txtPaymentMode;
	private JTextField txtCheque;
	private JTextField txtTypeToPay;
	public JComboBox comboBox;
	public JComboBox comboBox_2;
	public JComboBox comboBox_3;
	SMSFeeListener l;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SMSFEEGUI frame = new SMSFEEGUI();
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
	public SMSFEEGUI() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1253, 868);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtFeesPayment = new JTextField();
		txtFeesPayment.setBackground(Color.GRAY);
		txtFeesPayment.setEditable(false);
		txtFeesPayment.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		txtFeesPayment.setHorizontalAlignment(SwingConstants.CENTER);
		txtFeesPayment.setText("FEES  PAYMENT");
		txtFeesPayment.setBounds(89, 30, 246, 34);
		contentPane.add(txtFeesPayment);
		txtFeesPayment.setColumns(10);
		
		txtRollNo = new JTextField();
		txtRollNo.setBackground(Color.WHITE);
		txtRollNo.setHorizontalAlignment(SwingConstants.CENTER);
		txtRollNo.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtRollNo.setEditable(false);
		txtRollNo.setText("ROLL NO");
		txtRollNo.setBounds(59, 104, 90, 28);
		contentPane.add(txtRollNo);
		txtRollNo.setColumns(10);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField.setBounds(193, 107, 222, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtName = new JTextField();
		txtName.setBackground(Color.WHITE);
		txtName.setHorizontalAlignment(SwingConstants.CENTER);
		txtName.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtName.setEditable(false);
		txtName.setText("NAME");
		txtName.setBounds(59, 159, 104, 26);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_3.setBounds(193, 159, 346, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		txtMobileNo = new JTextField();
		txtMobileNo.setBackground(Color.WHITE);
		txtMobileNo.setText("MOBILE NO");
		txtMobileNo.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtMobileNo.setEditable(false);
		txtMobileNo.setHorizontalAlignment(SwingConstants.CENTER);
		txtMobileNo.setBounds(59, 196, 104, 26);
		contentPane.add(txtMobileNo);
		txtMobileNo.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBounds(193, 196, 222, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		txtEmailid = new JTextField();
		txtEmailid.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtEmailid.setText("EMAIL_ID");
		txtEmailid.setHorizontalAlignment(SwingConstants.CENTER);
		txtEmailid.setBounds(59, 233, 104, 28);
		contentPane.add(txtEmailid);
		txtEmailid.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		textField_2.setBounds(193, 235, 279, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		txtYear = new JTextField();
		txtYear.setText("SEMESTER");
		txtYear.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtYear.setHorizontalAlignment(SwingConstants.CENTER);
		txtYear.setBounds(59, 274, 104, 28);
		contentPane.add(txtYear);
		txtYear.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-------------", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		comboBox.setMaximumRowCount(5);
		comboBox.setBounds(193, 274, 142, 20);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("GO");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnNewButton.setBounds(513, 109, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RECORD");
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnNewButton_1.setBounds(127, 626, 231, 34);
		contentPane.add(btnNewButton_1);
		
		txtPaymentMode = new JTextField();
		txtPaymentMode.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtPaymentMode.setText("PAYMENT MODE");
		txtPaymentMode.setHorizontalAlignment(SwingConstants.CENTER);
		txtPaymentMode.setBounds(59, 313, 142, 26);
		contentPane.add(txtPaymentMode);
		txtPaymentMode.setColumns(10);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"-----------", "CHEQUE", "NET BANKING"}));
		comboBox_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		comboBox_2.setBounds(236, 318, 136, 20);
		contentPane.add(comboBox_2);
		
		txtCheque = new JTextField();
		txtCheque.setText("CHEQUE");
		txtCheque.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtCheque.setHorizontalAlignment(SwingConstants.CENTER);
		txtCheque.setEditable(false);
		txtCheque.setBounds(59, 408, 130, 20);
		contentPane.add(txtCheque);
		txtCheque.setColumns(10);
		
		
		txtTypeToPay = new JTextField();
		txtTypeToPay.setText("TYPE TO PAY");
		txtTypeToPay.setHorizontalAlignment(SwingConstants.CENTER);
		txtTypeToPay.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtTypeToPay.setColumns(10);
		txtTypeToPay.setBounds(59, 462, 142, 26);
		txtTypeToPay.setEditable(false);
		contentPane.add(txtTypeToPay);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"---------------", "LUMPSUM", "INSTALLMENT 1", "INSTALLMENT 2"}));
		comboBox_3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		comboBox_3.setBounds(251, 462, 191, 20);
		contentPane.add(comboBox_3);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setIcon(new ImageIcon("C:\\FINALIMG2.png"));
		lblNewLabel.setBounds(0, 0, 1980, 1080);
		contentPane.add(lblNewLabel);
		
		

		l=new SMSFeeListener(this);
		
		btnNewButton.addActionListener(l);
		btnNewButton_1.addActionListener(l);
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

	public void setTextField_2(String t) {
		textField_2.setText(t);
	}
	
	
	public String getTextField__3() {
		return textField_3.getText();
	}

	public void setTextField_3(String t1) {
		textField_3.setText(t1);
	}

	public String getComboBox() {
		return comboBox.getSelectedItem().toString();
	}


	public String getComboBox_2() {
		return comboBox_2.getSelectedItem().toString();
	}

	public String getComboBox_3() {
		return comboBox_3.getSelectedItem().toString();
	}
	
	public String getnull()
	{
		return null;
	}
}
