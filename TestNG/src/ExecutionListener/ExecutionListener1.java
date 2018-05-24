package ExecutionListener;
import org.testng.*;

public class ExecutionListener1 implements IExecutionListener {

	@Override
	public void onExecutionStart() {
		// TODO Auto-generated method stub
		System.out.println("Sending email before start of Suite Run");
		
	}

	@Override
	public void onExecutionFinish() {
		// TODO Auto-generated method stub
		System.out.println("Sending email after end of Suite Run");
		
	}
	
	

}
