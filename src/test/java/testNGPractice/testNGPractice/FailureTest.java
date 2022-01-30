package testNGPractice.testNGPractice;

import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListener.class)
public class FailureTest extends TestBase2{
	
	@BeforeTest
	public void setUp() {
		
		intialize();
	}
	
	@AfterTest
	public void dearDown() {
		
		driver.close();
	}
	@Test
	public void launchHomePage() {
		
		Assert.assertEquals(false, true);
	}

}
