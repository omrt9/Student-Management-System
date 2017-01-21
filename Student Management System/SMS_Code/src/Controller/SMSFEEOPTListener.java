package Controller;
import Model.*;
import Controller.*;
import View.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class SMSFEEOPTListener implements ActionListener
{

	SMSFEEOPT gui;
	
	public SMSFEEOPTListener(SMSFEEOPT gui)
	{
		this.gui = gui;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals(gui.getRdbtnNewRadioButton()))
		{
			SMSFEEGUI gui2 = new SMSFEEGUI();
			gui2.setVisible(true);
		}
		else if(e.getActionCommand().equals(gui.getRdbtnNewRadioButton_1()))
		{
			SMSFEESEARCH gui1 = new SMSFEESEARCH();
			gui1.setVisible(true);
		}
	}

}
