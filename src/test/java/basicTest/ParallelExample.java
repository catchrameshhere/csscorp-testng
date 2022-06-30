package basicTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExample {
	@Parameters({"browser"})
	@Test
	public void testCase(String browser) {
		System.out.println("browser used = " + browser);
	}
}
