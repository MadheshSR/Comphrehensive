package com.mindtree.stepDefinitions;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.exceptions.UtilityException;
import com.mindtree.pageObject.SignOut;
import com.mindtree.reusableComponents.Base;
import com.mindtree.utilities.ExtentLogUtilities;
import com.mindtree.utilities.GetProperties;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SignoutStepDef extends Base {
	
	WebDriver driver = null;
	SignOut so = null;

		public SignoutStepDef() throws UtilityException, Exception {
			super();
		}

		@Before("@SignOut")
		public void init() throws Exception {
			log = Logger.getLogger(OutstationStepDef.class.getName());
			test = report.startTest("Signout");
			driver = initialize();
			System.out.println("Signout");
			so = new SignOut(driver, log, test);
		}
	@Given("URl opened with signout")
	public void u_rl_opened_with_signout() throws IOException {
		driver.get(GetProperties.get.getProperty("url"));
		driver.manage().window().maximize();
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
	}
	 @Then("Clicked on Sign in button in so")
	    public void clicked_one_sign_in_button_in_so() throws Throwable {
	        so.clickLoginButton();
	    }

	    @Then("Enter Valid {string} and {string} in so")
	    public void enter_valid_and_in_so(String email, String pwd) throws ReusableComponentException, Exception {
	      so.login(email, pwd);
	    }

	    @Then("click one sign in button in so")
	    public void click_one_sign_in_button_in_so() throws ReusableComponentException, Exception {
	    	so.clicksignin();
	    }
	@Then("click on sign out in so")
	public void click_on_sign_out_in_so() throws ReusableComponentException, Exception {
	    so.SignOutapp();
	}

	@Then("click on bookings and cancelled and comlplete and booknow")
	public void click_on_bookings_and_cancelled_and_comlplete_and_booknow() throws ReusableComponentException, Exception {
	 so.book();
	}

	@Then("click on img and accountsetting")
	public void click_on_img_and_accountsetting() throws ReusableComponentException, Exception {
	so.sett();
	}

	@Then("click home")
	public void click_home() throws ReusableComponentException, Exception {
	 so.Home();
	}

	@Then("click on img and signout")
	public void click_on_img_and_signout() throws ReusableComponentException, Exception {
	  so.Logout();
	}

	@Then("check sign out is done successfully")
	public void check_sign_out_is_done_successfully() throws ReusableComponentException, Exception {
	    so.verify();
	}
	 @After("@SignOut")
		public void setReport() {
			report.endTest(test);
			report.flush();
			driver.quit();
	 }
}


