package com.google.test.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/com/google/test/features/tosearch.feature", 
glue = "com.google.test.stepdefinitions", 
snippets = SnippetType.CAMELCASE)
public class GoogleSearchRunner {

}
