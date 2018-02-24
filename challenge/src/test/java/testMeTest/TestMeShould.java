package testMeTest;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import Foreground.TestMe;

public class TestMeShould {

	@Test
	public void exist() {
		TestMe testMe = new TestMe();
		assertNotNull(testMe);
	}
}
