package com.danielqa.seleniumbdd.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features= {"src/test/resources/features"},
		dryRun=false,
		snippets=SnippetType.CAMELCASE,
		monochrome=true,
		glue={"com.danielqa.seleniumbdd.steps","com.danielqa.seleniumbdd.hooks"}
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
