package com.mindtree.pageObject;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.mindtree.exceptions.PageObjectException;
import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.reusableComponents.WebDriverSupport;
import com.mindtree.uiStore.OneWayCabsUI;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.JavascriptExecutor;

public class OneWayCabs extends OneWayCabsUI {

	WebDriver driver;
	Logger log;
	ExtentTest test;

	public OneWayCabs(WebDriver driver, Logger log, ExtentTest test) throws Exception {
		this.driver = driver;
		this.test = test;
		this.log = log;
	}
	@SuppressWarnings("unused")
	public void Onewaycab()throws ReusableComponentException, Exception{
		Object executeScript = ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",
		        driver.findElement(By.xpath("//div[contains(text(),'© Copyright Savaari.')]")));
		WebDriverSupport.click(driver, onewaycab, "home page", "One way cab", log, test);
	}
	public void tab()throws ReusableComponentException, Exception{

		try {
			Thread.sleep(5000);
		
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		Thread.sleep(2000);
		driver.switchTo().window(childid);
		Thread.sleep(5000);
		
	WebDriverSupport.click(driver, chennaitab, "onewaycab", "chennaitab", log, test);
	   Thread.sleep(2000);
		WebDriverSupport.click(driver, trl, "chntab", "trl", log, test);
		driver.close();
		Set<String>is=driver.getWindowHandles();
		Iterator<String> im=is.iterator();
		//String parentid1=im.next();
		String childid1=im.next();
		Thread.sleep(2000);
		driver.switchTo().window(childid1);
		Thread.sleep(2000);
	    System.out.println(driver.getTitle());
        //driver.close();
           
	    Thread.sleep(5000);
           driver.switchTo().window(parentid);
			WebDriverSupport.click(driver, home, "home page", "home button", log, test);

		
	}catch (Exception e) {
		throw new PageObjectException(e.getMessage());
	}
		}
}
