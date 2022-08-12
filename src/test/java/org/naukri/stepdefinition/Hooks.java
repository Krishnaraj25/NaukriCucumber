package org.naukri.stepdefinition;

import org.naukri.resources.CommonAction;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommonAction {
	CommonAction C=new CommonAction();
	@Before
	public void beforeScenario() {
		System.out.println("Before Scenario");
		C.browserLaunch();
		
	}
	@After
	public void AfterScenario(Scenario Scenario) {
		if(Scenario.isFailed()) {
		final byte[] Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		Scenario.embed(Screenshot, "image/png");
		}else {
			final byte[] Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			Scenario.embed(Screenshot, "image/png");
		}
		System.out.println("After Scenario");
		C.browserQuit();
		
	}
}
