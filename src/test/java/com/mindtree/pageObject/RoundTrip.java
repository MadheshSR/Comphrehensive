package com.mindtree.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import com.mindtree.exceptions.PageObjectException;
import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.reusableComponents.WebDriverSupport;
import com.mindtree.uiStore.roundtripUI;
import com.mindtree.utilities.ExtentLogUtilities;
import com.relevantcodes.extentreports.ExtentTest;

public class RoundTrip extends roundtripUI {
	WebDriver driver;
	Logger log;
	ExtentTest test;

	public RoundTrip(WebDriver driver, Logger log, ExtentTest test) throws Exception {
		this.driver = driver;
		this.test = test;
		this.log = log;
	}
	public void Round() throws ReusableComponentException, Exception {
		Thread.sleep(2000);
		WebDriverSupport.click(driver, round, "homepage", "round", log, test);
	}
	public void Outstation(String fro) throws ReusableComponentException, Exception {

		WebDriverSupport.click(driver, from, "homepage", "from place", log, test);
		WebDriverSupport.sendKeys(driver, from, "frombox", "from place", log, test, fro);
		}
		public void To(String too) throws ReusableComponentException, Exception {

		WebDriverSupport.click(driver, to, "roundtrip", "to place", log, test);
		WebDriverSupport.sendKeys(driver, to, "to box", "to place", log, test, too);
		WebDriverSupport.click(driver, desti, "roundtrip", "to place", log, test);
		
		
		Thread.sleep(2000);
		Thread.sleep(2000);
		}
	public void Sele() throws ReusableComponentException, Exception {
		WebDriverSupport.click(driver, select, "roundtrip", "select car", log, test);
		Thread.sleep(2000);
	}
	public void Selectcar() throws ReusableComponentException, Exception {
		WebDriverSupport.click(driver, selectcar, "car page", "select car", log, test);
	}
	public void verify() throws ReusableComponentException, Exception {

		try {
		
			
			
			if (driver.findElement(bookingdetail).isDisplayed()) {
				ExtentLogUtilities.pass(driver, test, "booking detail shown ", log);
				WebDriverSupport.click(driver, home, "home page", "home button", log, test);
			} else {
				ExtentLogUtilities.fail(driver, test, " booking detail not shown", log);
				throw new PageObjectException("verify failed");
			}
			
		}catch (Exception e) {
			throw new PageObjectException(e.getMessage());
		}
	}
	
}
