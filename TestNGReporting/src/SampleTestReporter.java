import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;

public class SampleTestReporter  implements IReporter{

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		// TODO Auto-generated method stub
		
		for(ISuite suite: suites) {
			
			String suiteName = suite.getName();
			Map<String,ISuiteResult> suiteResults=suite.getResults();
			
			for(ISuiteResult sr :suiteResults.values()) {
				ITestContext iTC=sr.getTestContext();
				System.out.println("Passed test results  "+iTC.getPassedTests().getAllResults().size());
				System.out.println("Failed tests results  "+iTC.getFailedTests().getAllResults().size());
				System.out.println("Skipped tests  "+iTC.getSkippedTests().getAllResults().size());
			}
		}
		
	}

}
