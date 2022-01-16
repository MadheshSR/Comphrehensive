package com.mindtree.stepDefinitions;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.exceptions.UtilityException;
import com.mindtree.pageObject.SignIn;
import com.mindtree.reusableComponents.Base;
import com.mindtree.utilities.ExtentLogUtilities;
import com.mindtree.utilities.GetProperties;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SigninStepDef extends Base {

    public WebDriver driver = null;
	SignIn sn = null;
	 public SigninStepDef() throws UtilityException, Exception {
		super();
		// TODO Auto-generated constructor stub
	}

		@Before("@Signin")
		public void init() throws Exception {
			log = Logger.getLogger(ValidpageStepDef.class.getName());
			test = report.startTest("sign in");
			driver = initialize();
			System.out.println("Valid page");
			sn = new SignIn(driver, log, test);
		}

	    @Given("URl opened with URL for login")
	    public void u_rl_opened_with_url_for_login() throws IOException  { 
	    	driver.get(GetProperties.get.getProperty("url"));
			driver.manage().window().maximize();
			ExtentLogUtilities.pass(driver, test, "URL Opened", log);
	    }

	    @Then("Clicked on Sign in button")
	    public void clicked_one_sign_in_button() throws Throwable {
	        sn.clickLoginButton();
	    }

	    @Then("Enter Valid {string} and {string}")
	    public void enter_valid_and(String email, String pwd) throws ReusableComponentException, Exception {
	      sn.login(email, pwd);
	    }

	    @Then("click one sign in button")
	    public void click_one_sign_in_button() throws ReusableComponentException, Exception {
	    	sn.clicksignin();
	    }

	    @Then("user will redirect to my account page")
	    public void user_will_redirect_to_my_account_page() throws ReusableComponentException, Exception {
	    	sn.verify();
	    }
	    @After("@Signin")
		public void setReport() {
			report.endTest(test);
			report.flush();
			driver.quit();

	}
}

