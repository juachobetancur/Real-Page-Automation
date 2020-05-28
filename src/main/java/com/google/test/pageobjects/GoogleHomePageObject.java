package com.google.test.pageobjects;

import static org.junit.Assert.assertThat;

import java.util.List;

import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com")
public class GoogleHomePageObject extends PageObject {

	By txtBoxSearch = By.name("q");
	By btnGoogleSearch = By.name("btnK");
	By txtNameOfTheWind = By.xpath(
			"//div[@class='kno-ecr-pt PZPZlf gsmt i8lZMc EaHP9c']//span[contains(text(),'El nombre del viento')]");
	By txtNameResult = By.xpath("//h3[contains(text(),'The Name of the Wind by Patrick Rothfuss - Goodrea')]");
	By txtBookTitle = By.id("bookTitle");
	By txtSuggestionList = By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbtc']");

	public void writeBookName() {

		getDriver().findElement(txtBoxSearch).sendKeys("The name of the wind");

	}

	public void writeBookName2() {

		getDriver().findElement(txtBoxSearch).sendKeys("The name of the w");

	}

	public void suggestionList() {

		assertThat(getDriver().findElement(txtSuggestionList).isDisplayed(), Matchers.is(true));

	}

	public void clickOnSuggestionList() {

		List<WebElement> list = getDriver().findElements(txtSuggestionList);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getText().equals("the name of the wind")) {
				list.get(i).click();
				break;

			}
		}
	}

	public void clickButtonGoogleSearch() {

		getDriver().findElement(btnGoogleSearch).click();

	}

	public void seeSearchResult() {

		assertThat(getDriver().findElement(txtNameOfTheWind).isDisplayed(), Matchers.is(true));

	}

	public void seeExpectedSearchResult() {

		assertThat(getDriver().findElement(txtNameResult).isDisplayed(), Matchers.is(true));

	}

	public void clickButtonBook() {

		getDriver().findElement(txtNameResult).click();

	}

	public void seeBookTitle() {

		assertThat(getDriver().findElement(txtBookTitle).isDisplayed(), Matchers.is(true));

	}

}
