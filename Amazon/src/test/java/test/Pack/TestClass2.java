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

public class TestClass2 {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite TestClass2 ");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest TestClass2 ");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass TestClass2");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod TestClass2");
	}
	
	@Test
	public void testA() {
		System.out.println("TestA TestClass2 ");
	}
	
	@Test
	public void testB() {
		System.out.println("TestB TestClass2");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod TestClass2");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass TestClass2");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest TestClass2");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite TestClass2");
	}
	

}
