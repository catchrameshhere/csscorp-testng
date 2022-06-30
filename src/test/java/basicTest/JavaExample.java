package basicTest;

public class JavaExample {
	
	public void setup() {
		System.out.println("from setup");
	}
	
	public void tearDown() {
		System.out.println("from tear down");
	}
	
	public void tc1() {
		System.out.println("from tc1");
	}
	
	public void tc2() {
		System.out.println("from tc2");
	}

	public static void main(String[] args) {
		JavaExample obj = new JavaExample();
		
		obj.setup();
		obj.tc1();
		obj.tearDown();
		
		obj.setup();
		obj.tc2();
		obj.tearDown();
	}

}
