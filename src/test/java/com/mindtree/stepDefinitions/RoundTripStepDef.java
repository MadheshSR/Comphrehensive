package com.mindtree.stepDefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.exceptions.UtilityException;
import com.mindtree.pageObject.RoundTrip;
import com.mindtree.reusableComponents.Base;
import com.mindtree.utilities.ExtentLogUtilities;
import com.mindtree.utilities.GetProperties;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RoundTripStepDef extends Base {
	 public WebDriver driver = null;
		RoundTrip rt = null;
		 public RoundTripStepDef() throws UtilityException, Exception {
			super();
			// TODO Auto-generated constructor stub
		}

			@Before("@roundtrip")
			public void init() throws Exception {
				log = Logger.getLogger(ValidpageStepDef.class.getName());
				test = report.startTest("round in");
				driver = initialize();
				System.out.println("Valid page");
				rt = new RoundTrip(driver, log, test);
			}
	

	    @Given("^URl opened with roundtrip$")
	    public void url_opened_with_roundtrip() throws Throwable {
	    	driver.get(GetProperties.get.getProperty("url"));
			driver.manage().window().maximize();
			ExtentLogUtilities.pass(driver, test, "URL Opened", log);
	    }

	    @Then("^click on roundtrip$")
	    public void click_on_roundtrip() throws Throwable {
	      rt.Round();
	    }
	    @Then("click from and enter valid address in {string} on round")
	    public void click_from_and_enter_valid_address_in_on_round(String fro) throws ReusableComponentException, Exception {
	        rt.Outstation(fro);
	    }

	    @Then("click to and enter valid address in {string} on round and click")
	    public void click_to_and_enter_valid_address_in_on_round_and_click(String to) throws ReusableComponentException, Exception {
	       rt.To(to);
	    }


	    @Then("^if car page is displayed in round redirect to home page$")
	    public void if_car_page_is_displayed_in_round_redirect_to_home_page() throws Throwable {
	        rt.verify();
	    }

	    @And("^click one select on round$")
	    public void click_one_select_on_round() throws Throwable {
	             rt.Sele();
	    }

	    @And("^click on select car on round$")
	    public void click_on_select_car_on_round() throws Throwable {
	        rt.Selectcar();
	    }
	    @After("@roundtrip")
		public void setReport() {
			report.endTest(test);
			report.flush();
			driver.quit();

	}
}
