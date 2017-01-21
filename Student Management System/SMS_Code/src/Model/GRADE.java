package Model;
import Connection.*;
import View.*;
import Controller.*;

public class GRADE 
{
	private String rollno;
	private String name;
	private String bec_t;
	private String bec_p;
	private String icp_t;
	private String icp_p;
	private String cde;
	private String cs;
	private String ucd;
	private String gpa_1;
	private String dd_t;
	private String dd_p;
	private String oop_t;
	private String oop_p;
	private String emt;
	private String dm;
	private String es;
	private String gpa_2;
	private String cgpa;
	

	public GRADE()
	
	{
		
	}
	
	public GRADE(String rollno)
	{
		this.rollno = rollno;
	}
	
	public GRADE(String rollno, String name, String bec_t, String bec_p, String icp_t, String icp_p, String cde, String cs, String ucd, String gpa_1, String dd_t, String dd_p, String oop_t, String oop_p, String emt, String dm, String es, String gpa_2, String cgpa)
	{
		this.rollno = rollno;
		this.name = name;
		this.bec_t = bec_t;
		this.bec_p = bec_p;
		this.icp_t = icp_t;
		this.icp_p = icp_p;
		this.cde = cde;
		this.cs = cs;
		this.ucd = ucd;
		this.gpa_1 = gpa_1;
		this.dd_t = dd_t;
		this.dd_p = dd_p;
		this.oop_t = oop_t;
		this.oop_p = oop_p;
		this.emt = emt;
		this.dm = dm;
		this.es = es;
		this.gpa_2 = gpa_2;
		this.cgpa = cgpa;
	}
	
	
	
	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBec_t() {
		return bec_t;
	}

	public void setBec_t(String bec_t) {
		this.bec_t = bec_t;
	}

	public String getBec_p() {
		return bec_p;
	}

	public void setBec_p(String bec_p) {
		this.bec_p = bec_p;
	}

	public String getIcp_t() {
		return icp_t;
	}

	public void setIcp_t(String icp_t) {
		this.icp_t = icp_t;
	}

	public String getIcp_p() {
		return icp_p;
	}

	public void setIcp_p(String icp_p) {
		this.icp_p = icp_p;
	}

	public String getCde() {
		return cde;
	}

	public void setCde(String cde) {
		this.cde = cde;
	}

	public String getCs() {
		return cs;
	}

	public void setCs(String cs) {
		this.cs = cs;
	}

	public String getUcd() {
		return ucd;
	}

	public void setUcd(String ucd) {
		this.ucd = ucd;
	}

	public String getGpa_1() {
		return gpa_1;
	}

	public void setGpa_1(String gpa_1) {
		this.gpa_1 = gpa_1;
	}

	public String getDd_t() {
		return dd_t;
	}

	public void setDd_t(String dd_t) {
		this.dd_t = dd_t;
	}

	public String getDd_p() {
		return dd_p;
	}

	public void setDd_p(String dd_p) {
		this.dd_p = dd_p;
	}

	public String getOop_t() {
		return oop_t;
	}

	public void setOop_t(String oop_t) {
		this.oop_t = oop_t;
	}

	public String getOop_p() {
		return oop_p;
	}

	public void setOop_p(String oop_p) {
		this.oop_p = oop_p;
	}

	public String getEmt() {
		return emt;
	}

	public void setEmt(String emt) {
		this.emt = emt;
	}

	public String getDm() {
		return dm;
	}

	public void setDm(String dm) {
		this.dm = dm;
	}

	public String getEs() {
		return es;
	}

	public void setEs(String es) {
		this.es = es;
	}

	public String getGpa_2() {
		return gpa_2;
	}

	public void setGpa_2(String gpa_2) {
		this.gpa_2 = gpa_2;
	}

	public String getCgpa() {
		return cgpa;
	}

	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}
}

