package com.mindtree.stepDefinitions;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.exceptions.UtilityException;
import com.mindtree.pageObject.CorporateCarRental;
import com.mindtree.reusableComponents.Base;
import com.mindtree.utilities.ExtentLogUtilities;
import com.mindtree.utilities.GetProperties;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CorporateCarRentalStepDef extends Base{
	 WebDriver driver = null;
	 CorporateCarRental cr = null;

		public CorporateCarRentalStepDef() throws UtilityException, Exception {
			super();
		}

		@Before("@CCR")
		public void init() throws Exception {
			log = Logger.getLogger(OutstationStepDef.class.getName());
			test = report.startTest("CorporateCarRental");
			driver = initialize();
			System.out.println("CorporateCarRental");
			cr = new CorporateCarRental(driver, log, test);
		}
	
	@Given("URl opened with CCR")
	public void u_rl_opened_with_ccr() throws IOException {
		driver.get(GetProperties.get.getProperty("url"));
		driver.manage().window().maximize();
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
    }
	

	@Then("click on corporate car rental on CCR")
	public void click_on_corporate_car_rental_on_ccr() throws ReusableComponentException, Exception {
	   cr.CarRental();
	}

	@Then("Enter valid {string} and {string} and {string} and {string} and click submit and if submit deatil is verified redirect to home page")
	public void enter_valid_and_and_and_and_click_submit_and_if_submit_deatil_is_verified_redirect_to_home_page(String nm, String cnm, String em, String ph) throws ReusableComponentException, Exception {
	  cr.details(nm, cnm, em, ph);
	}
	 @After("@CCR")
		public void setReport() {
			report.endTest(test);
			report.flush();
			driver.quit();
	 }
}

