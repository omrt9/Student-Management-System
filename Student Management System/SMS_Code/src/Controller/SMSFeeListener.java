package Controller;
import Model.*;
import Controller.*;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import MyException.MyException;


public class SMSFeeListener implements ActionListener
{
	SMSFEEGUI f;
	private FEEList l;
    private FEE nfee;
	
	public SMSFeeListener(SMSFEEGUI f)
	{
		this.f = f;
		l = new FEEList();
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getActionCommand() == "GO")
		{
			FEE newFee = new FEE(f.getTextField());
			
			try
			{
				
				//FEEList l = new FEEList();
				
				l.Fetch(newFee);
				if(f.getTextField().equals(""))
				{
					throw new MyException("Please enter Roll Number!");
				}
				//l.pay(newFee);
				else
				{
				f.setTextField_1(l.cno);
				f.setTextField_2(l.email);
				f.setTextField_3(l.name);
				}
			}
			catch(MyException err)
			{
				System.out.println(err.getMessage());
			}
			catch(Exception err)
			{
				err.printStackTrace();
			}
		}
		
		else if(e.getActionCommand() == "RECORD") 
		{
			String n = "-";
			String p1 = "35000";
			String net = "67000";
			//FEEList l = new FEEList();

			//String d = f.comboBox.getSelectedItem().toString();
			
			//System.out.println(""+d);
			if(f.getComboBox() == "1")
			{
				if(f.getComboBox_3() == "INSTALLMENT 1")
				{
					nfee = new FEE(f.getTextField(),f.getTextField__3(),f.getTextField_1(),f.getTextField_2(),f.getComboBox_2(),n,f.getComboBox_3(),n,p1,n,n,n,n,n);
				
				
					try {
						l.pay(nfee);
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(f.getComboBox_3() == "INSTALLMENT 2")
				{
					nfee = new FEE(f.getTextField(),f.getTextField__3(),f.getTextField_1(),f.getTextField_2(),f.getComboBox_2(),n,f.getComboBox_3(),n,n,p1,n,n,n,n);
				
				
					try {
						l.pay(nfee);
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				else
				{

					nfee = new FEE(f.getTextField(),f.getTextField__3(),f.getTextField_1(),f.getTextField_2(),f.getComboBox_2(),n,f.getComboBox_3(),n,n,n,n,n,net,n);
				
				
					try {
						l.pay(nfee);
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			
			}
			
			if(f.getComboBox() == "2")
			{
				if(f.getComboBox_3() == "INSTALLMENT 1")
				{
					nfee = new FEE(f.getTextField(),f.getTextField__3(),f.getTextField_1(),f.getTextField_2(),n,f.getComboBox_2(),n,f.getComboBox_3(),n,n,p1,n,n,n);
				
				
					try {
						l.pay(nfee);
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(f.getComboBox_3() == "INSTALLMENT 2")
				{
					nfee = new FEE(f.getTextField(),f.getTextField__3(),f.getTextField_1(),f.getTextField_2(),n,f.getComboBox_2(),n,f.getComboBox_3(),n,n,n,p1,n,n);				
				
					try 
					{
						l.pay(nfee);
					} 
					catch (ClassNotFoundException e1)
					{
						e1.printStackTrace();
					} 
					catch (SQLException e1)
					{
						e1.printStackTrace();
					}
				}
				
				else
				{

					nfee = new FEE(f.getTextField(),f.getTextField__3(),f.getTextField_1(),f.getTextField_2(),n,f.getComboBox_2(),n,f.getComboBox_3(),n,n,n,n,n,net);				
				
					try {
						l.pay(nfee);
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			
			}
			
		}
		
	}

}
