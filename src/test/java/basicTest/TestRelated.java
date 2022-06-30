package basicTest;

import org.testng.annotations.Test;

public class TestRelated {
	@Test(description = "valid username and password check")
	public void login() {
		System.out.println("from login");
	}
}
