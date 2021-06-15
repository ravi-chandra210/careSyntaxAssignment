package com.careSyntax.stepdefs;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-reports"}, features={"src/test/resources/careSyntaxFeatures/careSyntaxTask.feature"}, monochrome=true)

public class careSyntaxRunner {

}
