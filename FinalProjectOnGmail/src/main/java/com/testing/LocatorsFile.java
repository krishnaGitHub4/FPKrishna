package com.testing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocatorsFile {
	// login
	@FindBy(xpath = "//*[@id=\"identifierId\"]") public WebElement emailSearchField;
	@FindBy(xpath = "//*[@id=\"identifierNext\"]/div/button") public WebElement nextButtonpg1;
	@FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input") public WebElement pwdSearchField;
	@FindBy(xpath = "//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div[2]/span") public WebElement errorMessage;
	@FindBy(xpath = "//*[@id=\"passwordNext\"]/div/button/div[2]") public WebElement nextButtonpg2;
	String expectedError = "Wrong password. Try again or click Forgot password to reset it.";
	//	E-mails counts
	@FindBy(xpath = "//*[contains(@class,\"ts\")][2]") public WebElement pgEmails;
	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[1]/div/div[1]/div[2]/div[1]/span/div[1]/span/span[2]") public WebElement totalEmails;
	//delete E-mail
	//@FindBy(partialLinkText = "vfdsvsdvs") public WebElement specialSelctedEm;
	//@FindBy(xpath="//*[@id=\":pj\"]")public WebElement specialSelctedEm1;
	//@FindBy(xpath="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[4]/div/table/tr/td[1]/div[2]")public WebElement specialSelctedEm2;
	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[1]/div[7]/div/div[1]/div[3]/div/table/tbody/tr[1]/td[2]")public WebElement emailChechbx;
	@FindBy(xpath = "//*[@id=\":4\"]/div/div[1]/div[1]/div/div/div[2]/div[3]") public WebElement trashBx;
	//E-mail move to Inbox
	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div/div[2]/span/span[2]/div") public WebElement moreBtn;
	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div/div[3]/div/div[1]/div/div[6]/div/div/div[1]") public WebElement trashbtn;
	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[2]/div[3]/div[2]/div/table/tbody/tr/td[2]/div") public WebElement deletedemail;
	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div[1]/div/div/div[5]/div[1]") public WebElement movetoinbox;
	@FindBy(xpath = "/html/body/div[29]/div") public WebElement allmovetoelements;
		
	//@FindBy(xpath = "/html/body/div[28]/div/div[6]/div") public WebElement inboxbtn;
	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div/div[1]/div[1]/div/div[1]/div/div/div[1]") public WebElement maininbox;
	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div/div[2]/span/span[2]") public WebElement lessBtn;
	//read to unread
	@FindBy(xpath="//*[contains(@title,'Inbox')]") public WebElement ele1;
	@FindBy(xpath = "//*[@id=\":4\"]/div/div[1]/div[1]/div/div/div[8]")public WebElement mainCheckBox;
	@FindBy(xpath = "//*[@id=\":kj\"]")public WebElement readBtn;
	@FindBy(xpath = "//*[@id=\":kk\"]")public WebElement unreadBtn;

	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[7]/div/div[1]/div[3]/div/table/tbody") public WebElement tBodyEmails;
	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[7]/div/div[1]/div[3]/div/table/tbody/tr[1]/td[10]/ul/li[3]") public WebElement tooltipmarkasRead;
	
}
