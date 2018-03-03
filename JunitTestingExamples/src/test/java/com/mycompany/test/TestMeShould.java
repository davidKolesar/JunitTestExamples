package com.mycompany.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Random;

import org.junit.Test;

import com.mycompany.basicOperationService.TestMe;

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
	public void addToRandom() {
		
		assertEquals(randomValue + 2, testMe.addTwo(randomValue));
		
		
	}

}
