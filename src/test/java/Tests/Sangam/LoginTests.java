package Tests.Sangam;

import org.testng.annotations.Test;

import TestBase.BaseClass;

public class LoginTests extends BaseClass {
	
	
	@Test
	public void login1() {
		landing.clickOnGetStarted();
		login.enterArnCode("0010");
		login.enterPassword("Aaaa@123");
		login.clickOnLogin();
		tfauth.enterPAN("AAAAA1234A");
		tfauth.clickOnSubmit();
		mpin.clickOnNoIllDoItLater();
		biometrics.clickOnMaybeLater();
		dashboard.printUserName();
	}
	
}
