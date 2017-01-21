package Controller;
import Model.*;
import Controller.*;
import View.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;



public class SMSMODDELListener implements ActionListener 
{

	SMSMODDEL gui;
	private SMSList l = new SMSList();

	
	public SMSMODDELListener(SMSMODDEL f)
	{
		this.gui = f;
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		if(e.getActionCommand() == "GO")
		{
			SMS newSMS = new SMS(gui.getTextField());
			
			try
			{
				
				SMSList l = new SMSList();
				l.Fetch1(newSMS);
				
				gui.setTextField_1(l.name);
				gui.setTextField_4(l.gender);
				gui.setTextField_9(l.meritrank);
				gui.setTextField_10(l.bmarks);
				gui.setTextField_11(l.bper);
				gui.setTextField_12(l.jeemarks);
				gui.setTextField_13(l.jeeper);
				gui.setTextField_16(l.board);
				gui.setTextField_14(l.meritp);
			}
			catch(Exception err)
			{
				err.printStackTrace();
			}
		}
		
		else if(e.getActionCommand() == "MODIFY STUDENT")
		{
			SMS newSMS = new SMS(gui.getTextField(),gui.getTextField_1(),gui.gettype2(),gui.getTextField_9(),gui.getTextField_11(),gui.getTextField_12(),gui.getTextField_2(),gui.getTextField_5(),gui.getTextField_6(),gui.getTextField_8(),gui.gettype(),gui.getTextField_16(),gui.getTextField_15(),gui.getTextField_17(),gui.getTextField_7(),gui.getTextField_4());
			
			//SMS newSMS = new SMS(gui.getTextField_1());
			try {
				l.modify(newSMS);
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		else if(e.getActionCommand() == "DELETE STUDENT")
		{
			SMS newSMS = new SMS(gui.getTextField(),gui.getTextField_1(),gui.gettype2(),gui.getTextField_9(),gui.getTextField_11(),gui.getTextField_12(),gui.getTextField_2(),gui.getTextField_5(),gui.getTextField_6(),gui.getTextField_8(),gui.gettype(),gui.getTextField_16(),gui.getTextField_15(),gui.getTextField_17(),gui.getTextField_7(),gui.getTextField_4());

			//SMS newSMS = new SMS(gui.getTextField_1());
			try { 
				l.delete(newSMS);
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
