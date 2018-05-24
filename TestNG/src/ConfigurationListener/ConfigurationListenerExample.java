package ConfigurationListener;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationListenerExample {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After class");
	}
	
	@Test
	public void checkTest() {
		System.out.println("This is a proper Test");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After test");
	}
}
