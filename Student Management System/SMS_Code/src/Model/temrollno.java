package Model;

public class temrollno implements no
{

	@Override
	public int rollno(int p)
	{
		if(p<=120)
			p++;
		
		return p;
	}
	
}