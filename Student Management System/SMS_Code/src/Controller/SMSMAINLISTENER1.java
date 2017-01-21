package Controller;
import Model.*;
import Controller.*;
import View.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import MyException.MyException;


public class SMSMAINLISTENER1 implements ActionListener
{
	guiframe gui;
	SMSMAINGUI gui1;
	
	public SMSMAINLISTENER1(guiframe gui)
	{
		this.gui = gui;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getActionCommand() == "LOGIN")
		{		
			
			gui.hideT();
			try
			{
				if(gui.textField.getText().equals("admin"))
				{					
	
					if(gui.textField_1.getText().equals("*****"))
					{
						gui1 = new SMSMAINGUI();
						gui1.setVisible(true);
					}
				}
				else
				{
					gui.textField.setText("");
					gui.textField_1.setText("");
					throw new MyException("");
				}
			}
			catch(MyException err)
			{
				gui.showT();
				gui.textField_2.setText("Invalid UserID or Password!");
				
				//err.printStackTrace();
			}
		}
		
		
	}

}
