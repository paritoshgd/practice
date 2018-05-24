package MethodInterceptorListener;

import org.testng.annotations.Test;

public class MethodInterceptorListenerExample {
	@Test(groups="perf")
	public void t1() {
		System.out.println("test method: t1");
	}
	
	@Test
	public void t2() {
		System.out.println("test method: t2");
	}
	
	@Test(groups="perf1")
	public void t3() {
		System.out.println("test method: t3");
	}
}