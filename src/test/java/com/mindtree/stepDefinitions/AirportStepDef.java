package com.mindtree.stepDefinitions;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.exceptions.UtilityException;
import com.mindtree.pageObject.Airport;
import com.mindtree.reusableComponents.Base;
import com.mindtree.utilities.ExtentLogUtilities;
import com.mindtree.utilities.GetProperties;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AirportStepDef extends Base{
	
	 public WebDriver driver = null;
	 Airport ap = null;
		 public AirportStepDef() throws UtilityException, Exception {
			super();
		}

			@Before("@Airport")
			public void init() throws Exception {
				log = Logger.getLogger(ValidpageStepDef.class.getName());
				test = report.startTest("airport in");
				driver = initialize();
				System.out.println("airport page");
				ap = new Airport(driver, log, test);
			}

	@Given("URl opened with airport")
	public void u_rl_opened_with_airport() throws IOException {
		driver.get(GetProperties.get.getProperty("url"));
		driver.manage().window().maximize();
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
	    
	}

	@Then("click on airport")
	public void click_on_airport() throws ReusableComponentException, Exception {
	   ap.Airportapp();
	}
	 @Then("click from and enter valid address in {string} on airport")
	    public void click_from_and_enter_valid_address_in_on_airport(String fro) throws ReusableComponentException, Exception {
	      ap.Outstation(fro);
	    }

	@Then("select pickAirport in dropdown")
	public void select_pickAirport_dropdown() throws ReusableComponentException, Exception {
	  ap.sel();
	}

	@Then("click on address in airport")
	public void click_on_address_in_airport() throws ReusableComponentException, Exception {
	   ap.add();
	}

	@Then("enter valid  {string} in airport and click addresstype")
	public void enter_valid_in_airport_and_click_addresstype(String Add) throws ReusableComponentException, Exception {
	   ap.enadd(Add);
	}

	@Then("click one select in airport")
	public void click_one_select_in_airport() throws ReusableComponentException, Exception {
	   ap.selecT();
	}

	@Then("click on select car in airport")
	public void click_on_select_car_in_airport() throws ReusableComponentException, Exception {
	   ap.selecr();
	}

	@Then("if booking detail is displayed redirect to home page")
	public void if_booking_detail_is_displayed_redirect_to_home_page() throws ReusableComponentException, Exception {
	   ap.verify();
	}
	 @After("@Airport")
		public void setReport() {
			report.endTest(test);
			report.flush();
			driver.quit();
	 }
}





	  