package com.google.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions (
		
		
		features = "Feature",
		glue = "com.google.stepdef"
		
		
		
		)




public class TestRunner extends AbstractTestNGCucumberTests {

}
