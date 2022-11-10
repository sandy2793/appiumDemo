package TestBase;

import static ReusableComponents.CommonMethods.*;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Helper.ObjectFactory;
import Pages.BasePage;
import Pages.Calculator.CalculatorPage;
import Pages.SBIMF.Sangam.DashboardPage;
import Pages.SBIMF.Sangam.EnableBiometricsPage;
import Pages.SBIMF.Sangam.LandingPage;
import Pages.SBIMF.Sangam.LoginPage;
import Pages.SBIMF.Sangam.SetupMpinPage;
import Pages.SBIMF.Sangam.TwoFactorAuthenticationPaage;

public class BaseClass extends ObjectFactory {
	
	@BeforeTest
	public void setup() throws Throwable {
		driver = setDesiredCapabilities2();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		base = new BasePage(driver);
		cal = new CalculatorPage(driver);
		landing = new LandingPage(driver);
		login = new LoginPage(driver);
		tfauth = new TwoFactorAuthenticationPaage(driver);
		mpin = new SetupMpinPage(driver);
		biometrics = new EnableBiometricsPage(driver);
		dashboard = new DashboardPage(driver);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
