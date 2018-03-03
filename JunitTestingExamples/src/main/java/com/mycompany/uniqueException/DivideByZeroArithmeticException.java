package com.mycompany.uniqueException;

/*
This is an example of creating a unique exception
for the sake of handling exceptions in unique ways.
In this case, the ArithmeticException will indicate
if the user attempted to divide by zero*/
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
