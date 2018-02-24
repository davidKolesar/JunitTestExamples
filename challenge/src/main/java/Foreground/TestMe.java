package Foreground;

import java.util.Random;

public class TestMe {
	int max = 50;
	int min = 1;
	Random rand = new Random();

	public void run() {
		int randomValue =  rand.nextInt((max - min) + 1) + min;
		
		//Adds 2 to a random number
		addTwo(randomValue);
		
		
	}

	public int addTwo(int randomValue) {
		return randomValue + 2;
	}
}
