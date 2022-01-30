package testNGPractice.testNGPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPTestDemo2 {
	
	
	@DataProvider(name = "Authentication")
	 
	  public Object[][] credentials() {
		
				
		
	 
	        // The number of times data is repeated, test will be executed the same no. of times
	 
	        // Here it will execute two times
		 	Object[][] obj=new Object[2][2];
		 	obj[0][0]="testuser_1";
		 	obj[0][1]="testpass_1";
		 	obj[1][0]="testuser_2";
		 	obj[1][1]="testpass_2";
		 	
	 
	       // return new Object[][] {{ "testuser_1","testpass_1"},{ "testuser_2","testpass_2"}, {"testuser_3","testpass_3"} };
		 	return obj;
	  }
	
	  @Test(dataProvider = "Authentication")
	  
	  public void test(String sUsername,String passWord) {
		  
		  
		  System.out.println("User Name :"+sUsername);
		  System.out.println("Pass Word :" +passWord);
		  
		  
		  
	  }

}
