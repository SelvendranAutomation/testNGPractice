package testNGPractice.testNGPractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WDTest {
	//WebDriver driver;
	ChromeDriver driver;
	@BeforeClass
	public void lanch()
	
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@Test
	public void test() {
		
		
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.close();
		System.out.println();
	}
}
