package testNGPractice.testNGPractice;

import org.testng.annotations.Test;

public class ParallelTestDemo {
	
	
	@Test
	public void test1() {
		
		System.out.println("I am in test 1 of 1 | ID :"+Thread.currentThread().getId()+"| Name : "+Thread.currentThread().getName());
	}
	
	@Test
	public void test2() {
		
		System.out.println("I am in test 2 of 1 | ID :"+Thread.currentThread().getId()+" | Name : "+Thread.currentThread().getName());
	}
			

}
