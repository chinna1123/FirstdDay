package org.test;

public class Singleton {
	static Singleton sing;
	private Singleton()
	{
	}

	public static Singleton getInstance()
	{
		if(sing==null)
		{
			sing=new Singleton();
		}
		return sing;
	}
	private void getID() {
		// TODO Auto-generated method stub
		System.out.println("your id is 8635");
	}
	public  static void getName() {
		System.out.println("Your name is Ravi");
	}
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		instance.getID();
		getName();
	}


}
