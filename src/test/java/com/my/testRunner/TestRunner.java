package com.my.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestRunner {
	@CucumberOptions(
			features = {"Features"},
			glue = {"com.my.steps"},
			tags = {"@Registration"}

			)
			public class Testrunner extends AbstractTestNGCucumberTests {
				

			}


}
