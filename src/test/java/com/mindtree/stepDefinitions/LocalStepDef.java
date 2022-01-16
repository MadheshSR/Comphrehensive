package com.mindtree.stepDefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.exceptions.UtilityException;
import com.mindtree.pageObject.Local;
import com.mindtree.reusableComponents.Base;
import com.mindtree.utilities.ExtentLogUtilities;
import com.mindtree.utilities.GetProperties;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LocalStepDef extends Base{
	 public WebDriver driver = null;
		Local lc = null;
		 public LocalStepDef() throws UtilityException, Exception {
			super();
		}

			@Before("@local")
			public void init() throws Exception {
				log = Logger.getLogger(ValidpageStepDef.class.getName());
				test = report.startTest("local in");
				driver = initialize();
				System.out.println("Valid page");
				lc = new Local(driver, log, test);
			}

	    @Given("^URl opened with local$")
	    public void url_opened_with_local() throws Throwable {
	    	driver.get(GetProperties.get.getProperty("url"));
			driver.manage().window().maximize();
			ExtentLogUtilities.pass(driver, test, "URL Opened", log);
	    }

	    @Then("^click on local$")
	    public void click_on_local() throws Throwable {
	       lc.Localapp();
	    }
	    @Then("click from and enter valid address in {string} on local and click form")
	    public void click_from_and_enter_valid_address_in_on_local_and_form(String fro) throws ReusableComponentException, Exception {
	       lc.Outstation(fro);
	    }

	    @Then("^if booking detail is shown in local redirect to home page$")
	    public void if_booking_detail_is_shown_in_local_redirect_to_home_page() throws Throwable {
	       lc.verify();
	    }

	    @And("^click on select on local$")
	    public void click_on_select_on_local() throws Throwable {
	       lc.selecT();
	    }

	    @And("^click on time on local$")
	    public void click_on_time_on_local() throws Throwable {
	       lc.Time();
	    }

	    @And("^click on Select car on local$")
	    public void click_on_Select_car_on_local() throws Throwable {
	        lc.Seleccar();
	    }
	    @After("@local")
		public void setReport() {
			report.endTest(test);
			report.flush();
			driver.quit();
	}
}
