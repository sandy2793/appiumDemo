package Pages.SBIMF.Sangam;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TwoFactorAuthenticationPaage extends BasePage {

	public TwoFactorAuthenticationPaage(AndroidDriver<MobileElement> driver) {
		super(driver);
	}
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.EditText")
	MobileElement pan_textbox_locator;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView")
	MobileElement submit_button_locator;
	
//	@FindBy(xpath = "")
//	MobileElement submit_button_locator;
	
	public void enterPAN(String pan) {
		pan_textbox_locator.sendKeys(pan);
	}
	
	public void clickOnSubmit() {
		submit_button_locator.click();
	}
	
	
}
