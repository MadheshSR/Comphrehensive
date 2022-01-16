package com.mindtree.pageObject;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.exceptions.PageObjectException;
import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.reusableComponents.WebDriverSupport;
import com.mindtree.uiStore.downloadappUI;
import com.mindtree.utilities.ExtentLogUtilities;
import com.relevantcodes.extentreports.ExtentTest;

public class DownloadApp extends downloadappUI {
	WebDriver driver;
	Logger log;
	ExtentTest test;

	public DownloadApp(WebDriver driver, Logger log, ExtentTest test) throws Exception {
		this.driver = driver;
		this.test = test;
		this.log = log;
	}
	public void App()throws ReusableComponentException, Exception{
		WebDriverSupport.click(driver, app, "home page", "playstore", log, test);
	}
	public void win()throws ReusableComponentException, Exception{
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		Thread.sleep(2000);
		driver.switchTo().window(childid);
		Thread.sleep(2000);

		try {
			
		   if (driver.findElement(playstore).isDisplayed()) {
				ExtentLogUtilities.pass(driver, test, "playsrore detail shown ", log);
				driver.close();
				
			} else {
				ExtentLogUtilities.fail(driver, test, " booking detail not shown", log);
				throw new PageObjectException("verify failed");
			}
			
       
            driver.switchTo().window(parentid);
			WebDriverSupport.click(driver, home, "home page", "home button", log, test);

			
		}catch (Exception e) {
			throw new PageObjectException(e.getMessage());
		}
	}
}
	
