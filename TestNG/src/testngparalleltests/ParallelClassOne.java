package testngparalleltests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParallelClassOne {
 
	@BeforeClass
	   public void printTestName() {
		   
		   System.out.println("TestName Executing is  "+Thread.currentThread().getId());
		   
	   }
	
	   
	   @BeforeMethod()
	   public void beforeMethod() {
		   System.out.println("Before Method is executing"+Thread.currentThread().getId());
	   }
	   
	   @BeforeTest()
	   
	   public void beforeTest() {
		   System.out.println("I am BeforeTest. I execute before BeforeMethod"+Thread.currentThread().getId());
	   }
	   
	   
	   @Test (dataProvider="getData")
	   public void useData(String userName,String password) {
		   System.out.println("UserName "+userName+" Password "+password  );
	   }
	  
	   
	   @DataProvider
	   public  Object[][] getData(){
		   
		   Object[][]data= new Object[3][2];
		   
		   data[0][0]= "sampleuser";
		   data[0][1]="sample password";
		   
		  data[1][0]="s";
		   data[1][1]="p";
		return data;
		   
		   
	   }
	   
	  @Test
	  public void classOneTest() {
		  
		  System.out.println("I am test method of  "+Thread.currentThread().getId());
	  }
	  
	  
}
