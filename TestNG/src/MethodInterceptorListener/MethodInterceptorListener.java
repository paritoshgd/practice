package MethodInterceptorListener;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class MethodInterceptorListener implements IMethodInterceptor {

	@Override
	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
		// TODO Auto-generated method stub
		List results= new ArrayList();
		for(IMethodInstance m :methods ) {
			Test test = m.getMethod().getMethod().getAnnotation(Test.class);
			Set group= new HashSet<>();
			for(String groups:test.groups()) {
				System.out.println("group name "+groups);
				group.add(groups);
			}
				if (group.contains("perf"))
					results.add(m);
				else {
					String testMethod=	m.getMethod().getMethod().getName();
					System.out.println(testMethod + "  is not a performance method");
				}
			
		}
		return results;
	}

}
