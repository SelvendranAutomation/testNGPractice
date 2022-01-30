package testNGPractice.testNGPractice;

import org.testng.annotations.Test;

public class ParallelTestDemo2 {
	
	
	@Test
	public void test1() {
		
		System.out.println("I am in test 1 of 2 | ID :"+Thread.currentThread().getId()+"| Name : "+Thread.currentThread().getName());
	}
	
	@Test
	public void test2() {
		
		System.out.println("I am in test 2 of 2 | ID :"+Thread.currentThread().getId()+" | Name : "+Thread.currentThread().getName());
	}
			

}
