package com.mindtree.pageObject;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.mindtree.exceptions.PageObjectException;
import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.reusableComponents.WebDriverSupport;
import com.mindtree.uiStore.CorporateCarRentalUI;
import com.mindtree.utilities.ExtentLogUtilities;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.JavascriptExecutor;

public class CorporateCarRental extends CorporateCarRentalUI {

	WebDriver driver;
	Logger log;
	ExtentTest test;

	public CorporateCarRental(WebDriver driver, Logger log, ExtentTest test) throws Exception {
		this.driver = driver;
		this.test = test;
		this.log = log;
	}
	public void CarRental()throws ReusableComponentException, Exception{
		
		@SuppressWarnings("unused")
		Object executeScript = ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",
		        driver.findElement(By.xpath("//div[contains(text(),'© Copyright Savaari.')]")));
		WebDriverSupport.click(driver, carrental, "home page", "car rental", log, test);
		Thread.sleep(2000);
	}
	public void details(String nm,String cnm,String em,String ph)throws ReusableComponentException, Exception{
		Thread.sleep(2000);
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		Thread.sleep(2000);
		driver.switchTo().window(childid);
		WebDriverSupport.click(driver, Name, "namebox", "name", log, test);
		WebDriverSupport.sendKeys(driver, Name, "namebox", "name", log, test,nm);
		WebDriverSupport.click(driver, companyName, "compnamebox", "company name", log, test);
		WebDriverSupport.sendKeys(driver, companyName, "compnamebox", "company name", log, test,cnm);
		WebDriverSupport.click(driver, Email, "emailbox", "email", log, test);
		WebDriverSupport.sendKeys(driver, Email, "emailbox", "email", log, test,em);
		WebDriverSupport.click(driver, phoneno, "phonenobox", "phone no", log, test);
		WebDriverSupport.sendKeys(driver, phoneno, "phonenobox", "phone no", log, test,ph);
		Select bv=new Select(driver.findElement(businessvolume));
		bv.selectByValue("100000to500000");

		WebDriverSupport.click(driver, submit, "carrental", "submit", log, test);


		try {
			
			Thread.sleep(20000);
			
			
			
			 if (driver.findElement(Result).isDisplayed()) {
					ExtentLogUtilities.pass(driver, test, "result detail shown ", log);
					driver.close();
					
				} else {
					ExtentLogUtilities.fail(driver, test, " result detail not shown", log);
					throw new PageObjectException("verify failed");
				}
	            
	            driver.switchTo().window(parentid);
				WebDriverSupport.click(driver, home, "home page", "home button", log, test);
				
			
		}catch (Exception e) {
			throw new PageObjectException(e.getMessage());
		}
	}
		
	}

