package com.mindtree.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import com.mindtree.exceptions.PageObjectException;
import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.reusableComponents.WebDriverSupport;
import com.mindtree.uiStore.outstationUI;
import com.mindtree.utilities.ExtentLogUtilities;
import com.relevantcodes.extentreports.ExtentTest;

public class OutStation extends outstationUI {
	WebDriver driver;
	Logger log;
	ExtentTest test;

	public OutStation(WebDriver driver, Logger log, ExtentTest test) throws Exception {
		this.driver = driver;
		this.test = test;
		this.log = log;
	}
	public void Outstation(String fro) throws ReusableComponentException, Exception {

	WebDriverSupport.click(driver, from, "outstation", "from place", log, test);
	WebDriverSupport.sendKeys(driver, from, "frombox", "from place", log, test, fro);
	}
	public void To(String too) throws ReusableComponentException, Exception {

	WebDriverSupport.click(driver, to, "outstation", "to place", log, test);
	WebDriverSupport.sendKeys(driver, to, "to box", "to place", log, test, too);
	WebDriverSupport.click(driver, desti, "outstation", "to place", log, test);
	
	
	Thread.sleep(2000);
	Thread.sleep(2000);
	}
	public void Select () throws ReusableComponentException, Exception {
		WebDriverSupport.click(driver, select, "outstation", "select car", log, test);
		Thread.sleep(2000);
	}
	public void verify () throws ReusableComponentException, Exception {

		try {
			if (driver.findElement(verify).isDisplayed()) {
				ExtentLogUtilities.pass(driver, test, "Successfully verified", log);
				Thread.sleep(2000);
				WebDriverSupport.click(driver, home, "home page", "home button", log, test);
				Thread.sleep(2000);
			} else {
				ExtentLogUtilities.fail(driver, test, " failed to verify", log);
				throw new PageObjectException("verify failed");
			}
			
		}catch (Exception e) {
			throw new PageObjectException(e.getMessage());
		}
	}
}
	

