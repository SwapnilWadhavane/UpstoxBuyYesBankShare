package test.Pack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1 {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite TestClass1 ");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest TestClass1 ");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass TestClass1");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod TestClass1");
	}
	
	@Test
	public void testA() {
		System.out.println("TestA TestClass1 ");
	}
	
	@Test
	public void testB() {
		System.out.println("TestB TestClass1");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod TestClass1");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass TestClass1");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest TestClass1 ");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite TestClass1");
	}
	
}
