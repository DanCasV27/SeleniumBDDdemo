package com.danielqa.seleniumbdd.steps;

import org.testng.Assert;

import com.danielqa.seleniumbdd.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginSteps {
	private LoginPage loginPage;
	
	@Given("User navigates to the saucelabs page")
	public void userNavigatesToTheSaucelabsPage() {
		loginPage=new LoginPage();
		loginPage.navigateToLoginPage();
		String actualTitle=loginPage.getTitle();
		String expectedTitle="Swag Labs";
		System.out.println(actualTitle);
		System.out.println(expectedTitle);
		Assert.assertEquals(expectedTitle, actualTitle, "Invalid Title");
		
	}

	/*@When("User enters valid set of username and password")
	public void userEntersValidSetOfUsernameAndPassword() {
		loginPage.enterUsername("standard_user");
		loginPage.enterPassword("secret_sauce");

	}

	@When("User clicks on Login button")
	public void userClicksOnLoginButton() {
		loginPage.clickLoginButton();

	}

	@Then("User gets redirected to marketplace")
	public void userGetsRedirectedToMarketplace() {
		String expectedTitle="Test";
		String actualTitle=loginPage.getTitle();
		Assert.assertEquals("Title does not match",expectedTitle, actualTitle);

	}*/

}
