package ConfigurationListener;

import org.testng.IConfigurationListener2;
import org.testng.ITestResult;

//is the listener interface for events related to configuration methods.
//like @beforesuite,@beforeclass,@beforemethod,@beforetest,@aftersuite,@afterclass,@aftermethod not for @test
public class ConfigurationListener implements IConfigurationListener2 {

	@Override
	public void onConfigurationSuccess(ITestResult itr) {
		// TODO Auto-generated method stub
		System.out.println("on configuration success");	
	}

	@Override
	public void onConfigurationFailure(ITestResult itr) {
		// TODO Auto-generated method stub
		 System.out.println("on configuration failure");

		
	}

	@Override
	public void onConfigurationSkip(ITestResult itr) {
		// TODO Auto-generated method stub
		System.out.println("on configuration skip");  
		
	}

	@Override
	public void beforeConfiguration(ITestResult tr) {
		// TODO Auto-generated method stub
		System.out.println("Called Before Configuration is invoked " );
	}

}
