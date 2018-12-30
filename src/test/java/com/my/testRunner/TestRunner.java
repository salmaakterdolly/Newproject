package com.my.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


	@CucumberOptions(
			features = {"Features"},
			glue = {"com.my.steps"},
			tags = {"@Registration"}

			)
			public class TestRunner extends AbstractTestNGCucumberTests {
				

			}



