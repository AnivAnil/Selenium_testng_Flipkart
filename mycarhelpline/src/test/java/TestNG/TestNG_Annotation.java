package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotation {
  
	@BeforeSuite
	private void beforesuite() {
		System.out.println(" this is before suite");
		

	}
	@BeforeTest
	private void beforetest() {
		System.out.println(" this is before test");

	}
	@BeforeClass
	private void beforeclass() {
		System.out.println(" this is before class");

	}
	
	@BeforeMethod
	private void beforemethod() {
		System.out.println( " this is before method");

	}
	
	@Test
	private void Test() {
		System.out.println(" this is test");
	}
	
	@AfterMethod
	private void aftermethod() {
		System.out.println(" this is after method");
	}
	
	@AfterClass
	private void afterclass() {
		System.out.println(" this is after class");
	}
	
	@AfterTest
	private void aftertest() {
		
		System.out.println(" this is after test");
	}
	
	@AfterSuite
	private void AfterSuite() {
		System.out.println(" this is after suite");

	}
	
	
	
	
	
	
	
	
	
	
}
