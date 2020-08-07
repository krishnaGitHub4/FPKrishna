package com.testing;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFile {
	PageFile pf = new PageFile();
  
	
	
  @ BeforeMethod
  public void beforemethod() throws Exception
  {
	  pf.openBrowser();
	  pf.openURL();
  }
  
  @ Test 
  public void Test1() throws Exception  
  {
	  pf.invalidLogin();
	  pf.errorValidation();
	  
  }
   
  @Test
  public void Test2() throws Exception
  {
	   pf.validLogin();
	   pf.pgCount();
	   pf.totalCount();
	   pf.movetotrash();
	   pf.totalCount();
	   pf.backToInbox();
	   pf.totalCount();
	   pf.readToUnread();
  }
  
  @AfterMethod
  public void afterMethod(ITestResult result)
  {
	  pf.closeBrowser();
  }
  
  
  
  
  
  

 
   
  
  
  
  
  
  
  
  
  
  
  
}
