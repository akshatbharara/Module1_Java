package LambdaExpressions;

public class ConsumerCheck {
	public static void main(String[] args){
		Consumer c1 = (msg) -> System.out.println(msg);
		c1.accept("Hello");
	}

}
