package com.danielqa.seleniumbdd.hooks;

import com.danielqa.seleniumbdd.utils.DriverManager;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
	public void Setup() {
		DriverManager.getDriver();
		System.out.println("BEFORE HOOK");
	}
	
	@After
	public void tearDown() {
		DriverManager.quitDriver();
		System.out.println("AFTER HOOK");

	}

}
