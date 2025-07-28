package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.bassclass.BaseClass;
import com.interfacewebelement.ResumeUploadInterFaceElements;

import pageObjectManager.PageObjectManager;

public class ResumeUploadPage extends BaseClass implements ResumeUploadInterFaceElements {
	
	@FindBy(xpath=uploadResume_xpath)
	private WebElement uploadResume;
	


public void resumeUploadPage() {
	PageFactory.initElements(driver, this);
	
}
public void NaukriResumeUpload() {
	javascriptExecutorClick(uploadResume);
}
}
	
	

