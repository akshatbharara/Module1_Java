package AssignmentLab10;


interface ChangeOfString
{
	abstract public String insertSpace(StringBuffer input);
}

public class InsertSpaceBetweenString {
	
	
	public String getFormattedString(String input)
	{
		
		ChangeOfString ch=(output)->
		{
			 output=new StringBuffer();
			char interm[]=input.toCharArray();
			for(int i=0;i<interm.length;i++)
			{
				output.append(interm[i]+" ");
			}
			return output.toString();	
		};
		
		return ch.insertSpace(new StringBuffer(input));
	}

}
