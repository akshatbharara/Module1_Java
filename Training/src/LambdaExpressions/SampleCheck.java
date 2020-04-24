package LambdaExpressions;

public class SampleCheck {
	public static void main(String[] args){
		Sample sm = (num) -> num+10;
		int result = sm.function(10);
		System.out.println(result);
	}

}
