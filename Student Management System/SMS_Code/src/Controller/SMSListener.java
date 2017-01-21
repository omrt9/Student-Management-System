package Controller;
import Model.*;
import MyException.MyException;
import Controller.*;
import View.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;



public class SMSListener implements ActionListener
{

	private SMSGUI gui;
	private SMSList l = new SMSList();
	
	public SMSListener(SMSGUI gui)
	{
		this.gui = gui;
		
		//gui = new SMSGUI();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		System.out.println("Clicked: " + e.toString());
		
		if(e.getActionCommand() == "GO")
		{
			SMS newSMS = new SMS(gui.getTextField());
			
			try
			{
				
				SMSList l = new SMSList();
				l.Fetch(newSMS);
				if(gui.getTextField().equals(""))
				{
					throw new MyException("Please enter the roll number!");
				}
				else
				{
					
				
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
			}
			catch(MyException err)
			{
				System.out.println("No student found by this number");
				//err.printStackTrace();
				System.out.println(err.getMessage());
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
		else if(e.getActionCommand() == "ADD STUDENT")
		{
			SMS newSMS = new SMS(gui.getTextField_1(),gui.gettype2(),gui.getTextField_9(),gui.getTextField_11(),gui.getTextField_12(),gui.getTextField_2(),gui.getTextField_5(),gui.getTextField_6(),gui.getTextField_8(),gui.gettype(),gui.getTextField_16(),gui.getTextField_15(),gui.getTextField_17(),gui.getTextField_7(),gui.getTextField_4());
			
	
		
			
			try{
				SMSList list = new SMSList();
				
				list.Add(newSMS);
				
				//list.Addmaster();
				
				
			}
			catch(SQLException err)
			{
				err.printStackTrace();
			}
			catch(Exception err)
			{
				err.printStackTrace();
			}
		}
	}

}
