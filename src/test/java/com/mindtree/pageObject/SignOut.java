package com.mindtree.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.exceptions.PageObjectException;
import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.reusableComponents.WebDriverSupport;
import com.mindtree.uiStore.SignoutUI;
import com.mindtree.utilities.ExtentLogUtilities;
import com.relevantcodes.extentreports.ExtentTest;

public class SignOut extends SignoutUI {
	WebDriver driver;
	Logger log;
	ExtentTest test;

	public SignOut(WebDriver driver, Logger log, ExtentTest test) throws Exception {
		this.driver = driver;
		this.test = test;
		this.log = log;
	}public void clickLoginButton() throws ReusableComponentException, Exception {
		WebDriverSupport.click(driver, signin, "home page", "signin", log, test);
		Thread.sleep(5000);
	}
	public void login(String Uid, String Pw) throws ReusableComponentException, Exception {
		WebDriverSupport.sendKeys(driver, email, "Account Log in", "Email field", log, test, Uid);
		WebDriverSupport.sendKeys(driver, password, "Account Log in", "password field", log, test, Pw);
	}
	public void clicksignin() throws ReusableComponentException, Exception {
		WebDriverSupport.click(driver, login, "Account Log in", "sign in button", log, test);
	}
		
	public void SignOutapp() throws ReusableComponentException, Exception {
		WebDriverSupport.click(driver, face, "home page", "signout", log, test);
		Thread.sleep(2000);
	}
	public void book() throws ReusableComponentException, Exception {
		WebDriverSupport.click(driver, bookings, "options", "bookings", log, test);
		Thread.sleep(2000);
		WebDriverSupport.click(driver, cancelled, "options", "cancelled", log, test);
		Thread.sleep(2000);
		WebDriverSupport.click(driver, completed, "options", "completed", log, test);
		Thread.sleep(2000);
		WebDriverSupport.click(driver, booknow, "options", "booknow", log, test);
		Thread.sleep(2000);
	}
	public void sett() throws ReusableComponentException, Exception {
		WebDriverSupport.click(driver, face, "home page", "signout", log, test);
		Thread.sleep(2000);
		WebDriverSupport.click(driver, accountsetting, "options", "accountsetting", log, test);
		Thread.sleep(2000);
	}
	public void Home() throws ReusableComponentException, Exception {
		WebDriverSupport.click(driver, home, "homepage", "home button", log, test);
		Thread.sleep(2000);
	}
	public void Logout() throws ReusableComponentException, Exception {
		WebDriverSupport.click(driver, face, "onepage", "signout", log, test);
		Thread.sleep(2000);
		WebDriverSupport.click(driver, logout, "options", "signout", log, test);
	}
	public void verify() throws ReusableComponentException, Exception {

	
		try {
			
			
			
			
			

			if (driver.findElement(SignIn).isDisplayed()) {
				ExtentLogUtilities.pass(driver, test, "Signed out sucessfully ", log);
				
			} else {
				ExtentLogUtilities.fail(driver, test, "signout unsucessful", log);
				throw new PageObjectException("verify failed");
			}
			
		}catch (Exception e) {
			throw new PageObjectException(e.getMessage());
		}
	}
		}

