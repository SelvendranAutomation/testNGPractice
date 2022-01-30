package testNGPractice.testNGPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPTestDemo {
	
	
	@DataProvider(name = "Authentication")
	 
	  public Object[] credentials() {
	 
	        // The number of times data is repeated, test will be executed the same no. of times
	 
	        // Here it will execute two times
	 
	        return new Object[] { "testuser_1", "Test@123" ,"testuser_2", "Test@1234" };
	 
	  }
	
	  @Test(dataProvider = "Authentication")
	  
	  public void test(String sUsername) {
		  
		  
		  System.out.println("User Name :"+sUsername);
		  
		  
		  
	  }

}
