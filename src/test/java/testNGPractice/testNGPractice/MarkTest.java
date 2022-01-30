package testNGPractice.testNGPractice;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MarkTest {
	WebDriver driver =null;
@BeforeTest	
	public void intialize() {
		System.setProperty("webdriver.chrome.driver", "./driverUpdated/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://35.238.249.190:8000/index.html");
	
}

@Test
public void testMarK() {
	
	List<String> subjects=new ArrayList();
	List<String> tatalMark=new ArrayList();
	
	int totalmark = 0;
	List rowOfTable=driver.findElements(By.xpath("//table/tbody/tr"));
	List colOfTable=driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
	
	System.out.println("No of row"+rowOfTable.size());
	System.out.println("No of col"+colOfTable.size());
	
	for(int i=2;i<=rowOfTable.size();i++) {
		for(int j=3;j<=colOfTable.size();j++) {
			if(j!=colOfTable.size())
			subjects.add(driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText());
			else				
				tatalMark.add(driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText());
			
			//System.out.println(driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText());
			
		}
		for(String indi:subjects) {
			//System.out.println(subjects.size());
			//System.out.println(indi);
			Assert.assertTrue(!indi.isEmpty());
			int sub=Integer.parseInt(indi);
			totalmark=totalmark+sub;
			Assert.assertTrue(sub>=0&&sub<=100);
			
			
		}
		
		for(String total:tatalMark) {
			
			
			Assert.assertTrue(!total.isEmpty());
			int tot=Integer.parseInt(total);	
			
			System.out.println(total);
			System.out.println(totalmark);
			Assert.assertTrue(tot==totalmark);
			
			
		}
		subjects.clear();
		tatalMark.clear();
		totalmark = 0;
		
		}
	
	
	
	
}
}
