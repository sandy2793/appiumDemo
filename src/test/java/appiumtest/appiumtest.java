package appiumtest;

import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class appiumtest {
	
static AndroidDriver<MobileElement> driver;
	
	public static void main(String args[]) {
		try {
			openCalcultor(103,234);
		} catch (Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	
	public static void openCalcultor(int x, int y) throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Galaxy F22");
		cap.setCapability("udid", "10.0.62.90:5555");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "12");
		
		cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, cap);
		
		System.out.println("Appliction Started........");
		
		MobileElement plus = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add"));
		MobileElement equal = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal"));
		MobileElement result = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula"));
//		
		String a = Integer.toString(x);
		String b = Integer.toString(y);
		for (int i = 0; i < a.length(); i++) {
			driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_0"+ a.charAt(i))).click();
		}
		plus.click();
		for (int i = 0; i < b.length(); i++) {
			driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_0"+ b.charAt(i))).click();
		}
		equal.click();
		System.out.println(result.getText());
	}

}
