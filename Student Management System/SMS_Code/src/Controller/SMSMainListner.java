package Controller;
import Model.*;
import Controller.*;
import View.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;


//import SMSGUI.Trans_init;

public class SMSMainListner implements ActionListener {

	SMSMAINGUI f;

	
	public SMSMainListner(SMSMAINGUI f)
	{
		this.f = f;
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getActionCommand().equals(f.getRdbtnNewRadioButton()))
		{
			SMSGUI gui = new SMSGUI();
			
			 gui.setVisible(true);
		   //  gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
		
		else if(e.getActionCommand().equals(f.getRdbtnRemoveStudent()))
		{
			SMSFEEOPT fgui = new SMSFEEOPT();
			
			 fgui.setVisible(true);
		     //fgui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		else if(e.getActionCommand().equals(f.getRdbtnGrading()))
		{
			SMSGRADEGUI fgui = new SMSGRADEGUI();
			
			 fgui.setVisible(true);
		     //fgui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		else if(e.getActionCommand().equals(f.getrdbtnMasterTable()))
		{
			SMSList list = new SMSList();
			
			try {
				list.Addmaster();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		     //fgui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		else if(e.getActionCommand().equals(f.getRdbtnTranscriptSection()))
		{
			Trans_init ti = new Trans_init();
			ti.setVisible(true);
		}
		
		else if(e.getActionCommand().equals(f.getrdbtnModDelStudent()))
		{
			SMSMODDEL gui = new SMSMODDEL();
			 gui.setVisible(true);

			
		}
		
	}

}
