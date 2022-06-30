package basicTest;

import org.testng.annotations.Test;

public class InvocationCountExample {
	@Test
	public void create() {
		System.out.println("from create tc");
	}

	@Test(invocationCount = 10)
	public void update() {
		System.out.println("from update tc");
	}


	@Test
	public void delete() {
		System.out.println("from delete tc");
	}

}
