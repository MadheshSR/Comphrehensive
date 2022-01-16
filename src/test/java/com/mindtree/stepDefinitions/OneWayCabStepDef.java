package com.mindtree.stepDefinitions;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.exceptions.UtilityException;
import com.mindtree.pageObject.OneWayCabs;
import com.mindtree.reusableComponents.Base;
import com.mindtree.utilities.ExtentLogUtilities;
import com.mindtree.utilities.GetProperties;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class OneWayCabStepDef extends Base{
	 public WebDriver driver = null;
	 OneWayCabs owc = null;
		 public OneWayCabStepDef() throws UtilityException, Exception {
			super();
		}

			@Before("@OneWayCab")
			public void init() throws Exception {
				log = Logger.getLogger(ValidpageStepDef.class.getName());
				test = report.startTest("OneWayCabs");
				driver = initialize();
				System.out.println("OneWayCabs");
				owc = new OneWayCabs(driver, log, test);
			}

	@Given("URl opened with OWC")
	public void u_rl_opened_with_owc() throws IOException {
		driver.get(GetProperties.get.getProperty("url"));
		driver.manage().window().maximize();
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
	}

	@Then("click on Onewaycab")
	public void click_on_onewaycab() throws ReusableComponentException, Exception {
	    owc.Onewaycab();
	}

	@Then("click on chennaitab and click on chetotrl link and back to homepage")
	public void click_on_chennaitab_and_click_on_chetotrl_link_and_back_to_homepage() throws ReusableComponentException, Exception {
	    owc.tab();
	}
	 @After("@OneWayCab")
		public void setReport() {
			report.endTest(test);
			report.flush();
			driver.quit();
}
}