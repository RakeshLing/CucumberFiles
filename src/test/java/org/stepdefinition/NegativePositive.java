package org.stepdefinition;

import org.base.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class NegativePositive extends BaseClass {
	
	FbLoginPojo f;
	
	@Given("To launch the user chromebrowser and window maximize")
	public void to_launch_the_user_chromebrowser_and_window_maximize() {
		launchBrowser();
		windowMaximize();
	    
	}

	@When("To launch the user url facebook page")
	public void to_launch_the_user_url_facebook_page() {
		launchUrl("https://en-gb.facebook.com/");
	   
	}

	@When("To enter the user data {string} in mail")
	public void to_enter_the_user_data_in_mail(String em) {
		f = new FbLoginPojo();
		passText(em, f.getEmail());
	    
	}

	@When("To enter the user data {string} in password")
	public void to_enter_the_user_data_in_password(String pass) {
		f = new FbLoginPojo();
		passText(pass, f.getPassword());
	    
	}

	@When("User login the button")
	public void user_login_the_button() {
		f = new FbLoginPojo();
		clickBtn(f.getLoginBtn());
	    
	}


}
