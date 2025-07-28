package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.bassclass.BaseClass;
import com.interfacewebelement.ProfilePageInterfaceElements;

public class ProfilePage extends BaseClass implements ProfilePageInterfaceElements {

	@FindBy(xpath=profilePage_xpath)
	private WebElement profilePage;
	
	@FindBy(xpath=updateProfilePage_xpath)
	private WebElement updateProfilePage;
	
	public ProfilePage() {
		PageFactory.initElements(driver, this);
	}
	@Test
	public void NaukriProfilePage() {
		implicitWait(30);
       javascriptExecutorClick(profilePage);
       javascriptExecutorClick(updateProfilePage);
	}
	
}
