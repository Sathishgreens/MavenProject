package org.launch;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGSample {	
	@BeforeClass
	private void tc3() {
		System.out.println("Before Class");
	}
	@BeforeMethod
	private void tc5() {
		System.out.println("Before Method");
	}
	@Test(priority=1,invocationCount=3)
	private void tc1() {
		System.out.println("tc1");
	}
	@Test(priority=0,enabled=false)
	private void tc22() {
		System.out.println("tc2");
	}
	@AfterMethod
	private void tc2() {
		System.out.println("After Method");
	}
	@AfterClass
	private void tc4() {
		System.out.println("After Class");
	}
	
}
