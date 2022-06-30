package basicTest;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataproviderExample {
	@Test(dataProvider = "dp")
	public void login(String username, String password) {
		System.out.println("username" + username);
		System.out.println("password = " + password);
	}

	@DataProvider
	public String[][] dp() {
		return new String[][] {
			new String[] {"dan@gmail.com", "test1234" },
			new String[] {"invalid-dan@gmail.com", "test1234" },
			new String[] {"dan@gmail.com", "invalid-test1234" },
			new String[] {"invalid-dan@gmail.com", "invalidtest1234" },
			new String[] {"", "test1234" },
			new String[] {"dan@gmail.com", "" },
			new String[] {"", "" },
		};
	}
}
