package com.mindtree.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.exceptions.PageObjectException;
import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.reusableComponents.WebDriverSupport;
import com.mindtree.uiStore.SigninUI;
import com.mindtree.utilities.ExtentLogUtilities;
import com.relevantcodes.extentreports.ExtentTest;

public class SignIn extends SigninUI {

	WebDriver driver;
	Logger log;
	ExtentTest test;

	public SignIn(WebDriver driver, Logger log, ExtentTest test) throws Exception {
		this.driver = driver;
		this.test = test;
		this.log = log;
	}
	public void clickLoginButton() throws ReusableComponentException, Exception {
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
		
		public void verify() throws ReusableComponentException, Exception {

		try {
		if (driver.findElement(myacc).isDisplayed()) {
			ExtentLogUtilities.pass(driver, test, "Successfully logged in", log);
		} else {
			ExtentLogUtilities.fail(driver, test, "logged in failed", log);
			throw new PageObjectException("Logged in failed");
		}
		}catch (Exception e) {
			throw new PageObjectException(e.getMessage());
	}
	}
}
