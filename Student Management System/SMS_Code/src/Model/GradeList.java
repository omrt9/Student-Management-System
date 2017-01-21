package Model;
import Connection.*;
import View.*;
import Controller.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class GradeList extends GRADE
{
	public String rollno;
	public String name;
	public String bec_t;
	public String bec_p;
	public String icp_t;
	public String icp_p;
	public String cde;
	public String cs;
	public String ucd;
	public String gpa_1;
	public String dd_t;
	public String dd_p;
	public String oop_t;
	public String oop_p;
	public String emt;
	public String dm;
	public String es;
	public String gpa_2;
	public String cgpa;
	
	public void Fetch(GRADE g) throws ClassNotFoundException, SQLException
	{
		SMSGRADEGUI gui = new SMSGRADEGUI();
		System.out.println("Creating statement...");
	    Connection conn = SMSConnection.getConnection();
	    Statement stmt = conn.createStatement();
	    String sql;
	    sql = "SELECT * FROM smsgrade WHERE rollno='" + g.getRollno() +"'";
	    //stmt.execute(sql);
	    
	    
	    ResultSet rs = stmt.executeQuery(sql);
	  //  System.out.println("Name"+rs.getString("name"));
	    
	   // String finalimage;
	    
	    while(rs.next())
	    {
	    	rollno=rs.getString("rollno");
	    	name=rs.getString("name");
	    	bec_t=rs.getString("bec(t)");
	    	bec_p=rs.getString("bec(p)");
	    	icp_t=rs.getString("icp(t)");
	    	icp_p=rs.getString("icp(p)");
	    	cde=rs.getString("cde");
	    	cs=rs.getString("cs");
	    	ucd=rs.getString("ucd");
	    	gpa_1=rs.getString("gpa(sem1)");
	    	dd_t=rs.getString("dd(t)");
	    	dd_p=rs.getString("dd(p)");
	    	oop_t=rs.getString("oop(t)");
	    	oop_p=rs.getString("oop(p)");
	    	emt=rs.getString("emt");
	    	dm=rs.getString("dm");
	    	es=rs.getString("es");
	    	gpa_2=rs.getString("gpa(sem2)");
	    	cgpa=rs.getString("cgpa");
	    }
	}
	
	public void Fetch1(GRADE g) throws ClassNotFoundException, SQLException
	{
		//SMSGRADEGUI gui = new SMSGRADEGUI();
		System.out.println("Creating statement...");
	    Connection conn = SMSConnection.getConnection();
	    Statement stmt = conn.createStatement();
	    String sql;
	    sql = "SELECT * FROM smsgrade WHERE rollno='" + g.getRollno() +"'";
	    //stmt.execute(sql);
	    
	    
	    ResultSet rs = stmt.executeQuery(sql);
	  //  System.out.println("Name"+rs.getString("name"));
	    
	   // String finalimage;
	    
	    while(rs.next())
	    {
	    	rollno=rs.getString("rollno");
	    	name=rs.getString("name");
	    	gpa_1=rs.getString("gpa(sem1)");
	    	gpa_2=rs.getString("gpa(sem2)");
	    	cgpa=rs.getString("cgpa");
	    }
	}
	
	
	 public String Display()
	{
		return "Semester 1:" + "\n\n" + "BEC Theory: " + bec_t + "\n" + "BEC Practical: " + bec_p + "\n" + "ICP Theory: " + icp_t + "\n" + "ICP Practical: " + icp_p + "\n" + "CDE: " + cde + "\n" + "CS: " + cs + "\n" + "UCD: " + ucd + "\n" + "GPA(Sem-1): " + gpa_1 + "\n\n" + "Semester 2:" + "\n\n" +"DD Theory: " + dd_t + "\n" + "DD Practical" + dd_p + "\n" + "OOP Theory: " + oop_t + "\n" + "OOP Practical: " + oop_p + "\n" + "EMT: " + emt + "\n" + "DM: " + dm + "\n" + "ES: " + es + "\n" + "GPA(Sem-2): " + gpa_2 + "\n\n" + "CGPA: " + cgpa;
	}
}
