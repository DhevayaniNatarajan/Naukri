package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bassclass.BaseClass;
import com.interfacewebelement.KeysSkillsInterFaceElements;

public class KeySkillsPage extends BaseClass implements KeysSkillsInterFaceElements {
	
	@FindBy(xpath = KeysSkill_xpath)
	private WebElement keyskill;
	
	
	private void KeySkillPage() {
		PageFactory.initElements(driver, this);

	}
	public void NaukriKeySkillPage() {
		javascriptExecutorClick(keyskill);
	}

}
