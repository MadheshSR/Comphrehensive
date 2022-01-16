package com.mindtree.stepDefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.exceptions.UtilityException;
import com.mindtree.pageObject.DownloadApp;
import com.mindtree.reusableComponents.Base;
import com.mindtree.utilities.ExtentLogUtilities;
import com.mindtree.utilities.GetProperties;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DownloadappStepDef extends Base {
	 public WebDriver driver = null;
		DownloadApp da = null;
		 public DownloadappStepDef() throws UtilityException, Exception {
			super();
		}

			@Before("@downloadapp")
			public void init() throws Exception {
				log = Logger.getLogger(DownloadappStepDef.class.getName());
				test = report.startTest("downloadapp in");
				driver = initialize();
				System.out.println("downloadapp page");
				da = new DownloadApp(driver, log, test);
			}

	    @Given("^URl opened with download app$")
	    public void url_opened_with_download_app() throws Throwable {
	    	driver.get(GetProperties.get.getProperty("url"));
			driver.manage().window().maximize();
			ExtentLogUtilities.pass(driver, test, "URL Opened", log);
	    }

	    @Then("^click on download app$")
	    public void click_on_download_app() throws Throwable {
	da.App();
	    }

	    @Then("^if download app titile is verified redirect to home page$")
	    public void if_download_app_titile_is_verified_redirect_to_home_page() throws Throwable {
	        da.win();
	    }
	    @After("@downloadapp")
	  		public void setReport() {
	  			report.endTest(test);
	  			report.flush();
	  			driver.quit();

	}
}
