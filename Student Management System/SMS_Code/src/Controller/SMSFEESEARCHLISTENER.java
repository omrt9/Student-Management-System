package Controller;
import Model.*;
import Controller.*;
import View.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;



public class SMSFEESEARCHLISTENER implements ActionListener 
{

	SMSFEESEARCH gui;
	FEEList l;
	
	public SMSFEESEARCHLISTENER(SMSFEESEARCH gui)
	{
		this.gui = gui;
		l = new FEEList();
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand() == "GO")
		{
			FEE fee = new FEE(gui.getTextField());
			
			try 
			{
				l.Search(fee);
				gui.setTextField_1(l.name);
				gui.setTextField_2(l.cno);
				gui.setTextField_3(l.email);
				gui.setTextField_4(l.sem1);
				gui.setTextField_6(l.cheque1);
				gui.setTextField_7(l.status1);
				gui.setTextField_8(l.inst11);
				gui.setTextField_9(l.inst12);
				gui.setTextField_11(l.sem2);
				gui.setTextField_12(l.cheque2);
				gui.setTextField_13(l.status2);
				gui.setTextField_14(l.inst21);
				gui.setTextField_15(l.inst22);
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

	}
}