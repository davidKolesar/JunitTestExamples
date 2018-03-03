package com.mycompany.basicOperationService;

import java.util.Random;
import java.util.UUID;

import com.mycompany.uniqueException.DivideByZeroArithmeticException;

public class TestMe {
	private static final Exception DivideByZeroArithmeticException = new DivideByZeroArithmeticException(
			"You cannot divide by zero");
	int max = 50;
	int min = 1;
	Random rand = new Random();
	int randomValue = rand.nextInt((max - min) + 1) + min;

	public void run() throws DivideByZeroArithmeticException {

		// Adds 2 to a random number
		addTwo(randomValue);

		// generatesRandomString
		String randomData = generateRandomString();

		// reverses a String
		reverseString(randomData);

		// throw unique error
		try {
			divideByZero();
		} catch (ArithmeticException e) {
			// TODO HANDLE THIS EXCEPTION SO IT DOES SOMETHING UNIQUE
		}

	}

	private int divideByZero() {
		return 50 / 0;

	}

	private String generateRandomString() {
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
		String reversedOriginal = "";

		for (int i = 0; i < original.length(); i++) {
			char[] originalLetters = new char[original.length()];
			originalLetters[original.length() - i - 1] = original.charAt(i);
			String reversingOriginal = new String(originalLetters);
			reversedOriginal = reversingOriginal;
		}
		return reversedOriginal;
	}

}
