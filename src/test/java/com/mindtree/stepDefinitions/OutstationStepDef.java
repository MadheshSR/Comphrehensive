package com.mindtree.stepDefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.exceptions.UtilityException;
import com.mindtree.pageObject.OutStation;
import com.mindtree.reusableComponents.Base;
import com.mindtree.utilities.ExtentLogUtilities;
import com.mindtree.utilities.GetProperties;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class OutstationStepDef extends Base{
	 WebDriver driver = null;
		OutStation os = null;

		public OutstationStepDef() throws UtilityException, Exception {
			super();
		}

		@Before("@outstation")
		public void init() throws Exception {
			log = Logger.getLogger(OutstationStepDef.class.getName());
			test = report.startTest("out station");
			driver = initialize();
			System.out.println("out station");
			os = new OutStation(driver, log, test);
		}
	


	    @Given("^URl opened with outstation$")
	    public void url_opened_with_outstation() throws Throwable {
	    	driver.get(GetProperties.get.getProperty("url"));
			driver.manage().window().maximize();
			ExtentLogUtilities.pass(driver, test, "URL Opened", log);
	    }

	    @Then("click from and enter valid address in {string} on out")
	    public void click_from_and_enter_valid_address_in_on_out(String fro) throws Throwable, Exception {
	      os.Outstation(fro);
	    }

	    @Then("^if car page is displayed in out redirect to home page$")
	    public void if_car_page_is_displayed_in_out_redirect_to_home_page() throws Throwable {
	       os.verify();
	    }

	    @Then("click to and enter valid address in {string} on out and click")
	    public void click_to_and_enter_valid_address_in_on_out_and_click(String too) throws ReusableComponentException, Exception {
	     os.To(too);
	    }

	   @And("click on select on out")
	    public void click_on_select_on_out() throws Throwable {
	       os.Select();
	    }
	    @After("@outstation")
		public void setReport() {
			report.endTest(test);
			report.flush();
			driver.quit();

	}
}

