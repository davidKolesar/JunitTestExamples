package com.mycompany.basicOperationService;

import java.util.Random;
import java.util.UUID;

import com.mycompany.uniqueException.DivideByZeroArithmeticException;

public class TestMe {
	private static final Exception DivideByZeroArithmeticException = new DivideByZeroArithmeticException(
			"You cannot divide by zero");
	int max = 50;
	int min = 0;
	Random rand = new Random();
	int randomValue = rand.nextInt((max - min) + 1) + min;

	/*
	 * This class will thrown an exception if run outside of establish Junit test.
	 * The purpose of this is to emulate a mandatory database configuration.
	 */
	public void run() throws Exception {

		evaluateConnection();

		// Adds 2 to a random number
		addTwo(randomValue);

		// generatesRandomString
		String randomData = generateRandomString();

		// reverses a String
		reverseString(randomData);
	}

	private int evaluateConnection() {
		return (100 / min);
	}

	public int divideByZero() throws Exception {

		try {
			return 50 / 0;
		} catch (ArithmeticException e) {
			throw (DivideByZeroArithmeticException);
		}

	}

	public String generateRandomString() {
		// changes a random UUID into a String
		String randomUuid = UUID.randomUUID().toString();

		// creates random string of characters
		String randomChars = Long.toHexString(Double.doubleToLongBits(Math.random()));

		return randomChars + randomUuid;

	}

	public int addTwo(int randomNumber) {
		return randomNumber + 2;
	}

	public String reverseString(String original) {
		return new StringBuilder(original).reverse().toString();
	}

	public boolean emulateDatabaseConnection() {
		min = 1;
		return true;
	}

}
