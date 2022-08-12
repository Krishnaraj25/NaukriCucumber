package org.naukri.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.naukri.objectrepository.CreationPage;

import org.naukri.resources.CommonAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NaukriCreation extends CommonAction{
	CommonAction C=new CommonAction();
	CreationPage P=new CreationPage();
	@Given("User Launch Naukri Application")
	public void user_Launch_Naukri_Application() {
		//C.browserLaunch();
	}
	@When("User Should click and Enter the Name Required Field")
	public void user_Should_click_and_Enter_the_Name_Required_Field() throws Throwable {
		P.getName().sendKeys("Krishnaraj");
	}
	@When("User Should click and Enter the Email Required Field")
	public void user_Should_click_and_Enter_the_Email_Required_Field() throws InterruptedException {
		P.getEmail().sendKeys("krishnaraj9825@gmail.com");
	}
	@When("User Should click and Enter the Password Required Field")
	public void user_Should_click_and_Enter_the_Password_Required_Field() throws Throwable {
		P.getPass().sendKeys("Krishna@25");
	}
	@When("User Should click and Enter the Mobile Number Required Field")
	public void user_Should_click_and_Enter_the_Mobile_Number_Required_Field() throws Throwable {
		P.getMobile().sendKeys("8098045686");
	}
	@When("User Should able to click the work status")
	public void user_Should_able_to_click_the_work_status() throws Throwable {
		P.getExp().click();
	}
	@Then("User Should able to click the RegisterNow for Id Creation")
	public void user_Should_able_to_click_the_RegisterNow_for_Id_Creation() throws Throwable {
		P.getRegister().click();
		C.Screenshot();
		
	}
}