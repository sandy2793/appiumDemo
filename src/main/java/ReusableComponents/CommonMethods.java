package ReusableComponents;

import java.net.URL;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.testinium.deviceinformation.DeviceInfo;
import com.testinium.deviceinformation.DeviceInfoImpl;
import com.testinium.deviceinformation.device.DeviceType;
import com.testinium.deviceinformation.model.Device;

import business.AppiumServiceHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CommonMethods {

	public static DesiredCapabilities setDesiredCapabilities() throws Throwable {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.PLATFORM_NAME, ConfigFileReader.getKeyValue("platform_name"));
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, ConfigFileReader.getKeyValue("platform_version"));
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigFileReader.getKeyValue("device_name"));
		cap.setCapability(MobileCapabilityType.UDID, ConfigFileReader.getKeyValue("udid"));
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, Integer.valueOf(ConfigFileReader.getKeyValue("new_command_timeout")));
		cap.setCapability("appPackage", ConfigFileReader.getKeyValue("app_package"));
		cap.setCapability("appActivity", ConfigFileReader.getKeyValue("app_activity"));
		return cap;
	}

	public static AndroidDriver<MobileElement> setDesiredCapabilities2() throws Throwable {

		try {
			AndroidDriver<MobileElement> driver = null;
			AppiumServiceHelper.startDefaultService(4723);

			DeviceInfo deviceInfo = new DeviceInfoImpl(DeviceType.ANDROID);
			DesiredCapabilities capabilities = new DesiredCapabilities();

			//        capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "\\src\\main\\java\\android\\app\\apkFile\\ConnectoAndroidApp.apk");

			if (deviceInfo.anyDeviceConnected()) {
				Device device = deviceInfo.getFirstDevice();
				capabilities.setCapability("deviceName", device.getModelNumber());
				capabilities.setCapability("udid", device.getUniqueDeviceID());
				capabilities.setCapability("platformVersion", device.getProductVersion());
				capabilities.setCapability("platformName", device.getDeviceProductName());
				capabilities.setCapability("appPackage", ConfigFileReader.getKeyValue("app_package"));
				capabilities.setCapability("appActivity",  ConfigFileReader.getKeyValue("app_activity"));
				capabilities.setCapability("autoGrantPermissions", true);
				capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "30000");

				driver = new AndroidDriver<MobileElement>(new URL(ConfigFileReader.getKeyValue("url")), 
						capabilities);
			}
			return driver;
		}
		catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

	public static AndroidDriver<MobileElement> initAndroidDriver() throws Throwable {
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL(ConfigFileReader.getKeyValue("url")), 
				setDesiredCapabilities());
		return driver;
	}

}
