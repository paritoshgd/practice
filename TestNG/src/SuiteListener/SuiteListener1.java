package SuiteListener;

import java.util.HashMap;
import java.util.Map;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.xml.XmlSuite;

public class SuiteListener1 implements ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		System.out.println("Start Suite"+suite.getName());
		XmlSuite xmlSuite= suite.getXmlSuite();
		if(!xmlSuite.getTests().isEmpty()) {
			Map params = new HashMap();
			//set the value of the parameter "ui"
			params.put("ui", "web");
			System.out.println("The value of the parameter is set in SuiteListener");
			xmlSuite.setParameters(params);
			
		}
		
	}

	@Override
	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		System.out.println("Suite Name  finishin execuiton"+suite.getName());
		
	}
	
	

}
