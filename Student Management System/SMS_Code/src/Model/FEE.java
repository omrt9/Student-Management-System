package Model;

public class FEE 
{
	private String rollno;
	private String name;
	private String cno;
	private String emailid;
	private String sem1;
	private String sem2;
	private String cheque1;
	private String cheque2;
	private String netbank1;
	private String netbank2;
	private String inst11;
	private String inst12;
	private String inst21;
	private String inst22;
	private String lump1;
	private String lump2;




	
	public FEE()
	{ }
	
	public FEE(String rollno)
	{
		this.rollno=rollno;
	}
	
	public FEE(String rollno,String name,String cno,String email,String sem1,String sem2,String cheque1,String cheque2,String inst11,String inst12,String inst21,String inst22,String lump1,String lump2)
	{
		this.rollno=rollno;
		this.name=name;
		this.cno=cno;
		this.emailid=email;
		this.sem1=sem1;
		this.sem2=sem2;
		this.cheque1=cheque1;
		this.cheque2=cheque2;
		this.inst11=inst11;
		this.inst12=inst12;
		this.inst21=inst21;
		this.inst22=inst22;
		this.lump1=lump1;
		this.lump2=lump2;
		
	}
	
	public FEE(String rollno,String name,String cno,String email,String sem1,String sem2,String cheque1,String cheque2,String netbank1,String netbank2,String inst11,String inst12,String inst21,String inst22,String lump1,String lump2)
	{
		this.name=name;
		this.cno=cno;
		this.emailid=email;
		this.sem1=sem1;
      	this.sem2=sem2;
		this.cheque1=cheque1;
		this.cheque2=cheque2;
		this.netbank1=netbank1;
		this.netbank2=netbank2;
		this.inst11=inst11;
		this.inst12=inst12;
		this.inst21=inst21;
		this.inst22=inst22;
		this.lump1=lump1;
		this.lump2=lump2;
		
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
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getSem1() {
		return sem1;
	}
	public void setSem(String sem) {
		this.sem1 = sem;
	}

	public String getSem2() {
		return sem2;
	}

	public void setSem2(String sem2) {
		this.sem2 = sem2;
	}

	public String getCheque1() {
		return cheque1;
	}

	public void setCheque1(String cheque1) {
		this.cheque1 = cheque1;
	}

	public String getCheque2() {
		return cheque2;
	}

	public void setCheque2(String cheque2) {
		this.cheque2 = cheque2;
	}

	public String getNetbank1() {
		return netbank1;
	}

	public void setNetbank1(String netbank1) {
		this.netbank1 = netbank1;
	}

	public String getNetbank2() {
		return netbank2;
	}

	public void setNetbank2(String netbank2) {
		this.netbank2 = netbank2;
	}

	public String getInst11() {
		return inst11;
	}

	public void setInst11(String inst11) {
		this.inst11 = inst11;
	}

	public String getInst12() {
		return inst12;
	}

	public void setInst12(String inst12) {
		this.inst12 = inst12;
	}

	public String getInst21() {
		return inst21;
	}

	public void setInst21(String inst21) {
		this.inst21 = inst21;
	}

	public String getInst22() {
		return inst22;
	}

	public void setInst22(String inst22) {
		this.inst22 = inst22;
	}

	public String getLump1() {
		return lump1;
	}

	public void setLump1(String lump1) {
		this.lump1 = lump1;
	}

	public String getLump2() {
		return lump2;
	}

	public void setLump2(String lump2) {
		this.lump2 = lump2;
	}


}
