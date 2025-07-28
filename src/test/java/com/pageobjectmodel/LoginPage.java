package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.bassclass.BaseClass;
import com.interfacewebelement.LoginInterfaceWebelement;

import pageObjectManager.PageObjectManager;

public class LoginPage extends BaseClass implements LoginInterfaceWebelement {
	
	@FindBy(linkText=loginbtn_linkText)
	private WebElement Loginbtn ;
//	WebElement login = driver.findElement(By.linkText("Login"));
	
	@FindBy(xpath = Username_xpath)
	private WebElement username;

	@FindBy(xpath=Password_xpath)
    private WebElement password;
	
	@FindBy(xpath=signbtn_xpath)
	private WebElement signbtn;
		

	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}

	public void naukriLogin() throws IOException {
		elementClick(Loginbtn);
		javascriptExecutorSendKeys(username, PageObjectManager.getPageObjectManager().getfileReader().getDataProperty("username"));
		javascriptExecutorSendKeys(password, PageObjectManager.getPageObjectManager().getfileReader().getDataProperty("password"));
	   javascriptExecutorClick(signbtn);
		
	}

}
