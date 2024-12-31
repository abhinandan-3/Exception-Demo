package edu.peters.session;

public class BankExceptionDemo {

	public static void main(String[] args) {
		SBIBank sbi = new SBIBank(10000);
		
		sbi.withdraw(1000);
		sbi.withdraw(500);
		sbi.withdraw(100);
		
		sbi.deposit(1000);
		sbi.deposit(200);
		sbi.deposit(10);
			
	}

}
