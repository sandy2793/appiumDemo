package Pages.Calculator;

import org.openqa.selenium.By;
import org.testng.Assert;
import Pages.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CalculatorPage extends BasePage {
	
	public CalculatorPage(AndroidDriver<MobileElement> driver) {
		super(driver);
	}

	String numbers_id_locator = "com.sec.android.app.popupcalculator:id/calc_keypad_btn_0";
	
	String plus_locator = "com.sec.android.app.popupcalculator:id/calc_keypad_btn_add";
	
	String equal_locator = "com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal";
	
	String result_locator = "com.sec.android.app.popupcalculator:id/calc_edt_formula";
	
	public void clickOnNumber(char num_char) {
		driver.findElement(By.id(numbers_id_locator+ num_char)).click();
	}
	
	public void enterNumber(int number) {
		String num_str = Integer.toString(number);
		for (int i = 0; i < num_str.length(); i++) {
			clickOnNumber(num_str.charAt(i));
		}
	}
	
	public void clickOnPlus() {
		driver.findElement(By.id(plus_locator)).click();
	}
	
	public void clickOnEqual() {
		driver.findElement(By.id(equal_locator)).click();
	}
	
	public void printResult() {
		System.out.println(driver.findElement(By.id(result_locator)).getText());
	}
	
	public void verifyAddResult(int val1, int val2) {
		Assert.assertEquals(Integer.toString(val1+val2), driver.findElement(By.id(result_locator)).getText());
	}

}
