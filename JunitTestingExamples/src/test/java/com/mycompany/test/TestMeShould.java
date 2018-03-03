package com.mycompany.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Test;

import com.mycompany.basicOperationService.TestMe;
import com.mycompany.uniqueException.DivideByZeroArithmeticException;

public class TestMeShould {
	Random rand = new Random();
	TestMe testMe = new TestMe();
	private int max = 50;
	private int min = 1;
	int randomValue = rand.nextInt((max - min) + 1) + min;

	@Test
	public void exist() {
		assertNotNull(testMe);
	}

	@Test
	public void reverseString() {
		String original = "original"; // Arrange
		String reversed = testMe.reverseString(original); // Act
		assertEquals("lanigiro", reversed); // Assert

	}

	@Test
	public void addToRandom() {
		assertEquals(randomValue + 2, testMe.addTwo(randomValue));
	}

	@Test
	public void generateRandomString() {
		String firstRandom = testMe.generateRandomString();
		String secondRandom = testMe.generateRandomString();

		assertTrue(!firstRandom.equals(secondRandom));
	}

	@Test(expected = DivideByZeroArithmeticException.class)
	public void throwUniqueException() throws Exception {
		testMe.run();
	}

	@Test
	public void throwSpecificErrorLog() throws Exception {

		String specificError = "You cannot divide by zero";
	
		try {
			testMe.run();
		} catch (DivideByZeroArithmeticException e) {
			assertTrue(e.getError().equals(specificError));
		}

	}

}
