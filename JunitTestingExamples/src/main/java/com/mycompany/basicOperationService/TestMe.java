package com.mycompany.basicOperationService;

import java.util.Random;

public class TestMe {
	int max = 50;
	int min = 1;
	Random rand = new Random();

	public void run() {
		int randomValue =  rand.nextInt((max - min) + 1) + min;
		
		//Adds 2 to a random number
		addTwo(randomValue);
		
		//reverses a String
		reverseString(String original);
		
	}

	public int addTwo(int randomValue) {
		return randomValue + 2;
	}
	
	public String reverseString(String original){
		String reversedOriginal = "";
		
		for(int i = 0;  i < original.length(); i++ ){
			char[] originalLetters = new char[original.length()];
			originalLetters[original.length() - i] = original.charAt(i);
			String reversingOriginal = new String(originalLetters);
			reversedOriginal = reversingOriginal;
		}
		return reversedOriginal;
		
	}
}
