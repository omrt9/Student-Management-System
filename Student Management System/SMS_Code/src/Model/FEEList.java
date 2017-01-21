package Model;
import Connection.*;
import View.*;
import Controller.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class FEEList extends FEE
{
	
	public String name;
	public String cno;
	public String email;
	public String rollno;
	public String sem1;
	public String sem2;
	public String cheque1;
	public String cheque2;
	public String inst11;
	public String inst12;
	public String inst22;
	public String inst21;
	public String status1;
	public String status2;
	
	
	public void Fetch(FEE fee) throws ClassNotFoundException, SQLException
	{
		String rollno;
		SMSFEEGUI gui = new SMSFEEGUI();
		System.out.println("Creating statement...");
	    Connection conn = SMSConnection.getConnection();
	    Statement stmt = conn.createStatement();
	    String sql;
	    sql = "SELECT name1,cno,email FROM mastertbl WHERE rollno='" +fee.getRollno()+"'";
	    //stmt.execute(sql);
	    
	    
	    ResultSet rs = stmt.executeQuery(sql);
	  //  System.out.println("Name"+rs.getString("name"));
	    
	   // String finalimage;
	    
	    while(rs.next())
	    {
	    	name=rs.getString("name1");
	    	cno=rs.getString("cno");
	    	email=rs.getString("email");
	    }
	    	    
	    
	}
	
	public void pay(FEE fee) throws ClassNotFoundException, SQLException
	{
		SMSFEEGUI gui = new SMSFEEGUI();
		System.out.println("Creating statement...");
	    Connection conn = SMSConnection.getConnection();
	    Statement stmt = conn.createStatement();
	    String sql;
	    String sql1;
	    String sql2;
	    sql = "SELECT name,rollno,cno,email FROM smsfee WHERE rollno='" +fee.getRollno()+"'";
	    stmt.execute(sql);
	    
	    
	    ResultSet rs = stmt.executeQuery(sql);
	    //System.out.println("Name"+rs.getString("name"));
	    	    
	    while(rs.next())
	    {
	    	rollno=rs.getString("rollno");
	    	name=rs.getString("name");
	    	cno=rs.getString("cno");
	    	email=rs.getString("email");
	    	
	    }
	    
	    
	   System.out.println(""+rollno); 	    
	    
	   System.out.println(""+fee.getRollno()); 	    

	 if(fee.getRollno().equals(rollno))
	   {
		   sql2="Update smsfee set sem1='"+fee.getSem1()+"',sem2='"+fee.getSem2()+"',cheque1='"+fee.getCheque1()+"',cheque2='"+fee.getCheque2()+"',inst11='"+fee.getInst11()+"',inst12='"+fee.getInst12()+"',inst21='"+fee.getInst21()+"',inst22='"+fee.getInst22()+"',status1='"+fee.getLump1()+"',status2='"+fee.getLump2()+"' where rollno='"+fee.getRollno()+"'" ;
		   stmt.execute(sql2);
	   }
	    
	   else
	   {
	    sql1 = "INSERT INTO smsfee VALUES('" + fee.getRollno() + "', '" + fee.getName() + "', '" + fee.getCno() + "', '" +fee.getEmailid()+ "','" + fee.getSem1() + "', '" + fee.getSem2() + "', '" + fee.getCheque1() + "', '" + fee.getCheque2() + "','" + fee.getInst11() + "',  '" + fee.getInst12() + "',  '" + fee.getInst21() + "',  '" + fee.getInst22() + "',  '" + fee.getLump1() + "', '" + fee.getLump2() + "')";
	    stmt.execute(sql1);
	   }
	}
	
	public void Search(FEE fee) throws ClassNotFoundException, SQLException
	{
		SMSFEEGUI gui = new SMSFEEGUI();
		System.out.println("Creating statement...");
	    Connection conn = SMSConnection.getConnection();
	    Statement stmt = conn.createStatement();
	    String sql;
	    sql = "SELECT * FROM smsfee WHERE rollno='" + fee.getRollno() + "'";
	    stmt.execute(sql);
	    
	    
	    ResultSet rs = stmt.executeQuery(sql);
	  //  System.out.println("Name"+rs.getString("name"));
	    
	   // String finalimage;
	    
	    while(rs.next())
	    {
	    	name=rs.getString("name");
	    	cno=rs.getString("cno");
	    	email=rs.getString("email");
	    	sem1 = rs.getString("sem1");
	    	sem2 = rs.getString("sem2");
	    	cheque1 = rs.getString("cheque1");
	    	cheque2 = rs.getString("cheque2");
	    	inst11 = rs.getString("inst11");
	    	inst12 = rs.getString("inst12");
	    	inst22 = rs.getString("inst22");
	    	inst21 = rs.getString("inst21");
	    	status1 = rs.getString("status1");
	    	status2 = rs.getString("status2");
	    }
	    	    
	}
}
