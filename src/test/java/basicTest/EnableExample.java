package basicTest;

import org.testng.annotations.Test;

public class EnableExample {
	@Test
	public void create() {
		System.out.println("from create tc");
	}

	@Test(enabled = false)
	public void update() {
		System.out.println("from update tc");
	}


	@Test(alwaysRun = true)
	public void delete() {
		System.out.println("from delete tc");
	}

}
