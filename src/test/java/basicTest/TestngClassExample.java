package basicTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngClassExample {

	@Test
	public void tc1() {
		System.out.println("from tc1");
	}

	@Test
	public void tc2() {
		System.out.println("from tc2");
	}
	
	@BeforeMethod
	public void setup() {
		System.out.println("from setup");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("from tear down");
	}
	
	
}
