package ExecutionListener;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExecutionListenerExample {
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("I am before class");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("I am before test");
	}
	@Test
	public void testRun() {
		System.out.println("This is a test run");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("I am after test");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("I am after class");
	}
	
	
	

}
