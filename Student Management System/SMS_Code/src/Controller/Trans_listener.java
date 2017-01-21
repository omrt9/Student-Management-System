package Controller;
import Model.*;
import Controller.*;
import View.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;




public class Trans_listener implements ActionListener
{
    private Trans_init t;
    private Transscript tss;
    GradeList l;
    
    public Trans_listener(Trans_init tl)
    {
    	t = tl;
    	
    	l=new GradeList();
    }

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		if(e.getActionCommand() == "GO")
		{
			tss = new Transscript();
			tss.setVisible(true);
			
			GRADE g = new GRADE(t.getTextField_1());
			try 
			{
				l.Fetch1(g);
				tss.setTextField(l.name);
				//gui.jta.setText("BEC");
				tss.setTextField_9(l.gpa_1);
				tss.setTextField_10(l.gpa_2);
				tss.setTextField_17(l.cgpa);
				
				
				
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
