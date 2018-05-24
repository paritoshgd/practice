package testngparalleltests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelClassTwo {
	
   @BeforeClass
   public void printTestName() {
	   
	   System.out.println("TestName Executing is  "+Thread.currentThread().getId());
	   
   }
    
   @BeforeMethod()
   public void beforeTestMethod() {
	   System.out.println("Before Method is executing"+Thread.currentThread().getId());
   }
	 
   public void beforeTest() {
	   System.out.println("I am BeforeTest. I execute before BeforeMethod"+Thread.currentThread().getId());
   }
	
   
  @Test
  public void classTwoTest() {
	  
	  System.out.println("I am test method of  "+Thread.currentThread().getId());
  }
  
 
  
}
