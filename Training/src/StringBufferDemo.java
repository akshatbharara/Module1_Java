public class StringBufferDemo {
	public static void main(String[] args){
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println("buffer="+sb);
		System.out.println("length="+sb.length());
		System.out.println("capacity="+sb.capacity());
		String s;
		int a=51;
		StringBuffer sb1=new StringBuffer(40);
		s=sb1.append("a=").append(a).append("!").toString();
		System.out.println(s);
		StringBuffer sb2=new StringBuffer("! java");
		sb2.insert(2, "like");
		System.out.println(sb2);
	}

}
