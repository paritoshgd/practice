import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
	
	@Test
	public void testOne() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void testTwo() {
		
		Assert.assertFalse(true);
	}
	
	@Test(dependsOnMethods= {"testTwo"})
	public void testThree() {
		Assert.assertTrue(true);
	}
	
	
	

}
