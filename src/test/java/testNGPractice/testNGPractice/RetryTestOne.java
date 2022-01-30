package testNGPractice.testNGPractice;

import org.testng.annotations.Test;

import RetryAnalyzerClass.RetryAnalyzer;

public class RetryTestOne extends RetryAnalyzer{
	 

	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void test1() {



		System.out.println("I am in Google 1 and Running in "+Thread.currentThread().getId());
		TestBase.getDriver();
		TestBase.intialize();
		TestBase.getDriver().get("https://www.google.com/");
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void test2() {
		TestBase.getDriver();
		TestBase.intialize();
		System.out.println("I am in testng and Running in "+Thread.currentThread().getId());
		TestBase.getDriver().get("https://testng.org/");
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void test3() {

		TestBase.getDriver();
		TestBase.intialize();
		System.out.println("I am in selenium and Running in "+Thread.currentThread().getId());
		TestBase.getDriver().get("https://www.selenium.dev/downloads/");
	}
}
