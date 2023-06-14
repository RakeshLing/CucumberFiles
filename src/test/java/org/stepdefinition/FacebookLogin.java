package org.stepdefinition;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookLogin extends BaseClass {
	@Given("To launch the chromebrowser and window maximize")
	public void to_launch_the_chromebrowser_and_window_maximize() {
		launchBrowser();
		windowMaximize();
	}

	@When("To launch the url facebook page")
	public void to_launch_the_url_flipkart_page() {
		launchUrl("https://en-gb.facebook.com/");
	}
	
	@When("To enter the mail")
	public void to_enter_the_mail() {
		WebElement login = driver.findElement(By.id("email"));
		login.sendKeys("Rakesh");
	}
	
	@When("To enter the password")
	public void to_enter_the_password() {
	   WebElement passwrd = driver.findElement(By.id("pass"));
	   passwrd.sendKeys("Lingam");
	}
	
	@When("To login the button")
	public void to_login_the_button() {
		WebElement lgin = driver.findElement(By.name("login"));
		lgin.click();
	   
	}
	
	@Then("To close browser")
	public void to_close_browser() {
		closeEntireBrowser();
	}
}

