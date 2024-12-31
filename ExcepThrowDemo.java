package edu.peters.session;

public class ExcepThrowDemo {

	public static void main(String[] args) {
		//throw throws
		
		System.out.println("hello");
		System.out.println("world");
		try {
			if(1==1) throw new ArithmeticException("peter college Exception");
			
		}catch(ArithmeticException e) {
			System.out.println("error occured.");
			e.printStackTrace();
		}
		System.out.println("hello1");
		System.out.println("world1");
		System.out.println("hello2");

	}

}
