package com.stepdefinition;

import org.junit.Assert;

import com.pom_java.Login_page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Logintest {
		
	
	@Given("Enter the url")
	public void enter_the_url() {
		Login_page.initDriver("https://adactinhotelapp.com/index.php");
	}

	@When("enter the username")
	public void enter_the_username() {
	   Login_page.username("babunc58");
	}

	@When("Enter the password")
	public void enter_the_password() {
	   Login_page.password("Chellamuthu4858");
	}

	@When("click the login button")
	public void click_the_login_button() {
	    Login_page.login();
	}

	@Then("redirect to home page")
	public void redirect_to_home_page() {
	   Assert.assertEquals(Login_page.homepage().isDisplayed(), true);
	   Login_page.screenShot("homepage");
	   System.out.println("login success");
	   
	   
	}
}
