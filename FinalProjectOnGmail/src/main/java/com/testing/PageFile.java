package com.testing;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class PageFile extends LocatorsFile implements DataFile   {
	
	public WebDriver driver;
	
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\DEV_IT_TRAINING\\DIT_Selenium\\FinalProjectOnGmail\\ProjectData\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		PageFactory.initElements(driver, this);	
	}
	
	public void closeBrowser() 
	{		
		driver.close();
	}
	
	public void openURL() throws Exception 
	{	
		driver.get(URL);	
		Thread.sleep(2000);
		System.out.println("Open gmail login page.");
		
	}
	
	public void validLogin() throws InterruptedException 
	{
		Thread.sleep(2000);
		emailSearchField.sendKeys(validUser);
		nextButtonpg1.click();
		Thread.sleep(2000);
		pwdSearchField.sendKeys(validPwd);
		nextButtonpg2.click();
		Thread.sleep(1000);
		System.out.println("Login with valid credentials.");
	}
	
	public void invalidLogin() throws InterruptedException 
	{
		
		emailSearchField.sendKeys(invalidUser);
		nextButtonpg1.click();
		Thread.sleep(3000);
		pwdSearchField.sendKeys(invalidPwd);
		nextButtonpg2.click();
		System.out.println("Login with invalid credential(s)");
	}
				
	public void errorValidation() throws Exception
	{
		Thread.sleep(1000);
		String erroeM1 = errorMessage.getText();
		Assert.assertEquals(erroeM1, expectedError);
		System.out.println("The error is " + erroeM1); 
	} 
	
	public void pgCount() throws Exception
	{
		Thread.sleep(3000);
		String pageEmails = pgEmails.getText();
		System.out.println("No of emails in inbox first page is " + pageEmails);
		Thread.sleep(3000);
	}
	//Print total number of emails in your Inbox.
	
	public void totalCount() throws Exception 
	{
		
		String totalEms = totalEmails.getText();
		System.out.println("-----------------Total number of emails in inbox is " + totalEms + "----------------");
	}
		
	public void movetotrash() throws Exception
	{
			Thread.sleep(3000);
			emailChechbx.click();
			Thread.sleep(2000);
			System.out.println("email checkbox selected.");
			Thread.sleep(2000);
			trashBx.click();
			Thread.sleep(2000);
			System.out.println("Selected email move to trash.");
	}
	
	public void backToInbox() throws Exception
	{
		Thread.sleep(2000);
		moreBtn.click();
		trashbtn.click();
		System.out.println("Enter into Trash");
		Thread.sleep(2000);
		deletedemail.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.contextClick(deletedemail).build().perform();
		builder.sendKeys(Keys.ARROW_DOWN).build().perform();
		builder.sendKeys(Keys.ARROW_DOWN).build().perform();
		builder.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		builder.sendKeys(Keys.ENTER).build().perform();
		System.out.println("Inbox  button selected.");
		Thread.sleep(2000);
		lessBtn.click();
		maininbox.click();
		Thread.sleep(3000);
	}
	
	public void readToUnread() throws Exception
	{
		String expectedTooltipUNR = "Mark as unread";
		String expectedTooltipRD = "Mark as read";
		emailChechbx.click();
		Thread.sleep(1000);
		
		tooltipmarkasRead.click();
		Thread.sleep(2000);
		String actualTooltip1 = tooltipmarkasRead.getAttribute("data-tooltip");
		Assert.assertEquals(actualTooltip1, expectedTooltipUNR);
		System.out.println("E-mail marked as read");
		 	
		Thread.sleep(2000);
		tooltipmarkasRead.click();
		Thread.sleep(3000);
		String actualTooltip2 = tooltipmarkasRead.getAttribute("data-tooltip");
		Assert.assertEquals(actualTooltip2, expectedTooltipRD);
		System.out.println("E-mail marked as unread");
		 
		
	}
	
	

	
		}
