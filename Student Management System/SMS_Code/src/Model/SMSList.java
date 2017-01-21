package Model;
import Connection.*;
import View.*;
import Controller.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class SMSList extends SMS
{
	public String tno = "0";
	public String name;
	public String gender;
	public String board;
	public String meritrank;
	public String meritp;
	public String bper;
	public String bmarks;
	public String jeeper;
	public String jeemarks;
	public int temproll = 0;
	public int rollno = 201501000;
	public String admsn;
	public String fname;
	public String address;
	public String cno;
	public String dob;
	public String school;
	public String category;
	public String bldgrp;
	public String email;
	
	static int p=1;

	
	
	public ArrayList<SMS> fetchRecords() throws SQLException, Exception
	{
		ArrayList<SMS> list = new ArrayList<SMS>();
		
		System.out.println("Creating statement...");
	    Connection conn = SMSConnection.getConnection();
	    Statement stmt = conn.createStatement();
	    String sql;
	    sql = "SELECT * FROM smstbl";
	    ResultSet rs = stmt.executeQuery(sql);

	   while(rs.next())
	   {
	          //Retrieve by column name
		   	  String rn = rs.getString("rollno");
		      String rank = rs.getString("rank");
		      String gen = rs.getString("gender");
		      String name = rs.getString("name");
		      String board = rs.getString("board");
		      String pcm = rs.getString("pcm");
		      String bper = rs.getString("b_percentile");
		      String jee = rs.getString("jee");
		      String jeeper = rs.getString("jee_percentile");
		      String netper = rs.getString("net_percentile");
	      
		      //list.add(new SMS(rn, rank, gen, name, board, pcm, bper, jee, jeeper, netper));	  
	   }
	   
	   
	   return list;
}
	
	public void Fetch(SMS sms) throws ClassNotFoundException, SQLException
	{
		String rollno;
		SMSGUI gui = new SMSGUI();
	/*	while(sms.getRollno() == )
		{
			String name = 
		}*/
		System.out.println("Creating statement...");
	    Connection conn = SMSConnection.getConnection();
	    Statement stmt = conn.createStatement();
	    String sql;
	    sql = "SELECT name,rank,gender,board,net_percentile,pcm,b_percentile,jee,jee_percentile FROM smstbl WHERE rollno='" + sms.getRollno() + "'";
	    //stmt.execute(sql);
	    
	    
	    ResultSet rs = stmt.executeQuery(sql);
	  //  System.out.println("Name"+rs.getString("name"));
	    
	   // String finalimage;
	    
	    while(rs.next())
	    {
	    name=rs.getString("name");
	    meritrank=rs.getString("rank");
	    gender=rs.getString("gender");
	    board=rs.getString("board");
	    meritp=rs.getString("net_percentile");	    	
	    bper = rs.getString("b_percentile");
	    bmarks = rs.getString("pcm");
	    jeeper = rs.getString("jee_percentile");
	    jeemarks = rs.getString("jee");
	    }
	    
	    
	    //System.out.println(" " + name);
	    
	    
		  
	}
	
	public void Fetch1(SMS sms) throws ClassNotFoundException, SQLException
	{
		String rollno;
		SMSMODDEL gui = new SMSMODDEL();
	/*	while(sms.getRollno() == )
		{
			String name = 
		}*/
		System.out.println("Creating statement...");
	    Connection conn = SMSConnection.getConnection();
	    Statement stmt = conn.createStatement();
	    String sql;
	    sql = "SELECT * FROM smstemp WHERE tempno='" + sms.getRollno() + "'";
	    //stmt.execute(sql);
	    
	    
	    ResultSet rs = stmt.executeQuery(sql);
	  //  System.out.println("Name"+rs.getString("name"));
	    
	   // String finalimage;
	    
	    while(rs.next())
	    {
	    	name=rs.getString("name");
	 	    admsn=rs.getString("admsnquota");
	 	    fname = rs.getString("fname");
	 	    address=rs.getString("address");
	 	    cno=rs.getString("cno");
	 	    email=rs.getString("email");
	 	    category=rs.getString("category");
	 	    school=rs.getString("school");
	 	    dob=rs.getString("dob");
	 	    bldgrp=rs.getString("bloodgrp");
	 	    meritrank=rs.getString("rank");
	 	    gender=rs.getString("gender");
	 	    board=rs.getString("board");
	 	    bper = rs.getString("pcmper");
	 	    jeemarks = rs.getString("jee");
	    }
	    
	    
	    //System.out.println(" " + name);
	    
	    
		  
	}
	
	public void modify(SMS sms) throws ClassNotFoundException, SQLException
	{
		System.out.println("Creating statement...");
	    Connection conn = SMSConnection.getConnection();
	    Statement stmt = conn.createStatement();
	    String sql;
	    
	    sql = "Update smstemp set admsnquota='"+sms.getAdmsnquota()+"',address='"+sms.getAddress()+"',cno='"+sms.getCno()+"',email='"+sms.getEmail()+"',category='"+sms.getCategory()+"',school='"+sms.getSchool()+"',dob='"+sms.getDob()+"',bloodgrp ='"+sms.getBldgrp()+"' where tempno='"+sms.getTempno()+"'";
	    stmt.execute(sql);
	    
	}
	
	public void delete(SMS sms) throws ClassNotFoundException, SQLException
	{
		System.out.println("Creating statement...");
	    Connection conn = SMSConnection.getConnection();
	    Statement stmt = conn.createStatement();
	    String sql;
	    sql = "DELETE from smstemp where tempno="+sms.getTempno()+"";
	    stmt.execute(sql);
	}
	
	public void Add(SMS sms) throws ClassNotFoundException, SQLException
	{
		System.out.println("Creating statement...");
	    Connection conn = SMSConnection.getConnection();
	    Statement stmt = conn.createStatement();
	    String sql;
	    String sql1;
	    
	    no l;
	    
	    int p;
	    
	    l = new temrollno();
	    
	    sql1="SELECT * FROM smstemp";
	    
	    ResultSet rs = stmt.executeQuery(sql1);
	    
	    while(rs.next())
	    {
	    	temproll=rs.getInt("tempno");
	    }
	    
	    if(temproll>=120)
	    {
	    	 Addmaster();
	    }
	    else
	    {
	    System.out.println(" " + temproll);
	    sql = "INSERT INTO smstemp VALUES('" + l.rollno(temproll) + "', '" + sms.getSname() + "', '" + sms.getAdmsnquota() + "', '" + sms.getMeritrank() + "','" + sms.getPcmper() + "', '" + sms.getJee() + "', '" + sms.getSfname() + "', '" + sms.getAddress() + "', '" +sms.getCno() + "', '" + sms.getEmail() + "', '" + sms.getCategory() + "',  '" + sms.getBoard() + "',  '" + sms.getSchool() + "',  '" + sms.getDob() + "',  '" + sms.getBldgrp() + "', '" + sms.getGender() + "')";
	    stmt.execute(sql);
	    
	    }
	   
	}
	
	/*pu
	 * blic void AddMaster(SMS sms) throws ClassNotFoundException, SQLException
	{
		System.out.println("Creating statement...");
	    Connection conn = SMSConnection.getConnection();
	    Statement stmt = conn.createStatement();
	    String sql;
	    String sql1;
	    
	    sql1="SELECT * FROM smstemp";
	    
	    ResultSet rs = stmt.executeQuery(sql1);
	    
	    while(rs.next())
	    {
	    	temproll=rs.getInt("tempno");
	    }
	    
	    System.out.println(" " + temproll);
	    
	    sql = "INSERT INTO smstemp VALUES('" + sms.temrollno(temproll) + "', '" + sms.getSname() + "', '" + sms.getAdmsnquota() + "', '" + sms.getMeritrank() + "','" + sms.getPcmper() + "', '" + sms.getJee() + "', '" + sms.getSfname() + "', '" + sms.getAddress() + "', '" +sms.getCno() + "', '" + sms.getEmail() + "', '" + sms.getCategory() + "',  '" + sms.getBoard() + "',  '" + sms.getSchool() + "',  '" + sms.getDob() + "',  '" + sms.getBldgrp() + "', '" + sms.getGender() + "')";
	    stmt.execute(sql);
	    
	    if(temproll == 10)
	    {
	    	 String sql2;
	 	    String sql3;
	 	    
	 	    sql2="SELECT * FROM mastertbl";
	 	    
	 	    ResultSet rs1 = stmt.executeQuery(sql1);
	 	    
	 	    while(rs1.next())
	 	    {
	 	    	//rollno=rs1.getString("rollno");
	 	    }
	 	    
	 	    
	 	    System.out.println(" " + temproll);
	 	    
	 	    sql = "INSERT INTO smstemp VALUES('" + sms.temrollno(temproll) + "', '" + sms.getSname() + "', '" + sms.getAdmsnquota() + "', '" + sms.getMeritrank() + "','" + sms.getPcmper() + "', '" + sms.getJee() + "', '" + sms.getSfname() + "', '" + sms.getAddress() + "', '" +sms.getCno() + "', '" + sms.getEmail() + "', '" + sms.getCategory() + "',  '" + sms.getBoard() + "',  '" + sms.getSchool() + "',  '" + sms.getDob() + "',  '" + sms.getBldgrp() + "', '" + sms.getGender() + "')";
	 	    stmt.execute(sql);
	    }
	}
	*/
	
	
	public void Addmaster()throws ClassNotFoundException, SQLException
	{
		
		SMS sms = new SMS();
		
		System.out.println("Creating statement...");
	    Connection conn = SMSConnection.getConnection();
	    Statement stmt = conn.createStatement();
	    String sql;
	    String sql1;
	    String sql2;
	    
	    sql2="SELECT * FROM smstemp";
	    
	    ResultSet rn = stmt.executeQuery(sql2);
	    //System.out.println("" + temproll);
	    while(rn.next())
	    {	  //  System.out.println(temproll);

	    	temproll=rn.getInt("tempno");
		    //System.out.println(temproll);

	    }
	    
	    
	  //  int q = temproll;
	    
	    
	   // System.out.println(q);
	    
	    String [][] str = new String[temproll][15];
	   // System.out.println(q);

	    int i=0,j=0;
	    String s = "omrt1";
	    int m;
	    
	    sql="SELECT * FROM smstemp ORDER BY name ASC ";
	    
	    

	    ResultSet rs = stmt.executeQuery(sql);
	    
	    //while(rs.next())
	    while(rs.next())
	    {

	    name=rs.getString("name");
	    admsn=rs.getString("admsnquota");
	    fname = rs.getString("fname");
	    address=rs.getString("address");
	    cno=rs.getString("cno");
	    email=rs.getString("email");
	    category=rs.getString("category");
	    school=rs.getString("school");
	    dob=rs.getString("dob");
	    bldgrp=rs.getString("bloodgrp");
	    meritrank=rs.getString("rank");
	    gender=rs.getString("gender");
	    board=rs.getString("board");
	    bper = rs.getString("pcmper");
	    jeemarks = rs.getString("jee");
	    
	    
	    System.out.println(i);
	    str[i][0] = name;
	    str[i][1] = admsn;
	    str[i][2] = meritrank;
	    str[i][3] = bper;
	    str[i][4] = jeemarks;
	    str[i][5] = fname;
	    str[i][6] = address;
	    str[i][7] = cno;
	    str[i][8] = email;
	    str[i][9] = category;
	    str[i][10]= board;
	    str[i][11]= school;
	    str[i][12]= dob;
	    str[i][13]= bldgrp;
	    str[i][14]= gender;
	    
	   
	   i++;
	    
	    
	    }
	    
	  //  System.out.println(q);

	    /*
	    String sql3;
	    
	    sql3="SELECT * FROM mastertbl";
	    
	    ResultSet rn1 = stmt.executeQuery(sql3);
	    
	    while(rn1.next())
	    {
	    	rollno=rn1.getString("rollno");
	    }
	    */
	    //System.out.println(rollno);
	    String sql6;
	    for(i=0;i<10;i++)
	    {
		    String sql3;
		    
		    sql3="SELECT * FROM mastertbl";
		    
		    ResultSet rn1 = stmt.executeQuery(sql3);
		    
		    while(rn1.next())
		    {
		    	rollno=rn1.getInt("rollno");
		    }

		    no l;
		    
		    l = new mrollno();
		    
	    	System.out.println(rollno);
	       sql6 = "INSERT INTO mastertbl VALUES('"+l.rollno(rollno)+"','"+str[i][0]+"','"+str[i][1]+"','"+str[i][2]+"','"+str[i][3]+"','"+str[i][4]+"','"+str[i][5]+"','"+str[i][6]+"','"+str[i][7]+"','"+str[i][8]+"','"+str[i][9]+"','"+str[i][10]+"','"+str[i][11]+"','"+str[i][12]+"','"+str[i][13]+"','"+str[i][14]+"')";
	  	   stmt.execute(sql6);
	    }
	   
	    
	    
	    
	}
}
