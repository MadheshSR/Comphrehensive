package com.mindtree.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "Features", glue = { "com.mindtree.stepDefinitions" })
public class BDDTestRunner extends AbstractTestNGCucumberTests {

}
