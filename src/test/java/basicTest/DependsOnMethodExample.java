package basicTest;

import org.testng.annotations.Test;

public class DependsOnMethodExample {
	@Test
	public void create() {
		System.out.println("from create tc");
	}

	@Test(dependsOnMethods = {"create"})
	public void update() {
		System.out.println("from update tc");
	}


	@Test(dependsOnMethods = {"update"})
	public void delete() {
		System.out.println("from delete tc");
	}

}
