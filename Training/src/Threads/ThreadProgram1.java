package Threads;

public class ThreadProgram1 implements Runnable{


	public void run(){
		System.out.println("Hello .. Welcome to capgemini");
	}
	public static void main(String[] arg){
		ThreadProgram1 rx = new ThreadProgram1();
		Thread t = new Thread(rx);
		t.start();
		System.out.println(t.getName());
		t.setName("a");
		System.out.println(t.getName());
		System.out.println(t.isAlive());
		System.out.println(t.getPriority());
	}

}
