package LambdaExpressions;

public class SampleCheck1 {
	public static void main(String[] args){
		Sample1 s1 = (num1,num2) -> num1 +num2;
		int result = s1.funct1(10,20);
		System.out.println(result);
	}

}
