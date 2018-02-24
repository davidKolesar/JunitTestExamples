package com.mycompany.uniqueException;

public class DivideByZeroArithmeticException extends ArithmeticException{

	private static final long serialVersionUID = 1L;
	private String error;

	
	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
	public DivideByZeroArithmeticException(String error) {
		this.error = error;
	}
	
}
