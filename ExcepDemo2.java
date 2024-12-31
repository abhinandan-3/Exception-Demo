package edu.peters.session;

public class ExcepDemo2 {

	public static void main(String[] args) {
		int[] num= {1,2,3};
		for(int i=0;i<3;i++) {
			System.out.println(num[i]);
		}
		try {
			System.out.println(num[1]);
		}catch(Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		System.out.println("st peters college");
		System.out.println("Java");
		}
	}

