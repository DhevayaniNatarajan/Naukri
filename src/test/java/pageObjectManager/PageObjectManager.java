package pageObjectManager;

import com.pageobjectmodel.EmploymentPage;
import com.pageobjectmodel.HeadLinePage;
import com.pageobjectmodel.KeySkillsPage;
import com.pageobjectmodel.LoginPage;
import com.pageobjectmodel.ProfilePage;
import com.pageobjectmodel.ResumeUploadPage;
import com.utility.NaukriFileReaderManager;

public class PageObjectManager {
	
	private static LoginPage loginPage;
	private static PageObjectManager pageObjectManager;
	private static NaukriFileReaderManager fileReader;
	private static ProfilePage profilePage;
	private static ResumeUploadPage resumeUploadPage;
	private static HeadLinePage headLinePage;
	private static KeySkillsPage keysSkillPage;
	private static EmploymentPage employmentPage;
		


public static KeySkillsPage getKeysSkillPage() {
		if(keysSkillPage==null) {
			keysSkillPage= new KeySkillsPage();
		}
		return keysSkillPage;
	}

public PageObjectManager() {
		
	}

	public static PageObjectManager getPageObjectManager() {
		if(pageObjectManager == null) {
			pageObjectManager = new PageObjectManager();
		}
		return pageObjectManager;
	}

	public static LoginPage getLoginPage() {
		if(loginPage == null) {
		loginPage = new LoginPage();
		}
		
		return loginPage;
	}
	public static NaukriFileReaderManager getfileReader() {
		if(fileReader == null) {
			fileReader = new NaukriFileReaderManager();
		}
		return fileReader;
	}

	public static ProfilePage getProfilePage() {
		if(profilePage == null) {
			profilePage= new ProfilePage();
			
		}
		return profilePage;
	}
	public static ResumeUploadPage getresumeUploadPage() {
		if(resumeUploadPage == null) {
			resumeUploadPage = new ResumeUploadPage();
		}
		return resumeUploadPage;
	}
	
	public static HeadLinePage getheadLinePage() {
		if(headLinePage == null)
			headLinePage = new HeadLinePage();
		
	
	return  headLinePage;
	
}
	public static EmploymentPage getEmploymentPage() {
		if(employmentPage == null)
			employmentPage = new EmploymentPage();
		return employmentPage;
	}

}

	



