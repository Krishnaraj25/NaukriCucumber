package org.naukri.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
				 glue="org.naukri.stepdefinition",
				 monochrome=true,tags= {"@Login"},plugin= {"html:target","json:target/reports.json"})
public class TestRunner {

}
