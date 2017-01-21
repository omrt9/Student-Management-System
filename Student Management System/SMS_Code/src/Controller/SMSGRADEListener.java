package Controller;
import Model.*;
import Controller.*;
import View.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;





public class SMSGRADEListener implements ActionListener 
{
	SMSGRADEGUI gui;
	GradeList l;
	
	public SMSGRADEListener(SMSGRADEGUI gui)
	{
		this.gui = gui;
		l = new GradeList();
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand() == "GO")
		{
			GRADE g = new GRADE(gui.getTextField());
			try 
			{
				l.Fetch(g);
				gui.setTextField_1(l.name);
				//gui.jta.setText("BEC");
				gui.jta.setText(l.Display());
				
				
				
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
