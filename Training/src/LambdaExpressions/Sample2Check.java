package LambdaExpressions;

public class Sample2Check {
	public static void main(String[] args){
		Sample2 sm = ()->"Hello World";
		String result = sm.fun();
		System.out.println(result);
		
	}

}
