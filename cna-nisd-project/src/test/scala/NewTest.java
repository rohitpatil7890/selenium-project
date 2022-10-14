import org.testng.annotations.Test;

import baseclasses.BaseClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest extends BaseClass {
  @Test
  public void f() {
	  System.out.println("Hi");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Hi");
	  
	  
	 
	  
  }
  
  @Test()		
  public void verifytitle()					
  {		
  	//Verifying the title of the home page		
  	Assert.assertEquals(driver.getTitle(),"Guru99 Bank Manager" );					
  }
  @Test()		//priority=2
  public void verifytitle11()					
  {		
  	//Verifying the title of the home page		
 	Assert.assertEquals(driver.getTitle(),"Guru99 Bank Manager" );					
  }

  @AfterMethod
  public void afterMethod2() {
	  System.out.println("Hi");
  }

  @BeforeClass
  public void beforeClass2() {
	  System.out.println("Hi");
  }

  @AfterClass
  public void afterClass2() {
	  System.out.println("Hi");
  }

  @BeforeTest
  public void beforeTest2() {
	  System.out.println("Hi");
  }

  @AfterTest
  public void afterTes2t() {
	  System.out.println("Hi");
  }

  @BeforeSuite
  public void beforeSuite2() {
	  System.out.println("Hi");
  }

  @AfterSuite
  public void afterSuite2() {
	  System.out.println("Hi");
  }
  @Test(priority=2)		
  public void verifytitle1()					
  {		
  	//Verifying the title of the home page		
 // 	Assert.assertEquals(driver.getTitle(),"Guru99 Bank Manager" );					
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Hi");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Hi");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Hi");
  }

 

}
