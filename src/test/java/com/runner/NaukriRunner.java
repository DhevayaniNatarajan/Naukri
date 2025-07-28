package com.runner;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bassclass.BaseClass;
import com.pageobjectmodel.LoginPage;

import pageObjectManager.PageObjectManager;

public class NaukriRunner extends BaseClass {
	
	@Test
	public void LaunchBrowserMethod() throws IOException {
		launchBrowser(PageObjectManager.getPageObjectManager().getfileReader().getDataProperty("browser"));
		launchUrl(PageObjectManager.getPageObjectManager().getfileReader().getDataProperty("url"));
		
//		PageObjectManager.getPageObjectManager().getLoginPage().naukriLogin();
//		PageObjectManager.getPageObjectManager().getProfilePage().NaukriProfilePage();
//		PageObjectManager.getPageObjectManager().getresumeUploadPage().NaukriResumeUpload();
//		PageObjectManager.getPageObjectManager().getheadLinePage().NaukriHeadLinePage();
//		PageObjectManager.getPageObjectManager().getKeysSkillPage().NaukriKeySkillPage();
//		PageObjectManager.getPageObjectManager().getEmploymentPage().NaukriEmploymentPage();
//	
		
	}
	

}
