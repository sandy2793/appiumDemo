package Helper;

import Pages.BasePage;
import Pages.Calculator.CalculatorPage;
import Pages.SBIMF.Sangam.DashboardPage;
import Pages.SBIMF.Sangam.EnableBiometricsPage;
import Pages.SBIMF.Sangam.LandingPage;
import Pages.SBIMF.Sangam.LoginPage;
import Pages.SBIMF.Sangam.SetupMpinPage;
import Pages.SBIMF.Sangam.TwoFactorAuthenticationPaage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ObjectFactory {
	
	public AndroidDriver<MobileElement> driver;
	
	public BasePage base;
	public CalculatorPage cal;
	public LandingPage landing;
	public LoginPage login;
	public TwoFactorAuthenticationPaage tfauth;
	public SetupMpinPage mpin;
	public EnableBiometricsPage biometrics;
	public DashboardPage dashboard;
}
