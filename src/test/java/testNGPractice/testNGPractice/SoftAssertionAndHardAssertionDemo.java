package testNGPractice.testNGPractice;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionAndHardAssertionDemo {
	
	SoftAssert softAssert=new SoftAssert();
	
	@Test
	public void assertionTypes() {
		
		System.out.println("Landing Page ");
		
		try {
			Assert.assertEquals(true, false);
		}catch(Throwable t) {
			System.out.println(t);
		}
		
		
		System.out.println("Login Page ");
		Assert.assertEquals(true, true);
		System.out.println("Home Page Test");
		softAssert.assertEquals(true, false);
		System.out.println("Search Page Test");
		softAssert.assertEquals(true, false);
		softAssert.assertAll();
		
	
		
		WebDriver driver=new ChromeDriver();
		
		//
		
		
		
		
		
		
	}

}
