package testNGPractice.testNGPractice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestBase2 {

	
	public static  WebDriver  driver;
	
	
	
	public static void intialize() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		//Maximize the screen
		driver.manage().window().maximize();
		//Delete all the cookies
		driver.manage().deleteAllCookies();
		//Implicit TimeOuts
		driver.manage().timeouts().implicitlyWait
		(30,TimeUnit.SECONDS);
		//PageLoad TimeOuts
		driver.manage().timeouts().pageLoadTimeout
		(30,TimeUnit.SECONDS);

	}
	
	public void failedScreen() {
		
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(srcFile, new File("./screenshots/take.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
