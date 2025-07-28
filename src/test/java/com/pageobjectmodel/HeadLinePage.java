package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bassclass.BaseClass;
import com.interfacewebelement.HeadLineInterFaceElements;

public class HeadLinePage extends BaseClass implements HeadLineInterFaceElements {
	
	@FindBy(xpath=Headline_xpath)
	private WebElement headline;



public void HeadLinePage() {
	PageFactory.initElements(driver, this);
	
}
	public void NaukriHeadLinePage() {
		javascriptExecutorClick(headline);
	}
				
	
}
