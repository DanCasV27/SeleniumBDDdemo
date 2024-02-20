package com.danielqa.seleniumbdd.pages;
import org.openqa.selenium.By;


public class LoginPage extends BasePage{
	private By usernameField=By.id("user-name");
	private By passwordField=By.id("password");
	private By loginButton=By.id("login-button");
	
	public void navigateToLoginPage() {
		driver.get("https://www.saucedemo.com/");;
	}
	public void enterUsername(String username) {
		driver.findElement(usernameField).sendKeys(username);
	}
	public void enterPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}
	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}
	public String getTitle() {
		return driver.getTitle();
	}
	
	
	
	
	

}
