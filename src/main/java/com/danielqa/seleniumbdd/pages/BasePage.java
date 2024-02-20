package com.danielqa.seleniumbdd.pages;

import org.openqa.selenium.WebDriver;

import com.danielqa.seleniumbdd.utils.DriverManager;

public class BasePage {
	protected WebDriver driver;
	public BasePage() {
		this.driver=DriverManager.getDriver();
	}

}
