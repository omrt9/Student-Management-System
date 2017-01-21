package Model;

public class mrollno implements no
{

	@Override
	public int rollno(int rno)
	{
		if(rno<=201501120)
			rno++;
		
		return rno;
	}
	
}