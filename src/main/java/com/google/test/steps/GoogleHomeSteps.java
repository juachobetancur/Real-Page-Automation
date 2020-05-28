package com.google.test.steps;

import com.google.test.pageobjects.GoogleHomePageObject;

import net.thucydides.core.annotations.Step;

public class GoogleHomeSteps {

	GoogleHomePageObject googleHomePageObject = new GoogleHomePageObject ();
	
	@Step
	public void openGoogleHomePage() {
		googleHomePageObject.open();

	}
	
	@Step
	public void writeBookName() {
		googleHomePageObject.writeBookName();

	}
	
	@Step
	public void writeBookName2() {
		googleHomePageObject.writeBookName2();

	}
	
	@Step
	public void suggestionList() {
		googleHomePageObject.suggestionList();

	}
	
	@Step
	public void clickOnSuggestionList() {
		googleHomePageObject.clickOnSuggestionList();

	}
	
	@Step
	public void clickButtonGoogleSearch() {
		googleHomePageObject.clickButtonGoogleSearch();

	}
	
	@Step
	public void seeSearchResult() {
		googleHomePageObject.seeSearchResult();

	}
	
	@Step
	public void seeExpectedSearchResult() {
		googleHomePageObject.seeExpectedSearchResult();
	}
	
	@Step
	public void clickButtonBook() {
		googleHomePageObject.clickButtonBook();

	}
	
	@Step
	public void seeBookTitle() {
		googleHomePageObject.seeBookTitle();

	}
	
}
