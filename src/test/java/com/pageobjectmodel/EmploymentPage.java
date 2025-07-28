package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bassclass.BaseClass;
import com.interfacewebelement.EmploymentPageInterfaceElements;

public class EmploymentPage extends BaseClass implements EmploymentPageInterfaceElements {
	
	@FindBy(xpath=EmploymentPage_xpath)
	private WebElement employmentPage;
	@FindBy(xpath=CurrentEmployment_xpath)
	private WebElement currentEmployment;
	@FindBy(xpath=Employmenttype_xpath)
	private WebElement employmenttype;
	@FindBy(xpath=totalexperience_xpath)
	private WebElement totalExperience;
	@FindBy(xpath=ExperienceMonth_xpath)
	private WebElement experienceMonth;
	@FindBy(xpath=JoinDate_xpath)
	private WebElement joinDate;
	@FindBy(xpath=JoinMonth_xpath)
	private WebElement joinMonth;
	@FindBy(xpath=CurrencySym_xpath)
	private WebElement currencySym;
	@FindBy(xpath=Currency_xpath)
	private WebElement currency;
	@FindBy(xpath=SkillsUsed_xpath)
	private WebElement skillsUsed;
	@FindBy(xpath=JobProfile_xpath)
	private WebElement jobProfile;
	@FindBy(xpath=Savebtn_xpath)
	private WebElement saveBtn;
	
	public void employmentPage() {
		PageFactory.initElements(driver, this);

}
	public void NaukriEmploymentPage() {
		javascriptExecutorClick(employmentPage);

	}
	
}
