package Model;

import java.sql.Date;


public class SMS 
{
	private String rollno;
	private String sname;
	private String sfname;
	private String smname;
	private String dob;
	private String email;
	private String address;
	private String gender;
	private String board;
	private String meritrank;
	private String meritpercentile;
	private String category;
	private String course;
	private String bldgrp;
	private String school;
	private String cno;
	private String jee;
	private String pcmper;
	private String admsnquota;
	private String tempno;
	private static int t=0;
	
	public SMS()
	{}
	 
	public SMS(String roll)
	{
		this.rollno = roll;
	}
	
	
	public SMS(String name,String rank)
	{
		this.sname=name;
		this.meritrank=rank;
	}
	
	
	public SMS(String sname,String admsnquota,String rank, String pcmper,String jee,String fname,String address,String cno,String email,String category,String board,String school,String dob,String bloodgrp,String gender)
	{

		//this.tempno=tempno;
		this.sname=sname;
		this.admsnquota=admsnquota;
		this.meritrank=rank;
		this.pcmper=pcmper;
		this.jee=jee;
		this.sfname=fname;
		this.address=address;
		this.cno=cno;
		this.email=email;
		this.category=category;
		this.board=board;
		this.school=school;
		this.dob=dob;
		this.gender=gender;
		this.bldgrp=bloodgrp;
		
		
	}
	
	public SMS(String tempno,String sname,String admsnquota,String rank, String pcmper,String jee,String fname,String address,String cno,String email,String category,String board,String school,String dob,String bloodgrp,String gender)
	{

		this.tempno=tempno;
		this.sname=sname;
		this.admsnquota=admsnquota;
		this.meritrank=rank;
		this.pcmper=pcmper;
		this.jee=jee;
		this.sfname=fname;
		this.address=address;
		this.cno=cno;
		this.email=email;
		this.category=category;
		this.board=board;
		this.school=school;
		this.dob=dob;
		this.gender=gender;
		this.bldgrp=bloodgrp;
		
		
	}
	//public SMS(String rollno, String sname, String gen, String board, Double mrank, Double mper, String )
	public SMS(String rollno, String sname, String sfname, String smname, String dob, String email, String address, String gender, String board, String meritrank, String meritpercentile, String category, String course)
	{
		
		this.rollno = rollno;
		this.sname = sname;
		this.sfname = sfname;
		this.smname = smname;
		this.dob = dob;
		this.email = email;
		this.address = address;
		this.gender = gender;
		this.board = board;
		this.meritrank = meritrank;
		this.meritpercentile = meritpercentile;
		this.category = category;
		this.course = course;
	}
	
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSfname() {
		return sfname;
	}
	public void setSfname(String sfname) {
		this.sfname = sfname;
	}
	public String getSmname() {
		return smname;
	}
	public void setSmname(String smname) {
		this.smname = smname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getBldgrp() {
		return bldgrp;
	}

	public void setBldgrp(String bldgrp) {
		this.bldgrp = bldgrp;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getCno() {
		return cno;
	}

	public void setCno(String cno) {
		this.cno = cno;
	}

	public String getJee() {
		return jee;
	}

	public void setJee(String jee) {
		this.jee = jee;
	}

	public String getPcmper() {
		return pcmper;
	}

	public void setPcmper(String pcmper) {
		this.pcmper = pcmper;
	}

	public String getAdmsnquota() {
		return admsnquota;
	}

	public void setAdmsnquota(String admsnquota) {
		this.admsnquota = admsnquota;
	}

	public String getTempno() {
		return tempno;
	}

	public void setTempno(String tempno) {
		this.tempno = tempno;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBoard() {
		return board;
	}
	public void setBoard(String board) {
		this.board = board;
	}
	public String getMeritrank() {
		return meritrank;
	}
	public void setMeritrank(String meritrank) {
		this.meritrank = meritrank;
	}
	public String getMeritpercentile() {
		return meritpercentile;
	}
	public void setMeritpercentile(String meritpercentile) {
		this.meritpercentile = meritpercentile;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	/*
	public String temrollno(int p)
	{
		if(p<=120)
		p++;
		
		
		return p + "";
	}
	
	public String rollno(int rno)
	{
		if(rno<=201501120)
			rno++;
		
		return rno + "";
	}*/
	
	
}


