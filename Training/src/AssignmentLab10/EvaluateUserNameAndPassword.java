package AssignmentLab10;

interface Ab
{
	abstract public boolean checkUserNamePassword(String user,String password);
}

public class EvaluateUserNameAndPassword {

	
	public boolean checkUserNamePassword(String user,String password)
	{
		boolean output=false;
		
		Ab out=(user1,password1)->
		{
			boolean chk=false;
			  if(user1.contentEquals("admin") && password1.contentEquals("admin"))
				  chk=true;
			return chk;
		};
		output=out.checkUserNamePassword(user, password);
		return output;
	}
}
