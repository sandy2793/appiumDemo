package Tests.Calculator;

import org.testng.annotations.Test;
import TestBase.BaseClass;

public class CalculatorTests extends BaseClass {
	
	@Test
	public void addTest() {
		cal.enterNumber(23);
		cal.clickOnPlus();
		cal.enterNumber(537);
		cal.clickOnEqual();
		cal.verifyAddResult(23, 537);
		cal.printResult();
	}

}
