package options;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
//		plugin = {"pretty"},
		plugin = {"json:target/cucumber.json","html:target/site/cucumber-pretty"},
		glue = {"stepdefs"},
		features = {"src/test/features"},
//		format = { "pretty",
//				"json:target/cucumber.json" },
tags = {"@test"})
public class CucumberTests {}


