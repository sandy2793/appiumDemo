package ReusableComponents;

import static Helper.Constant.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigFileReader {
	
	public static String getKeyValue(String keyName) throws Throwable {
		Properties pf = new Properties();
		pf.load(new FileInputStream(new File(CONFIG_FILE_PATH)));
		return pf.getProperty(keyName);
	}

}
