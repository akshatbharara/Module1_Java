
public abstract class AbstractDemo {
	void add(){
		int a =3 , b=4;
		System.out.println("add="+a+b);
	}
	void sub(){
		int c=4, d=1;
		System.out.println("sub= "+(c-d));
		
	}
	abstract void mul();
	
	public class abc extends AbstractDemo{
		
	}

}
