package InvokedMethodListener;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener2;
import org.testng.ITestContext;
import org.testng.ITestResult;

//This will invoke before every method of the test

public class InvokedMethodListener implements IInvokedMethodListener2 {

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		System.out.println("Before invocation of method "+method.getTestMethod().getMethodName());
		
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		System.out.println("After invocation of method "+method.getTestMethod().getMethodName());
		
	}

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Before invocation of method "+method.getTestMethod().getMethodName());
		
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("After invocation of method "+method.getTestMethod().getMethodName());
		
	}

}
