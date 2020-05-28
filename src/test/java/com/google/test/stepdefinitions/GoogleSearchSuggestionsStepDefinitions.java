package com.google.test.stepdefinitions;

import com.google.test.steps.GoogleHomeSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GoogleSearchSuggestionsStepDefinitions {
	
	@Steps
	GoogleHomeSteps googleHomeSteps; 
	
	@When("^I type The name of the w into the search field$")
	public void iTypeTheNameOfTheWIntoTheSearchField() {
		googleHomeSteps.writeBookName2();
	}

	@And("^the suggestions list is displayed$")
	public void theSuggestionsListIsDisplayed() {
		googleHomeSteps.suggestionList();
	}

	@And("^I click on the first suggestion in the list$")
	public void iClickOnTheFirstSuggestionInTheList() {
		googleHomeSteps.clickOnSuggestionList();
	}
	
	

}
