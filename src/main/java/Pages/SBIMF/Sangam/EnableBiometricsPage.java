package Pages.SBIMF.Sangam;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class EnableBiometricsPage extends BasePage {

	public EnableBiometricsPage(AndroidDriver<MobileElement> driver) {
		super(driver);
	}

	@FindBy(xpath = "//android.widget.FrameLayout[@id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView")
	MobileElement maybe_later_button_locator;
	
	public void clickOnMaybeLater() {
		maybe_later_button_locator.click();
	}

}
