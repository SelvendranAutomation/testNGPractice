package testNGPractice.testNGPractice;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PrerequsiteAnotationsTest {
	
	
	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println("@BeforeSuite Anotation");
	}
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("@BeforeClass Anotation");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("@BeforeMethod Anotation");
	}
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("@BeforeTest Anotation");
	}
	
	@Test
	public void test() {
		
		System.out.println("@Test Anotation");
	}

}
