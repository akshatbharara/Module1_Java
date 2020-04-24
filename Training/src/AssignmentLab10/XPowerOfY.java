package AssignmentLab10;

interface Power
{
	abstract int powerOf(int x,int y);
}
public class XPowerOfY {
    
	   public int getPowerOfXAndY(int x,int y)
	   {
		   int output=0;
		   
		   Power p=(a,b)->
		   {
		    int out=(int)Math.pow(a, b);   
			return out;
		   };
		   output=p.powerOf(x, y);
		   return output;
	   }
}
