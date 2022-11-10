package Pages.SBIMF.Sangam;

import org.openqa.selenium.support.FindBy;
import Pages.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LandingPage extends BasePage {

	public LandingPage(AndroidDriver<MobileElement> driver) {
		super(driver);
	}
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]")
	MobileElement get_started_button_locator;
	
	public void clickOnGetStarted() {
		get_started_button_locator.click();
	}
	
}
