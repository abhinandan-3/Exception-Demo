package edu.peters.session;

public class InSufficientBalanceException {
	String message;

	public InSufficientBalanceException(String message) {
		super();
		this.message = message;
	}
	@Override
	public String toString() {
		return "InSufficientBalanceException [message=" + message + "]";
	}
	}

