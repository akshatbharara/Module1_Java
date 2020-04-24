import java.io.*;


public class Factorial {
	public static void main(String[] args)
	{
		try
		{
			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a number to get factorial");
			int a = Integer.parseInt(br1.readLine());
			int fact = 1;
			System.out.print("Factorial of "+a+": ");
			for(int i =1;i<=a;i++)
			{
				fact = fact * i;
				
			}
			System.out.print(fact);
			
		}catch(Exception e){
			
		}
	}

}
