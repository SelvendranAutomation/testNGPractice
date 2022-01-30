package testNGPractice.testNGPractice;

import org.testng.annotations.Test;

import RetryAnalyzerClass.RetryAnalyzer;

public class RetryTestTwo extends RetryAnalyzer{
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void test4() {
		
		System.out.println("I am in Test 4 and Running in "+Thread.currentThread().getId());
		
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void test5() {
		
		System.out.println("I am in Test 5 and Running in "+Thread.currentThread().getId());
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void test6() {
		
		System.out.println("I am in Test 6 and Running in "+Thread.currentThread().getId());
	}
}
