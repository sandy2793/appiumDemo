package Pages.SBIMF.Sangam;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SetupMpinPage extends BasePage {

	public SetupMpinPage(AndroidDriver<MobileElement> driver) {
		super(driver);
	}
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView")
	MobileElement no_ill_do_it_later_button_locator;
	
	public void clickOnNoIllDoItLater() {
		no_ill_do_it_later_button_locator.click();
	}

}
