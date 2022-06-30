package basicTest;

import org.testng.annotations.Test;


@Test(groups = {"regression"})//partial groups or default groups
public class GroupsExample {
	@Test
	public void tc1() {
		System.out.println("from tc-1");
	}

	@Test(groups = {"smoke"})
	public void tc2() {
		System.out.println("from tc-2");
	}

	@Test
	public void tc3() {
		System.out.println("from tc-3");
	}

	@Test(groups = {"smoke"})
	public void tc4() {
		System.out.println("from tc-4");
	}

	@Test
	public void tc5() {
		System.out.println("from tc-5");
	}


}
